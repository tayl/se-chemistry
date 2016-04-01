package jpsteed.professionals.convertertests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import jpsteed.professionals.converters.ConversionLiterals.Unit;
import jpsteed.professionals.converters.DensityConverter;

/**
 * Test DensityConverter functions in package jpsteed.professionals.converters.
 * Using input values -2e6, -250, 0, 250, and 2e6.
 * @author John-Paul Steed
 * Tested March 31, 2016
 *
 */
public class DensityTest {

	// Test input data.
	double[] testData = {-2e6, -250, 0, 250, 2e6};
	
	// Density Mass Units
	Unit[] denMassUnits = {Unit.OUNCE, Unit.POUND, Unit.GRAM,
			Unit.MILLIGRAM, Unit.KILOGRAM, Unit.METRICTON};
	
	// Density Volume Units
		Unit[] denVolumeUnits = {Unit.CUBFOOT, Unit.GALLON, Unit.CUBCENTIMETER,
				Unit.MILLILITER, Unit.LITER, Unit.CUBMETER};

	// -2,000,000 test
	double[] densityData1 = {
			-2.000000000E+06,	-2.393766200E+08,	-1.997694723E+09,	-1.997694723E+06,	-1.997694723E+09,	-1.997694723E+09,
			-1.671006970E+04,	-2.000000000E+06,	-1.669080900E+07,	-1.669089000E+04,	-1.669080900E+07,	-1.669080900E+07,
			-2.002307920E+03,	-2.396528530E+05,	-2.000000000E+06,	-2.000000000E+03,	-2.000000000E+06,	-2.000000000E+06,
			-2.002307920E+06,	-2.396528530E+08,	-2.000000000E+09,	-2.000000000E+06,	-2.000000000E+09,	-2.000000000E+09,
			-2.002307920E+03,	-2.396528530E+05,	-2.000000000E+06,	-2.000000000E+03,	-2.000000000E+06,	-2.000000000E+06,
			-2.002307920E+03,	-2.396528530E+05,	-2.000000000E+06,	-2.000000000E+03,	-2.000000000E+06,	-2.000000000E+06

	};
	
	// -250 test
	double[] densityData2 = {
			-2.500000000E+02,	-2.992207750E+04,	-2.497118404E+05,	-2.497118404E+02,	-2.497118404E+05,	-2.497118404E+05,
			-2.088758713E+00,	-2.500000000E+02,	-2.086351125E+03,	-2.086361250E+00,	-2.086351125E+03,	-2.086351125E+03,
			-2.502884900E-01,	-2.995660663E+01,	-2.500000000E+02,	-2.500000000E-01,	-2.500000000E+02,	-2.500000000E+02,
			-2.502884900E+02,	-2.995660663E+04,	-2.500000000E+05,	-2.500000000E+02,	-2.500000000E+05,	-2.500000000E+05,
			-2.502884900E-01,	-2.995660663E+01,	-2.500000000E+02,	-2.500000000E-01,	-2.500000000E+02,	-2.500000000E+02,
			-2.502884900E-01,	-2.995660663E+01,	-2.500000000E+02,	-2.500000000E-01,	-2.500000000E+02,	-2.500000000E+02

	};
	
	// 0 test 
	double[] densityData3 = new double[36];
	
	// 250 test
	double[] densityData4 = {
			2.500000000E+02,	2.992207750E+04,	2.497118404E+05,	2.497118404E+02,	2.497118404E+05,	2.497118404E+05,
			2.088758713E+00,	2.500000000E+02,	2.086351125E+03,	2.086361250E+00,	2.086351125E+03,	2.086351125E+03,
			2.502884900E-01,	2.995660663E+01,	2.500000000E+02,	2.500000000E-01,	2.500000000E+02,	2.500000000E+02,
			2.502884900E+02,	2.995660663E+04,	2.500000000E+05,	2.500000000E+02,	2.500000000E+05,	2.500000000E+05,
			2.502884900E-01,	2.995660663E+01,	2.500000000E+02,	2.500000000E-01,	2.500000000E+02,	2.500000000E+02,
			2.502884900E-01,	2.995660663E+01,	2.500000000E+02,	2.500000000E-01,	2.500000000E+02,	2.500000000E+02

	};
	
	// 2,000,000 test
	double[] densityData5 = {
			2.000000000E+06,	2.393766200E+08,	1.997694723E+09,	1.997694723E+06,	1.997694723E+09,	1.997694723E+09,
			1.671006970E+04,	2.000000000E+06,	1.669080900E+07,	1.669089000E+04,	1.669080900E+07,	1.669080900E+07,
			2.002307920E+03,	2.396528530E+05,	2.000000000E+06,	2.000000000E+03,	2.000000000E+06,	2.000000000E+06,
			2.002307920E+06,	2.396528530E+08,	2.000000000E+09,	2.000000000E+06,	2.000000000E+09,	2.000000000E+09,
			2.002307920E+03,	2.396528530E+05,	2.000000000E+06,	2.000000000E+03,	2.000000000E+06,	2.000000000E+06,
			2.002307920E+03,	2.396528530E+05,	2.000000000E+06,	2.000000000E+03,	2.000000000E+06,	2.000000000E+06

	};
	
	double[][] densityData = {densityData1, densityData2, densityData3, densityData4, densityData5};
	
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
					double result = DensityConverter.convertDensity(denMassUnits[j], denVolumeUnits[j], denMassUnits[i], denVolumeUnits[i], testData[m]);
					
					// Round to 10 significant numbers
					BigDecimal bd = toSignificantFigures(BigDecimal.valueOf(result), 10);
					
					// Output to console test info.
					System.out.printf("Function %s/%s to %s/%s using input %.0f \n\t"
							+ "with expected value %f and actual value %f:\n\t\t",
							denMassUnits[j], denVolumeUnits[j], denMassUnits[i], denVolumeUnits[i], testData[m], densityData[m][n], bd.doubleValue());
					
					// Test data
					assertEquals(densityData[m][n], bd.doubleValue(), 1);
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
