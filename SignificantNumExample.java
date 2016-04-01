package jpsteed.professionals.converters;

import java.math.BigDecimal;

import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Example of how to round to a specified number of significant figures.
 * @author John-Paul Steed
 *
 */
public class SignificantNumExample {

	public static void main(String[] args) {
		double inputValue = 27984343.34;
		Unit inputUnit =  Unit.KILOMETER;
		Unit outputUnit = Unit.YARD;
		
		// Save result of conversion.
		double result = LengthConverter.convertLength(inputUnit, outputUnit, inputValue);
		
		// Round to 6 significant numbers example
		BigDecimal bd = toSignificantFigures(BigDecimal.valueOf(result), 6);
		
		System.out.println(bd.toString());  // output as string example
		System.out.println(bd.doubleValue());  // output as double example

	}

	// For rounding to significant numbers
		public static BigDecimal toSignificantFigures(BigDecimal bd, int significantFigures){
		    String s = String.format("%."+significantFigures+"G", bd);
		    BigDecimal result = new BigDecimal(s);
		    return result;
		}
}
