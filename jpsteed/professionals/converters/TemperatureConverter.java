package jpsteed.professionals.converters;

import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Temperature conversions. Including fahrenheit, celsius, kelvin.
 * @author John-Paul Steed
 *
 */
public class TemperatureConverter {
	
	/**
	 * Convert celsius to kelvin.
	 * @param tempInput
	 * @return double
	 */
	public static double celsiusToKelvin(double tempInput) {
		return (tempInput + ConversionLiterals.CELSIUSKELVIN);
	}
	
	/**
	 * Convert kelvin to celsius
	 * @param tempInput
	 * @return double
	 */
	public static double kelvinToCelsius(double tempInput) {
		return (tempInput - ConversionLiterals.CELSIUSKELVIN);
	}
	
	/**
	 * Convert celsius to fahrenheit.
	 * @param tempInput
	 * @return double
	 */
	public static double celsiusToFahrenheit(double tempInput) {
		return ((ConversionLiterals.FAHRENHEITCELSIUS1 * tempInput) + ConversionLiterals.FAHRENHEITCELSIUS2);
	}
	
	/**
	 * Convert fahrenheit to celsius.
	 * @param tempInput
	 * @return double
	 */
	public static double fahrenheitToCelsius(double tempInput) {
		return ((tempInput - ConversionLiterals.FAHRENHEITCELSIUS2) / ConversionLiterals.FAHRENHEITCELSIUS1);
	}
	
	/**
	 * Convert kelvin to fahrenheit.
	 * @param tempInput
	 * @return double
	 */
	public static double kelvinToFahrenheit(double tempInput) {
		tempInput = kelvinToCelsius(tempInput);
		return celsiusToFahrenheit(tempInput);
	}
	
	/**
	 * Convert fahrenheit to kelvin.
	 * @param tempInput
	 * @return double.
	 */
	public static double fahrenheitToKelvin(double tempInput) {
		tempInput = fahrenheitToCelsius(tempInput);
		return celsiusToKelvin(tempInput);
	}
	
	/*************************************************************************************/
	
	/**
	 * Convert temperature from input unit to output unit.
	 * Units allowed from Unit data type: KELVIN, CELSIUS, FAHRENHEIT.
	 * @param inputUnit : Unit data type in ConversionLiterals class
	 * @param outputUnit : Unit data type in ConversionLiterals class
	 * @param tempInput : double
	 * @return double
	 */
	public static double convertTemperature(Unit inputUnit, Unit outputUnit, double tempInput) {
		double outputTemperature = 0;
		String choice = inputUnit.toString() + outputUnit.toString();
		
		// Determine conversion function.
		switch(choice) {
		// Celsius conversion
		case "CELSIUSFAHRENHEIT":
			outputTemperature = celsiusToFahrenheit(tempInput);
			break;
		case "CELSIUSKELVIN":
			outputTemperature = celsiusToKelvin(tempInput);
			break;
		// Fahrenheit conversion
		case "FAHRENHEITCELSIUS":
			outputTemperature = fahrenheitToCelsius(tempInput);
			break;
		case "FAHRENHEITKELVIN":
			outputTemperature = fahrenheitToKelvin(tempInput);
			break;
		// Kelvin conversion
		case "KELVINCELSIUS":
			outputTemperature = kelvinToCelsius(tempInput);
			break;
		case "KELVINFAHRENHEIT":
			outputTemperature = kelvinToFahrenheit(tempInput);
			break;
		default:
			//  Return input if the input unit is the same as the output unit.
			outputTemperature = tempInput;
		}
		
		return outputTemperature;
	}
}
