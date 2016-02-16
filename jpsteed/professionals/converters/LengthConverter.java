package jpsteed.professionals.converters;

/**
 * Length Converter. Includes: inches, feet, yards, miles,
 * 		picometer, nanometer, micrometer, millimeter, centimeter,
 * 		decimeter, meter, kilometer, megameter, gigameter.
 * @author John
 *
 */
public class LengthConverter {
	
	/*************Basic Conversions*****************************/
	
	/**
	 * Convert feet to miles.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToMiles(double inputLength) {
		return (inputLength / ConversionLiterals.FEETPERMILE);
	}
	
	/**
	 * Convert miles to feet. 
	 * @param inputLength
	 * @return double
	 */
	public static double milesToFeet(double inputLength) {
		return (inputLength * ConversionLiterals.FEETPERMILE);
	}
	
	/**
	 * Convert inch to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double inchesToFeet(double inputLength) {
		return (inputLength / ConversionLiterals.INCHESPERFOOT);
	}
	
	/**
	 * Convert feet to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToInches(double inputLength) {
		return (inputLength * ConversionLiterals.INCHESPERFOOT);
	}
	
	/**
	 * Convert feet to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToYard(double inputLength) {
		return (inputLength / ConversionLiterals.FEETPERYARD);
	}
	
	/**
	 * Convert yard to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToFeet(double inputLength) {
		return (inputLength * ConversionLiterals.FEETPERYARD);
	}
	
	/**
	 * Convert feet to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToMeter(double inputLength){
		return (inputLength / ConversionLiterals.FEETPERMETER);
	}
	
	/**
	 * Convert meter to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToFeet(double inputLength) {
		return (inputLength * ConversionLiterals.FEETPERMETER);
	}
	
	/**
	 * Convert meter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToPico(double inputLength) {
		return (inputLength / ConversionLiterals.PICO);
	}
	
	/**
	 * Convert picometer to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.PICO);
	}
	
	/**
	 * Convert meter to nanometer
	 * @param inputLength
	 * @return double
	 */
	public static double meterToNano(double inputLength) {
		return (inputLength / ConversionLiterals.NANO);
	}
	
	/**
	 * Convert nanometer to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.NANO);
	}
	
	/**
	 * Convert meter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToMicro(double inputLength) {
		return (inputLength / ConversionLiterals.MICRO);
	}
	
	/**
	 * Convert micrometer to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.MICRO);
	}
	
	/**
	 * Convert meter to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToMilli(double inputLength) {
		return (inputLength / ConversionLiterals.MILLI);
	}
	
	/**
	 * Convert millimeter to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.MILLI);
	}
	
	/**
	 * Convert meter to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToCenti(double inputLength) {
		return (inputLength / ConversionLiterals.CENTI);
	}
	
	/**
	 * Convert to 
	 * @param inputLength
	 * @return double
	 */
	public static double centiToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.CENTI);
	}
	
	/**
	 * Convert meter to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToDeci(double inputLength) {
		return (inputLength / ConversionLiterals.DECI);
	}
	
	/**
	 * Convert decimeter to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.DECI);
	}
	
	/**
	 * Convert meter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToKilo(double inputLength) {
		return (inputLength / ConversionLiterals.KILO);
	}
	
	/**
	 * Convert kilometer to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.KILO);
	}
	
	/**
	 * Convert meter to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToMega(double inputLength) {
		return (inputLength / ConversionLiterals.MEGA);
	}
	
	/**
	 * Convert megameter to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.MEGA);
	}
	
	/**
	 * Convert meter to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToGiga(double inputLength) {
		return (inputLength / ConversionLiterals.GIGA);
	}
	
	/**
	 * Convert gigameter to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToMeter(double inputLength) {
		return (inputLength * ConversionLiterals.GIGA);
	}
	
	/**************Advanced Conversions*************************/
	
	/***************Inch conversions****************************/
	
	/**
	 * Convert inch to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToMeter(double inputLength) {
		inputLength = inchesToFeet(inputLength);
		return feetToMeter(inputLength);
	}
	
	/**
	 * Convert inch to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToPicoMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert inch to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToNanoMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert inch to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToMicroMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert inch to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToMilliMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert inch to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToCentiMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert inch to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToDeciMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert inch to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToKiloMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert inch to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToMegaMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert inch to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToGigaMeter(double inputLength) {
		inputLength = inchToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/**
	 * Convert inch to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToMile(double inputLength) {
		inputLength = inchesToFeet(inputLength);
		return feetToMiles(inputLength);
	}
	
	/**
	 * Convert inch to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double inchToYard(double inputLength) {
		inputLength = inchesToFeet(inputLength);
		return feetToYard(inputLength);
	}
	
	/*****************Feet conversions*****************************/
	
	/**
	 * Convert feet to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToPicoMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert feet to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToNanoMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert feet to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToMicroMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert feet to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToMilliMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert feet to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToCentiMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert feet to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToDeciMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert feet to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToKiloMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert feet to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double feetToMegaMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert feet to gigameter. 
	 * @param inputLength
	 * @return double
	 */
	public static double feetToGigaMeter(double inputLength) {
		inputLength = feetToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/*****************Mile conversions*************************/
	
	/**
	 * Convert mile to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToInch(double inputLength) {
		inputLength = milesToFeet(inputLength);
		return feetToInches(inputLength);
	}
	
	/**
	 * Convert mile to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToYard(double inputLength) {
		inputLength = milesToFeet(inputLength);
		return feetToYard(inputLength);
	}
	
	/**
	 * Convert mile to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToMeter(double inputLength) {
		inputLength = milesToFeet(inputLength);
		return feetToMeter(inputLength);
	}
	
	/**
	 * Convert mile to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToPicoMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert mile to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToNanoMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert mile to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToMicroMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert mile to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToMilliMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert mile to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToCentiMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert mile to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToDeciMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert mile to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToKiloMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert mile to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToMegaMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert mile to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double mileToGigaMeter(double inputLength) {
		inputLength = mileToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/*******************Yard Conversions*******************************/
	
	/**
	 * Convert yard to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToInch(double inputLength) {
		inputLength = yardToFeet(inputLength);
		return feetToInches(inputLength);
	}
	
	/**
	 * Convert yard to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToMile(double inputLength) {
		inputLength = yardToFeet(inputLength);
		return feetToMiles(inputLength);
	}
	
	/**
	 * Convert yard to meter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToMeter(double inputLength) {
		inputLength = yardToFeet(inputLength);
		return feetToMeter(inputLength);
	}
	
	/**
	 * Convert yard to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToPico(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert yard to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToNano(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert yard to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToMicro(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert yard to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToMilli(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert yard to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToCenti(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert yard to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToDeci(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert yard to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToKilo(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert yard to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToMega(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert yard to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double yardToGiga(double inputLength) {
		inputLength = yardToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/*****************Meter Conversion********************************/
	
	/**
	 * Convert meter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToInch(double inputLength) {
		inputLength = meterToFeet(inputLength);
		return feetToInches(inputLength);
	}
	
	/**
	 * Convert meter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToYard(double inputLength) {
		inputLength = meterToFeet(inputLength);
		return feetToYard(inputLength);
	}
	
	/**
	 * Convert meter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double meterToMile(double inputLength) {
		inputLength = meterToFeet(inputLength);
		return feetToMiles(inputLength);
	}
	
	/*******************Pico conversions******************************/
	
	/**
	 * Convert picometer to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToInch(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert picometer to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToFeet(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert picometer to yard. 
	 * @param inputLength
	 * @return double
	 */
	public static double picoToYard(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert picometer to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToMile(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert picometer to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToNano(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert picometer to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToMicro(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert picometer to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToMilli(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert picometer to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToCenti(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert picometer to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToDeci(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert picometer to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToKilo(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert picometer to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToMega(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert picometer to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double picoToGiga(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	
	/*********************Nano Conversions***************************/
	
	/**
	 * Convert nanometer to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToInch(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert nanometer to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToFeet(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert nanometer to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToYard(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert nanometer to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToMile(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert nanometer to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToPico(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert nanometer to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToMicro(double inputLength) {
		inputLength = picoToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert nanometer to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToMilli(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert nanometer to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToCenti(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert nanometer to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToDeci(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert nanometer to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToKilo(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert nanometer to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToMega(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert nanometer to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double nanoToGiga(double inputLength) {
		inputLength = nanoToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/**************************Micro Conversions*********************/
	
	/**
	 * Convert micrometer to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double microToInch(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert micrometer to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double microToFeet(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert micrometer to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double microToYard(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert micrometer to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double microToMile(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert micrometer to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double microToPico(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert micrometer to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double microToNano(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert micrometer to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToMilli(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert micrometer to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToCenti(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert micrometer to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToDeci(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert micrometer to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double microToKilo(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert micrometer to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToMega(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert micrometer to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double microToGiga(double inputLength) {
		inputLength = microToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/****************Milli Conversions******************************/
	
	/**
	 * Convert millimeter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToInch(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert millimeter to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToFeet(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert millimeter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToYard(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert millimeter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToMile(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert millimeter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToPico(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert millimeter to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToNano(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert millimeter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToMicro(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert millimeter to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToCenti(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert millimeter to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToDeci(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert millimeter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToKilo(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert millimeter to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToMega(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert millimeter to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double milliToGiga(double inputLength) {
		inputLength = milliToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/************************Centi Conversions************************/
	
	/**
	 * Convert centimeter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToInch(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert centimeter to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToFeet(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert centimeter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToYard(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert centimeter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToMile(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert centimeter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToPico(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert centimeter to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToNano(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert centimeter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToMicro(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert centimeter to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToMilli(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert centimeter to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToDeci(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert centimeter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToKilo(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert centimeter to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToMega(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert centimeter to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double centiToGiga(double inputLength) {
		inputLength = centiToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/**********************Deci Conversions**************************/
	
	/**
	 * Convert decimeter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToInch(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert decimeter to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToFeet(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert decimeter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToYard(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert decimeter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToMile(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert decimeter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToPico(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert decimeter to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToNano(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert decimeter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToMicro(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert decimeter to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToMilli(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert decimeter to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToCenti(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert decimeter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToKilo(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert decimeter to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToMega(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert decimeter to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double deciToGiga(double inputLength) {
		inputLength = deciToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/*******************Kilo Conversions*******************************/
	
	/**
	 * Convert kilometer to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToInch(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert kilometer to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToFeet(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert kilometer to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToYard(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert kilometer to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToMile(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert kilometer to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToPico(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert kilometer to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToNano(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert kilometer to micrometer. 
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToMicro(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert kilometer to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToMilli(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert kilometer to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToCenti(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert kilometer to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToDeci(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert kilometer to megameter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToMega(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	/**
	 * Convert kilometer to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double kiloToGiga(double inputLength) {
		inputLength = kiloToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/********************Mega Conversions******************************/
	
	/**
	 * Convert megameter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToInch(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert megameter to feet.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToFeet(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert megameter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToYard(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert megameter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToMile(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert megameter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToPico(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert megameter to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToNano(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert megameter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToMicro(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert megameter to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToMilli(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert megameter to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToCenti(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert megameter to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToDeci(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert megameter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToKilo(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert megameter to gigameter.
	 * @param inputLength
	 * @return double
	 */
	public static double megaToGiga(double inputLength) {
		inputLength = megaToMeter(inputLength);
		return meterToGiga(inputLength);
	}
	
	/********************Giga Conversions**************************/
	
	/**
	 * Convert gigameter to inch.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToInch(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToInch(inputLength);
	}
	
	/**
	 * Convert gigameter to feet. 
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToFeet(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToFeet(inputLength);
	}
	
	/**
	 * Convert gigameter to yard.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToYard(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToYard(inputLength);
	}
	
	/**
	 * Convert gigameter to mile.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToMile(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToMile(inputLength);
	}
	
	/**
	 * Convert gigameter to picometer.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToPico(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToPico(inputLength);
	}
	
	/**
	 * Convert gigameter to nanometer.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToNano(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToNano(inputLength);
	}
	
	/**
	 * Convert gigameter to micrometer.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToMicro(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToMicro(inputLength);
	}
	
	/**
	 * Convert gigameter to millimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToMilli(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToMilli(inputLength);
	}
	
	/**
	 * Convert gigameter to centimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToCenti(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToCenti(inputLength);
	}
	
	/**
	 * Convert gigameter to decimeter.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToDeci(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToDeci(inputLength);
	}
	
	/**
	 * Convert gigameter to kilometer.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToKilo(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToKilo(inputLength);
	}
	
	/**
	 * Convert gigameter to Megametr.
	 * @param inputLength
	 * @return double
	 */
	public static double gigaToMega(double inputLength) {
		inputLength = gigaToMeter(inputLength);
		return meterToMega(inputLength);
	}
	
	
}
