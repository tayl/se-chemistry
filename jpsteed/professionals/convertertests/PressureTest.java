package jpsteed.professionals.convertertests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import jpsteed.professionals.converters.PressureConverter;
import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Test PressureConverter functions in package jpsteed.professionals.converters.
 * Using input values -2e6, -250, 0, 250, and 2e6.
 * @author John-Paul Steed
 * Tested March 31, 2016
 *
 */
public class PressureTest {

	// Test input data.
	double[] testData = {-2e6, -250, 0, 250, 2e6};
	
	// Pressure Units
	Unit[] pressureUnits = {Unit.ATMOSPHERE, Unit.TORR, Unit.PASCAL,
			Unit.KILOPASCAL, Unit.MILLIMERCURY, Unit.POUNDSSQINCH};

	// -2,000,000 test
	double[] pressureData1 = {
			-2.000000000E+06,	-2.631578947E+03,	-1.973846533E+01,	-1.973846533E+04,	-2.631600000E+03,	-1.360919278E+05,
			-1.519999788E+09,	-2.000000000E+06,	-1.500123156E+04,	-1.500123156E+07,	-2.000000000E+06,	-1.034298913E+08,
			-2.026500000E+11,	-2.666447748E+08,	-2.000000000E+06,	-2.000000000E+09,	-2.666447740E+08,	-1.378952000E+10,
			-2.026500000E+08,	-2.666447748E+05,	-2.000000000E+03,	-2.000000000E+06,	-2.666447740E+05,	-1.378952000E+07,
			-1.519999788E+09,	-2.000000000E+06,	-1.500123156E+04,	-1.500123156E+07,	-2.000000000E+06,	-1.034298913E+08,
			-2.939188600E+07,	-3.867354940E+04,	-2.900754755E+02,	-2.900754755E+05,	-3.867340000E+04,	-2.000000000E+06

	};
	
	// -250 test
	double[] pressureData2 = {
			-2.500000000E+02,	-3.289473684E-01,	-2.467308166E-03,	-2.467308166E+00,	-3.289500000E-01,	-1.701149098E+01,
			-1.899999735E+05,	-2.500000000E+02,	-1.875153945E+00,	-1.875153945E+03,	-2.500000000E+02,	-1.292873641E+04,
			-2.533125000E+07,	-3.333059685E+04,	-2.500000000E+02,	-2.500000000E+05,	-3.333059675E+04,	-1.723690000E+06,
			-2.533125000E+04,	-3.333059685E+01,	-2.500000000E-01,	-2.500000000E+02,	-3.333059675E+01,	-1.723690000E+03,
			-1.899999735E+05,	-2.500000000E+02,	-1.875153945E+00,	-1.875153945E+03,	-2.500000000E+02,	-1.292873641E+04,
			-3.673985750E+03,	-4.834193675E+00,	-3.625943444E-02,	-3.625943444E+01,	-4.834175000E+00,	-2.500000000E+02

	};
	
	// 0 test 
	double[] pressureData3 = new double[36];
	
	// 250 test
	double[] pressureData4 = {
			2.500000000E+02,	3.289473684E-01,	2.467308166E-03,	2.467308166E+00,	3.289500000E-01,	1.701149098E+01,
			1.899999735E+05,	2.500000000E+02,	1.875153945E+00,	1.875153945E+03,	2.500000000E+02,	1.292873641E+04,
			2.533125000E+07,	3.333059685E+04,	2.500000000E+02,	2.500000000E+05,	3.333059675E+04,	1.723690000E+06,
			2.533125000E+04,	3.333059685E+01,	2.500000000E-01,	2.500000000E+02,	3.333059675E+01,	1.723690000E+03,
			1.899999735E+05,	2.500000000E+02,	1.875153945E+00,	1.875153945E+03,	2.500000000E+02,	1.292873641E+04,
			3.673985750E+03,	4.834193675E+00,	3.625943444E-02,	3.625943444E+01,	4.834175000E+00,	2.500000000E+02

	};
	
	// 2,000,000 test
	double[] pressureData5 = {
			2.000000000E+06,	2.631578947E+03,	1.973846533E+01,	1.973846533E+04,	2.631600000E+03,	1.360919278E+05,
			1.519999788E+09,	2.000000000E+06,	1.500123156E+04,	1.500123156E+07,	2.000000000E+06,	1.034298913E+08,
			2.026500000E+11,	2.666447748E+08,	2.000000000E+06,	2.000000000E+09,	2.666447740E+08,	1.378952000E+10,
			2.026500000E+08,	2.666447748E+05,	2.000000000E+03,	2.000000000E+06,	2.666447740E+05,	1.378952000E+07,
			1.519999788E+09,	2.000000000E+06,	1.500123156E+04,	1.500123156E+07,	2.000000000E+06,	1.034298913E+08,
			2.939188600E+07,	3.867354940E+04,	2.900754755E+02,	2.900754755E+05,	3.867340000E+04,	2.000000000E+06

	};
	
	double[][] pressureData = {pressureData1, pressureData2, pressureData3, pressureData4, pressureData5};
	
	@Test
	public void testPressureFunctions() {
		
		// Iterate for each input test data.
		for(int m = 0; m < 5; m++) {
			int n = 0; // index of table
			// Iterate for each column.
			for(int i = 0; i < 6; i++){
				// Iterate for each row
				for(int j = 0; j < 6; j++) {
					// Get converted value.
					double result = PressureConverter.convertPressure(pressureUnits[j], pressureUnits[i], testData[m]);
					
					// Round to 10 significant numbers
					BigDecimal bd = toSignificantFigures(BigDecimal.valueOf(result), 10);
					
					// Output to console test info.
					System.out.printf("Function %s to %s using input %.0f \n\t"
							+ "with expected value %f and actual value %f:\n\t\t",
							pressureUnits[j], pressureUnits[i], testData[m], pressureData[m][n], bd.doubleValue());
					
					// Test data
					assertEquals(pressureData[m][n], bd.doubleValue(), 1);
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
