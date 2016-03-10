package jpsteed.professionals.converters;

import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Pressure conversions. Including atmosphere, torr, kilopascal,
 * 		pascal, mm of mercury, pounds per square inch.
 * @author John-Paul Steed
 *
 */
public class PressureConverter {

	/***************Basic Conversions**************************/
	
	/**
	 * Convert pascal to kilopascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double pascalToKilopascal(double inputPressure) {
		return (inputPressure / ConversionLiterals.KILO);
	}
	
	/**
	 * Convert kilopascal to pascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double kilopascalToPascal(double inputPressure) {
		return (inputPressure * ConversionLiterals.KILO);
	}
	
	/**
	 * Convert pascal to atmosphere.
	 * @param inputPressure
	 * @return double
	 */
	public static double pascalToAtmosphere(double inputPressure) {
		return (inputPressure / ConversionLiterals.PASCALATMOSPHERE);
	}
	
	/**
	 * Convert atmosphere to pascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double atmosphereToPascal(double inputPressure) {
		return (inputPressure * ConversionLiterals.PASCALATMOSPHERE);
	}
	
	/**
	 * Convert pascal to torr.
	 * @param inputPressure
	 * @return double
	 */
	public static double pascalToTorr(double inputPressure) {
		return (inputPressure / ConversionLiterals.PASCALTORR);
	}
	
	/**
	 * Convert torr to pascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double torrToPascal(double inputPressure) {
		return (inputPressure * ConversionLiterals.PASCALTORR);
	}
	
	/**
	 * Convert pascal to pounds per square inch.
	 * @param inputPressure
	 * @return double
	 */
	public static double pascalToPSI(double inputPressure) {
		return (inputPressure / ConversionLiterals.PASCALPERPSI);
	}
	
	/**
	 * Convert pounds per square inch to pascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double psiToPascal(double inputPressure) {
		return (inputPressure * ConversionLiterals.PASCALPERPSI);
	}
	
	/**
	 * Convert pascal to millimeters of mercury.
	 * @param inputPressure
	 * @return double
	 */
	public static double pascalToMilliMercury(double inputPressure) {
		return (inputPressure / ConversionLiterals.PASCALMMMERCURY);
	}
	
	/**
	 * Convert millimeters of mercury to pascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double milliMercuryToPascal(double inputPressure) {
		return (inputPressure * ConversionLiterals.PASCALMMMERCURY);
	}
	
	/***************Advanced Conversions***********************/
	
	/***************Kilopascal Conversions**************************/
	
	/**
	 * Convert kilopascal to atmosphere.
	 * @param inputPressure
	 * @return double
	 */
	public static double kilopascalToAtmosphere(double inputPressure) {
		inputPressure = kilopascalToPascal(inputPressure);
		return  pascalToAtmosphere(inputPressure);
	}
	
	/**
	 * Convert kilopascal to torr.
	 * @param inputPressure
	 * @return double
	 */
	public static double kilopascalToTorr(double inputPressure) {
		inputPressure = kilopascalToPascal(inputPressure);
		return  pascalToTorr(inputPressure);
	}
	
	/**
	 * Convert kilopascal to pounds per square inch.
	 * @param inputPressure
	 * @return double
	 */
	public static double kilopascalToPSI(double inputPressure) {
		inputPressure = kilopascalToPascal(inputPressure);
		return  pascalToPSI(inputPressure);
	}
	
	/**
	 * Convert kilopascal to millimeters of mercury.
	 * @param inputPressure
	 * @return double
	 */
	public static double kilopascalToMilliMercury(double inputPressure) {
		inputPressure = kilopascalToPascal(inputPressure);
		return  pascalToMilliMercury(inputPressure);
	}
	
	/***************Atmosphere Conversions**************************/
	
	/**
	 * Convert atmosphere to kilopascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double atmosphereToKilopascal(double inputPressure) {
		inputPressure = atmosphereToPascal(inputPressure);
		return  pascalToKilopascal(inputPressure);
	}
	
	/**
	 * Convert atmosphere to torr.
	 * @param inputPressure
	 * @return double
	 */
	public static double atmosphereToTorr(double inputPressure) {
		inputPressure = atmosphereToPascal(inputPressure);
		return  pascalToTorr(inputPressure);
	}
	
	/**
	 * Convert atmosphere to pounds per square inch.
	 * @param inputPressure
	 * @return double
	 */
	public static double atmosphereToPSI(double inputPressure) {
		inputPressure = atmosphereToPascal(inputPressure);
		return  pascalToPSI(inputPressure);
	}
	
	/**
	 * Convert atmosphere to millimeters of mercury.
	 * @param inputPressure
	 * @return double
	 */
	public static double atmosphereToMilliMercury(double inputPressure) {
		inputPressure = atmosphereToPascal(inputPressure);
		return  pascalToMilliMercury(inputPressure);
	}
	
	/***************Torr Conversions**************************/
	
	/**
	 * Convert torr to kilopascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double torrToKilopascal(double inputPressure) {
		inputPressure = torrToPascal(inputPressure);
		return  pascalToKilopascal(inputPressure);
	}
	
	/**
	 * Convert torr to atmosphere.
	 * @param inputPressure
	 * @return double
	 */
	public static double torrToAtmosphere(double inputPressure) {
		inputPressure = torrToPascal(inputPressure);
		return  pascalToAtmosphere(inputPressure);
	}
	
	/**
	 * Convert torr to pounds per square inch.
	 * @param inputPressure
	 * @return double
	 */
	public static double torrToPSI(double inputPressure) {
		inputPressure = torrToPascal(inputPressure);
		return  pascalToPSI(inputPressure);
	}
	
	/**
	 * Convert torr to millimeters of mercury.
	 * @param inputPressure
	 * @return double
	 */
	public static double torrToMilliMercury(double inputPressure) {
		inputPressure = torrToPascal(inputPressure);
		return  pascalToMilliMercury(inputPressure);
	}
	
	/***************PSI Conversions**************************/
	
	/**
	 * Convert pounds per square inch to kilopascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double psiToKilopascal(double inputPressure) {
		inputPressure = psiToPascal(inputPressure);
		return  pascalToKilopascal(inputPressure);
	}
	
	/**
	 * Convert pounds per square inch to atmosphere.
	 * @param inputPressure
	 * @return double
	 */
	public static double psiToAtmosphere(double inputPressure) {
		inputPressure = psiToPascal(inputPressure);
		return  pascalToAtmosphere(inputPressure);
	}
	
	/**
	 * Convert pounds per square inch to torr.
	 * @param inputPressure
	 * @return double
	 */
	public static double psiToTorr(double inputPressure) {
		inputPressure = psiToPascal(inputPressure);
		return  pascalToTorr(inputPressure);
	}
	
	/**
	 * Convert pounds per square inch to millimeters of mercury.
	 * @param inputPressure
	 * @return double
	 */
	public static double psiToMilliMercury(double inputPressure) {
		inputPressure = psiToPascal(inputPressure);
		return  pascalToMilliMercury(inputPressure);
	}
	
	/***************mmHg Conversions**************************/
	
	/**
	 * Convert millimeters of mercury to kilopascal.
	 * @param inputPressure
	 * @return double
	 */
	public static double milliMercuryToKilopascal(double inputPressure) {
		inputPressure = milliMercuryToPascal(inputPressure);
		return  pascalToKilopascal(inputPressure);
	}
	
	/**
	 * Convert millimeters of mercury to atmosphere.
	 * @param inputPressure
	 * @return double
	 */
	public static double milliMercuryToAtmosphere(double inputPressure) {
		inputPressure = milliMercuryToPascal(inputPressure);
		return  pascalToAtmosphere(inputPressure);
	}
	
	/**
	 * Convert millimeters of mercury to torr.
	 * @param inputPressure
	 * @return double
	 */
	public static double milliMercuryToTorr(double inputPressure) {
		inputPressure = milliMercuryToPascal(inputPressure);
		return  pascalToTorr(inputPressure);
	}
	
	/**
	 * Convert millimeters of mercury to pounds per square inch.
	 * @param inputPressure
	 * @return double
	 */
	public static double milliMercuryToPSI(double inputPressure) {
		inputPressure = milliMercuryToPascal(inputPressure);
		return  pascalToPSI(inputPressure);
	}
	
	/**********************************************************/
	
	/**
	 * Convert pressure from input unit to output unit.
	 * @param inputUnit : Unit data type in ConversionLiterals class
	 * @param outputUnit : Unit data type in ConversionLiterals class
	 * @param inputPressure : double
	 * @return
	 */
	public static double convertPressure(Unit inputUnit, Unit outputUnit, double inputPressure) {
		double outputPressure = 0;
		String choice = inputUnit.toString() + outputUnit.toString();
		
		// Determine conversion function.
		switch(choice) {
		// Pascal conversion
		case "PASCALKILOPASCAL":
			outputPressure = pascalToKilopascal(inputPressure);
			break;
		case "PASCALATMOSPHERE":
			outputPressure = pascalToAtmosphere(inputPressure);
			break;
		case "PASCALTORR":
			outputPressure = pascalToTorr(inputPressure);
			break;
		case "PASCALPOUNDSSQINCH":
			outputPressure = pascalToPSI(inputPressure);
			break;
		case "PASCALMILLIMERCURY":
			outputPressure = pascalToMilliMercury(inputPressure);
			break;
		// Kilopascal conversion
		case "KILOPASCALPASCAL":
			outputPressure = kilopascalToPascal(inputPressure);
			break;
		case "KILOPASCALATMOSPHERE":
			outputPressure = kilopascalToAtmosphere(inputPressure);
			break;
		case "KILOPASCALTORR":
			outputPressure = kilopascalToTorr(inputPressure);
			break;
		case "KILOPASCALPOUNDSSQINCH":
			outputPressure = kilopascalToPSI(inputPressure);
			break;
		case "KILOPASCALMILLIMERCURY":
			outputPressure = kilopascalToMilliMercury(inputPressure);
			break;
		// Atmosphere conversion
		case "ATMOSPHEREPASCAL":
			outputPressure = atmosphereToPascal(inputPressure);
			break;
		case "ATMOSPHEREKILOPASCAL":
			outputPressure = atmosphereToKilopascal(inputPressure);
			break;
		case "ATMOSPHERETORR":
			outputPressure = atmosphereToTorr(inputPressure);
			break;
		case "ATMOSPHEREPOUNDSSQINCH":
			outputPressure = atmosphereToPSI(inputPressure);
			break;
		case "ATMOSPHEREMILLIMERCURY":
			outputPressure = atmosphereToMilliMercury(inputPressure);
			break;
		// Torr conversion
		case "TORRPASCAL":
			outputPressure = torrToPascal(inputPressure);
			break;
		case "TORRKILOPASCAL":
			outputPressure = torrToKilopascal(inputPressure);
			break;
		case "TORRATMOSPHERE":
			outputPressure = torrToAtmosphere(inputPressure);
			break;
		case "TORRPOUNDSSQINCH":
			outputPressure = torrToPSI(inputPressure);
			break;
		case "TORRMILLIMERCURY":
			outputPressure = torrToMilliMercury(inputPressure);
			break;
		// Pounds per square inch conversion
		case "POUNDSSQINCHPASCAL":
			outputPressure = psiToPascal(inputPressure);
			break;
		case "POUNDSSQINCHKILOPASCAL":
			outputPressure = psiToKilopascal(inputPressure);
			break;
		case "POUNDSSQINCHATMOSPHERE":
			outputPressure = psiToAtmosphere(inputPressure);
			break;
		case "POUNDSSQINCHTORR":
			outputPressure = psiToTorr(inputPressure);
			break;
		case "POUNDSSQINCHMILLIMERCURY":
			outputPressure = psiToMilliMercury(inputPressure);
			break;
		// Millimeters of mercury conversion
		case "MILLIMERCURYPASCAL":
			outputPressure = milliMercuryToPascal(inputPressure);
			break;
		case "MILLIMERCURYKILOPASCAL":
			outputPressure = milliMercuryToKilopascal(inputPressure);
			break;
		case "MILLIMERCURYATMOSPHERE":
			outputPressure = milliMercuryToAtmosphere(inputPressure);
			break;
		case "MILLIMERCURYTORR":
			outputPressure = milliMercuryToTorr(inputPressure);
			break;
		case "MILLIMERCURYPOUNDSSQINCH":
			outputPressure = milliMercuryToPSI(inputPressure);
			break;
		default:
			//  Return input if the input unit is the same as the output unit.
			outputPressure = inputPressure;
		}
		
		return outputPressure;
	}
	
}
