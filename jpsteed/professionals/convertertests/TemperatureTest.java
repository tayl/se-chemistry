package jpsteed.professionals.convertertests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import jpsteed.professionals.converters.TemperatureConverter;
import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Test TemperatureConverter functions in package jpsteed.professionals.converters.
 * Using input values -2e6, -250, 0, 250, and 2e6.
 * @author John-Paul Steed
 * Tested March 31, 2016
 *
 */
public class TemperatureTest {

	// Test input data.
	double[] testData = {-2e6, -250, 0, 250, 2e6};
	
	// Temperature Units
	Unit[] temperatureUnits = {Unit.KELVIN, Unit.CELSIUS, Unit.FAHRENHEIT};

	// -2,000,000 test
	double[] temperatureData1 = {
			-2.000000000E+06,	-1.999726850E+06,	-1.110855739E+06,
			-2.000273150E+06,	-2.000000000E+06,	-1.111128889E+06,
			-3.600459670E+06,	-3.599968000E+06,	-2.000000000E+06

	};
	
	// -250 test
	double[] temperatureData2 = {
			-2.500000000E+02,	2.315000000E+01,	1.164830000E+02,
			-5.231500000E+02,	-2.500000000E+02,	-1.566670000E+02,
			-9.096700000E+02,	-4.180000000E+02,	-2.500000000E+02

	};
	
	// 0 test 
	double[] temperatureData3 = {
			0, 273.15, 255.372,
			-273.15, 0, -17.778,
			-459.67, 32, 0
	};
	
	// 250 test
	double[] temperatureData4 = {
			2.500000000E+02,	5.231500000E+02,	3.942610000E+02,
			-2.315000000E+01,	2.500000000E+02,	1.211110000E+02,
			-9.670000000E+00,	4.820000000E+02,	2.500000000E+02
	};
	
	// 2,000,000 test
	double[] temperatureData5 = {
			2.000000000E+06,	2.000273150E+06,	1.111366483E+06,
			1.999726850E+06,	2.000000000E+06,	1.111093333E+06,
			3.599540330E+06,	3.600032000E+06,	2.000000000E+06

	};
	
	double[][] temperatureData = {temperatureData1, temperatureData2, temperatureData3, temperatureData4, temperatureData5};
	
	@Test
	public void testTemperatureFunctions() {
		
		// Iterate for each input test data.
		for(int m = 0; m < 5; m++) {
			int n = 0; // index of table
			// Iterate for each column.
			for(int i = 0; i < 3; i++){
				// Iterate for each row
				for(int j = 0; j < 3; j++) {
					// Get converted value.
					double result = TemperatureConverter.convertTemperature(temperatureUnits[j], temperatureUnits[i], testData[m]);
					
					// Round to 10 significant numbers
					BigDecimal bd = toSignificantFigures(BigDecimal.valueOf(result), 10);
					
					// Output to console test info.
					System.out.printf("Function %s to %s using input %.0f \n\t"
							+ "with expected value %f and actual value %f:\n\t\t",
							temperatureUnits[j], temperatureUnits[i], testData[m], temperatureData[m][n], bd.doubleValue());
					
					// Test data
					assertEquals(temperatureData[m][n], bd.doubleValue(), 1);
					System.out.println("passed.");
					
					n++;
				}
			}
		}
	}
	
	// For rounding to significant numbers
	public static BigDecimal toSignificantFigures(BigDecimal bd, int significantFigures){
	    String s = String.format("%."+significantFigures+"G", bd);
	    BigDecimal result = new BigDecimal(s);
	    return result;
	}

}
