package jpsteed.professionals.convertertests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import jpsteed.professionals.converters.ConversionLiterals.Unit;
import jpsteed.professionals.converters.MassConverter;

/**
 * Test MassConverter functions in package jpsteed.professionals.converters.
 * Using input values -2e6, -250, 0, 250, and 2e6.
 * @author John-Paul Steed
 * Tested March 31, 2016
 *
 */
public class MassTest {

	// Test input data.
	double[] testData = {-2e6, -250, 0, 250, 2e6};
	
	// Mass Units
	Unit[] massUnits = {Unit.OUNCE, Unit.POUND, Unit.ATOMICMASSUNIT,
			Unit.GRAM, Unit.MILLIGRAM, Unit.KILOGRAM, Unit.METRICTON};

	// -2,000,000 test
	double[] massData1 = {
			-2.000000000E+06,	-3.200000000E+07,	-1.171476600E-19,	-7.054792390E+04,	-7.054792390E+01,	-7.054792390E+07,	-7.054792390E+10,
			-1.249999994E+05,	-2.000000000E+06,	-7.321728000E-21,	-4.409245244E+03,	-4.409245244E+00,	-4.409245244E+06,	-4.409245244E+09,
			-3.414496675E+31,	-5.463194680E+32,	-2.000000000E+06,	-1.204428258E+30,	-1.204428258E+27,	-1.204428258E+33,	-1.204428258E+36,
			-5.669904625E+07,	-9.071847400E+08,	-3.321080000E-18,	-2.000000000E+06,	-2.000000000E+03,	-2.000000000E+09,	-2.000000000E+12,
			-5.669904625E+10,	-9.071847400E+11,	-3.321080000E-15,	-2.000000000E+09,	-2.000000000E+06,	-2.000000000E+12,	-2.000000000E+15,
			-5.669904625E+04,	-9.071847400E+05,	-3.321080000E-21,	-2.000000000E+03,	-2.000000000E+00,	-2.000000000E+06,	-2.000000000E+09,
			-5.669904625E+01,	-9.071847400E+02,	-3.321080000E-24,	-2.000000000E+00,	-2.000000000E-03,	-2.000000000E+03,	-2.000000000E+06

	};
	
	// -250 test
	double[] massData2 = {
			-2.500000000E+02,	-4.000000000E+03,	-1.464345750E-23,	-8.818490488E+00,	-8.818490488E-03,	-8.818490488E+03,	-8.818490488E+06,
			-1.562499993E+01,	-2.500000000E+02,	-9.152160000E-25,	-5.511556555E-01,	-5.511556555E-04,	-5.511556555E+02,	-5.511556555E+05,
			-4.268120844E+27,	-6.828993351E+28,	-2.500000000E+02,	-1.505535322E+26,	-1.505535323E+23,	-1.505535322E+29,	-1.505535323E+32,
			-7.087380781E+03,	-1.133980925E+05,	-4.151350000E-22,	-2.500000000E+02,	-2.500000000E-01,	-2.500000000E+05,	-2.500000000E+08,
			-7.087380781E+06,	-1.133980925E+08,	-4.151350000E-19,	-2.500000000E+05,	-2.500000000E+02,	-2.500000000E+08,	-2.500000000E+11,
			-7.087380781E+00,	-1.133980925E+02,	-4.151350000E-25,	-2.500000000E-01,	-2.500000000E-04,	-2.500000000E+02,	-2.500000000E+05,
			-7.087380781E-03,	-1.133980925E-01,	-4.151350000E-28,	-2.500000000E-04,	-2.500000000E-07,	-2.500000000E-01,	-2.500000000E+02
	
	};
	
	// 0 test 
	double[] massData3 = new double[49];
	
	// 250 test
	double[] massData4 = {
			2.500000000E+02,	4.000000000E+03,	1.464345750E-23,	8.818490488E+00,	8.818490488E-03,	8.818490488E+03,	8.818490488E+06,
			1.562499993E+01,	2.500000000E+02,	9.152160000E-25,	5.511556555E-01,	5.511556555E-04,	5.511556555E+02,	5.511556555E+05,
			4.268120844E+27,	6.828993351E+28,	2.500000000E+02,	1.505535322E+26,	1.505535323E+23,	1.505535322E+29,	1.505535323E+32,
			7.087380781E+03,	1.133980925E+05,	4.151350000E-22,	2.500000000E+02,	2.500000000E-01,	2.500000000E+05,	2.500000000E+08,
			7.087380781E+06,	1.133980925E+08,	4.151350000E-19,	2.500000000E+05,	2.500000000E+02,	2.500000000E+08,	2.500000000E+11,
			7.087380781E+00,	1.133980925E+02,	4.151350000E-25,	2.500000000E-01,	2.500000000E-04,	2.500000000E+02,	2.500000000E+05,
			7.087380781E-03,	1.133980925E-01,	4.151350000E-28,	2.500000000E-04,	2.500000000E-07,	2.500000000E-01,	2.500000000E+02
	
	};
	
	// 2,000,000 test
	double[] massData5 = {
			2.000000000E+06,	3.200000000E+07,	1.171476600E-19,	7.054792390E+04,	7.054792390E+01,	7.054792390E+07,	7.054792390E+10,
			1.249999994E+05,	2.000000000E+06,	7.321728000E-21,	4.409245244E+03,	4.409245244E+00,	4.409245244E+06,	4.409245244E+09,
			3.414496675E+31,	5.463194680E+32,	2.000000000E+06,	1.204428258E+30,	1.204428258E+27,	1.204428258E+33,	1.204428258E+36,
			5.669904625E+07,	9.071847400E+08,	3.321080000E-18,	2.000000000E+06,	2.000000000E+03,	2.000000000E+09,	2.000000000E+12,
			5.669904625E+10,	9.071847400E+11,	3.321080000E-15,	2.000000000E+09,	2.000000000E+06,	2.000000000E+12,	2.000000000E+15,
			5.669904625E+04,	9.071847400E+05,	3.321080000E-21,	2.000000000E+03,	2.000000000E+00,	2.000000000E+06,	2.000000000E+09,
			5.669904625E+01,	9.071847400E+02,	3.321080000E-24,	2.000000000E+00,	2.000000000E-03,	2.000000000E+03,	2.000000000E+06

	};
	
	double[][] massData = {massData1, massData2, massData3, massData4, massData5};
	
	@Test
	public void testMassFunctions() {
		
		// Iterate for each input test data.
		for(int m = 0; m < 5; m++) {
			int n = 0; // index of table
			// Iterate for each column.
			for(int i = 0; i < 7; i++){
				// Iterate for each row
				for(int j = 0; j < 7; j++) {
					// Get converted value.
					double result = MassConverter.convertMass(massUnits[j], massUnits[i], testData[m]);
					
					// Round to 10 significant numbers
					BigDecimal bd = toSignificantFigures(BigDecimal.valueOf(result), 10);
					
					// Output to console test info.
					System.out.printf("Function %s to %s using input %.0f \n\t"
							+ "with expected value %f and actual value %f:\n\t\t",
							massUnits[j], massUnits[i], testData[m], massData[m][n], bd.doubleValue());
					
					// Test data
					assertEquals( massData[m][n], bd.doubleValue(), 1);
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
