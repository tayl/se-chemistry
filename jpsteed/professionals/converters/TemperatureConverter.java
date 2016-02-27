package jpsteed.professionals.converters;

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

}
