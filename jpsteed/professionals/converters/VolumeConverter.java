package jpsteed.professionals.converters;

/**
 * Volume conversions. Including cubic meter, cubic cm, cubic mm,
 * 		cubic km, liter, gallon(us), quart(us), cup(us), cubic foot.
 * @author John-Paul Steed
 *
 */
public class VolumeConverter {

	/******************Basic Conversions**************************/
	
	/**
	 * Convert cubic meter to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToCenti(double inputVolume) {
		return (inputVolume / Math.pow(ConversionLiterals.CENTI, 3));
	}
	
	/**
	 * Convert cubic centimeter to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToMeter(double inputVolume) {
		return (inputVolume * Math.pow(ConversionLiterals.CENTI, 3));
	}
	
	/**
	 * Convert cubic meter to cubic millimeter
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToMilli(double inputVolume) {
		return (inputVolume / Math.pow(ConversionLiterals.MILLI, 3));
	}
	
	/**
	 * Convert cubic millimeter to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToMeter(double inputVolume) {
		return (inputVolume * Math.pow(ConversionLiterals.MILLI, 3));
	}
	
	/**
	 * Convert cubic meter to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToKilo(double inputVolume) {
		return (inputVolume / Math.pow(ConversionLiterals.KILO, 3));
	}
	
	/**
	 * Convert cubic kilometer to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToMeter(double inputVolume) {
		return (inputVolume * Math.pow(ConversionLiterals.KILO, 3));
	}
	
	/**
	 * Convert cubic meter to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToLiter(double inputVolume) {
		return (inputVolume * ConversionLiterals.LITERSPERCUBICMETER);
	}
	
	/**
	 * Convert liter to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCubicMeter(double inputVolume) {
		return (inputVolume / ConversionLiterals.LITERSPERCUBICMETER);
	}
	
	/**
	 * Convert cubic meter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToGallon(double inputVolume) {
		return (inputVolume * ConversionLiterals.GALLONSPERCUBICMETER);
	}
	
	/**
	 * Convert gallon to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToCubicMeter(double inputVolume) {
		return (inputVolume / ConversionLiterals.GALLONSPERCUBICMETER);
	}
	
	/**
	 * Convert gallon to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToQuart(double inputVolume) {
		return (inputVolume * ConversionLiterals.QUARTSPERGALLON);
	}
	
	/**
	 * Convert quart to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartsToGallon(double inputVolume) {
		return (inputVolume / ConversionLiterals.QUARTSPERGALLON);
	}
	
	/**
	 * Convert gallon to cup.
	 * @param inputVolume
	 * @return
	 */
	public static double gallonToCup(double inputVolume) {
		return (inputVolume * ConversionLiterals.CUPSPERGALLON);
	}
	
	/**
	 * Convert cup to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToGallon(double inputVolume) {
		return (inputVolume / ConversionLiterals.CUPSPERGALLON);
	}
	
	/**
	 * Convert cubic meter to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToFeet(double inputVolume) {
		return (inputVolume * ConversionLiterals.CUBICFOOTPERCUBICMETER);
	}
	
	/**
	 * Convert cubic feet to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToMeter(double inputVolume) {
		return (inputVolume / ConversionLiterals.CUBICFOOTPERCUBICMETER);
	}
	
	/**
	 * Convert liter to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToMilliliter(double inputVolume) {
		return (inputVolume / ConversionLiterals.MILLI);
	}
	
	/**
	 * Convert milliliter to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToLiter(double inputVolume) {
		return (inputVolume * ConversionLiterals.MILLI);
	}
	
	/**
	 * Convert liter to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToKiloliter(double inputVolume) {
		return (inputVolume / ConversionLiterals.KILO);
	}
	
	/**
	 * Convert kiloliter to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToLiter(double inputVolume) {
		return (inputVolume * ConversionLiterals.KILO);
	}
	
	/**********************Advanced Conversions**************************/
	
	/*********************Cubic Meter Conversions************************/
	
	/**
	 * Convert cubic meter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToQuart(double inputVolume) {
		inputVolume = cubicMeterToGallon(inputVolume);
		return gallonToQuart(inputVolume);
	}
	
	/**
	 * Convert cubic meter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToCup(double inputVolume) {
		inputVolume = cubicMeterToGallon(inputVolume);
		return gallonToCup(inputVolume);
	}
	
	/**
	 * Convert cubic meter to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToMilliliter(double inputVolume) {
		inputVolume = cubicMeterToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert cubic meter to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMeterToKiloliter(double inputVolume) {
		inputVolume = cubicMeterToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/*****************Cubic Centimeter Conversions******************/
	
	/**
	 * Convert cubic centimeter to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToMilli(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToKilo(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToLiter(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToGallon(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToGallon(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToQuart(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToQuart(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToCup(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToCup(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToFeet(double inputVolume) {
		inputVolume = cubicCentiToMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToMilliliter(double inputVolume) {
		inputVolume = cubicCentiToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert cubic centimeter to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicCentiToKiloliter(double inputVolume) {
		inputVolume = cubicCentiToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/*****************Cubic Millimeter Conversions***************************/
	
	/**
	 * Convert cubic millimeter to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToCenti(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToKilo(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToLiter(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToGallon(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToGallon(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToQuart(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToQuart(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToCup(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToCup(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToFeet(double inputVolume) {
		inputVolume = cubicMilliToMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToMilliliter(double inputVolume) {
		inputVolume = cubicMilliToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert cubic millimeter to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicMilliToKiloliter(double inputVolume) {
		inputVolume = cubicMilliToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/********************Cubic Kilometer Conversions*****************/
	
	/**
	 * Convert cubic kilometer to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToCenti(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToMilli(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToLiter(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToGallon(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToGallon(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToQuart(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToQuart(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToCup(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToCup(inputVolume);
	}
	
	/**
	 * Convert cubic kilometer to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToFeet(double inputVolume) {
		inputVolume = cubicKiloToMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert to cubic kilometer to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToMilliliter(double inputVolume) {
		inputVolume = cubicKiloToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert to cubic kilometer to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicKiloToKiloliter(double inputVolume) {
		inputVolume = cubicKiloToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/********************Liter Conversions*****************/
	
	/**
	 * Convert liter to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCubicCenti(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert liter to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCubicMilli(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert liter to  cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCubicKilo(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert liter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToGallon(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToGallon(inputVolume);
	}
	
	/**
	 * Convert liter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToQuart(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToQuart(inputVolume);
	}
	
	/**
	 * Convert liter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCup(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToCup(inputVolume);
	}
	
	/**
	 * Convert liter to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double literToCubicFeet(double inputVolume) {
		inputVolume = literToCubicMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/********************Gallon Conversions*****************/
	
	/**
	 * Convert gallon to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToCubicCenti(double inputVolume) {
		inputVolume = gallonToCubicMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert gallon to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToCubicMilli(double inputVolume) {
		inputVolume = gallonToCubicMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert gallon to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToCubicKilo(double inputVolume) {
		inputVolume = gallonToCubicMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert gallon to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToLiter(double inputVolume) {
		inputVolume = gallonToCubicMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert gallon to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToCubicFeet(double inputVolume) {
		inputVolume = gallonToCubicMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert gallon to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToMilliliter(double inputVolume) {
		inputVolume = gallonToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert gallon to kiloliter
	 * @param inputVolume
	 * @return double
	 */
	public static double gallonToKiloliter(double inputVolume) {
		inputVolume = gallonToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/********************Quart Conversions*****************/
	
	/**
	 * Convert quart to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCubicMeter(double inputVolume) {
		inputVolume = quartsToGallon(inputVolume);
		return gallonToCubicMeter(inputVolume);
	}
	
	/**
	 * Convert quart to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCubicCenti(double inputVolume) {
		inputVolume = quartToCubicMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert quart to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCubicMilli(double inputVolume) {
		inputVolume = quartToCubicMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert quart to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCubicKilo(double inputVolume) {
		inputVolume = quartToCubicMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert quart to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToLiter(double inputVolume) {
		inputVolume = quartToCubicMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert quart to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCup(double inputVolume) {
		inputVolume = quartsToGallon(inputVolume);
		return gallonToCup(inputVolume);
	}
	
	/**
	 * Convert quart to  cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToCubicFeet(double inputVolume) {
		inputVolume = quartToCubicMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert quart to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToMilliliter(double inputVolume) {
		inputVolume = quartToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert quart to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double quartToKiloliter(double inputVolume) {
		inputVolume = quartToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/********************Cup Conversions*****************/
	
	/**
	 * Convert cup to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToCubicMeter(double inputVolume) {
		inputVolume = cupsToGallon(inputVolume);
		return gallonToCubicMeter(inputVolume);
	}
	
	/**
	 * Convert cup to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToCubicCenti(double inputVolume) {
		inputVolume = cupsToCubicMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert cup to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToCubicMilli(double inputVolume) {
		inputVolume = cupsToCubicMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert cup to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToCubicKilo(double inputVolume) {
		inputVolume = cupsToCubicMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert cup to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToLiter(double inputVolume) {
		inputVolume = cupsToCubicMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert cup to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToQuart(double inputVolume) {
		inputVolume = cupsToGallon(inputVolume);
		return gallonToQuart(inputVolume);
	}
	
	/**
	 * Convert cup to cubic feet.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToCubicFeet(double inputVolume) {
		inputVolume = cupsToCubicMeter(inputVolume);
		return cubicMeterToFeet(inputVolume);
	}
	
	/**
	 * Convert cup to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToMilliliter(double inputVolume) {
		inputVolume = cupsToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert cup to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cupsToKiloliter(double inputVolume) {
		inputVolume = cupsToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/********************Cubic Foot Conversions*****************/
	
	/**
	 * Convert cubic feet to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToCenti(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToCenti(inputVolume);
	}
	
	/**
	 * Convert cubic feet to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToMilli(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToMilli(inputVolume);
	}
	
	/**
	 * Convert cubic feet to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToKilo(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToKilo(inputVolume);
	}
	
	/**
	 * Convert cubic feet to liter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToLiter(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToLiter(inputVolume);
	}
	
	/**
	 * Convert cubic feet to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToGallon(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToGallon(inputVolume);
	}
	
	/**
	 * Convert cubic feet to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToQuart(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToQuart(inputVolume);
	}
	
	/**
	 * Convert cubic feet to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToCup(double inputVolume) {
		inputVolume = cubicFeetToMeter(inputVolume);
		return cubicMeterToCup(inputVolume);
	}
	
	/**
	 * Convert cubic feet to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToMilliliter(double inputVolume) {
		inputVolume = cubicFeetToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
	
	/**
	 * Convert cubic feet to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double cubicFeetToKiloliter(double inputVolume) {
		inputVolume = cubicFeetToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	/*************************Milliliter Conversions****************/
	
	/**
	 * Convert milliliter to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToCubicMeter(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCubicMeter(inputVolume);
	}
	
	/**
	 * Convert milliliter to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToCubicCenti(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCubicCenti(inputVolume);
	}
	
	/**
	 * Convert milliliter to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 * 
	 */
	public static double milliliterToCubicMilli(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCubicMilli(inputVolume);
	}
	
	/**
	 * Convert milliliter to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToCubicKilo(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCubicKilo(inputVolume);
	}
	
	/**
	 * Convert milliliter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToGallon(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToGallon(inputVolume);
	}
	
	/**
	 * Convert milliliter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToQuart(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToQuart(inputVolume);
	}
	
	/**
	 * Convert milliliter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToCup(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCup(inputVolume);
	}
	
	/**
	 * Convert milliliter to cubic foot.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToCubicFeet(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToCubicFeet(inputVolume);
	}
	
	/**
	 * Convert milliliter to kiloliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double milliliterToKiloliter(double inputVolume) {
		inputVolume = milliliterToLiter(inputVolume);
		return literToKiloliter(inputVolume);
	}
	
	
	/*************************Kiloliter Conversions****************/
	
	/**
	 * Convert kiloliter to cubic meter.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCubicMeter(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCubicMeter(inputVolume);
	}
	
	/**
	 * Convert kiloliter to cubic centimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCubicCenti(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCubicCenti(inputVolume);
	}
	
	/**
	 * Convert kiloliter to cubic millimeter.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCubicMilli(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCubicMilli(inputVolume);
	}
	
	/**
	 * Convert kiloliter to cubic kilometer.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCubicKilo(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCubicKilo(inputVolume);
	}
	
	/**
	 * Convert kiloliter to gallon.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToGallon(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToGallon(inputVolume);
	}
	
	/**
	 * Convert kiloliter to quart.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToQuart(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToQuart(inputVolume);
	}
	
	/**
	 * Convert kiloliter to cup.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCup(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCup(inputVolume);
	}
	
	/**
	 * Convert kiloliter to cubic foot.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToCubicFeet(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToCubicFeet(inputVolume);
	}
	
	/**
	 * Convert kiloliter to milliliter.
	 * @param inputVolume
	 * @return double
	 */
	public static double kiloliterToMilliliter(double inputVolume) {
		inputVolume = kiloliterToLiter(inputVolume);
		return literToMilliliter(inputVolume);
	}
}