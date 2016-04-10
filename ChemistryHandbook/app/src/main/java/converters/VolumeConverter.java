package converters;

import converters.ConversionLiterals.Unit;

/**
 * Volume conversions. Including cubic meter, cubic cm, cubic mm,
 * 		cubic km, liter, gallon(us), quart(us), cup(us), cubic foot,
 * 		milliliter, kiloliter.
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
	
	/********************************************************************/
	
	/**
	 * Convert volume from input unit to output unit.
	 * Units allowed from Unit data type: CUBMETER, CUBCENTIMETER, CUBMILLIMETER,
	 * CUBKILOMETER, LITER, GALLON, QUART, CUP, CUBFOOT, MILLILITER, KILOLITER.
	 * @param inputUnit : Unit data type in ConversionLiterals class
	 * @param outputUnit : Unit data type in ConversionLiterals class
	 * @param inputVolume : double
	 * @return double
	 */
	public static double convertVolume(Unit inputUnit, Unit outputUnit, double inputVolume) {
		double outputVolume = 0;
		String choice = inputUnit.toString() + outputUnit.toString();
		
		// Determine conversion function.
		switch(choice) {
		// Cubic Meter conversion
		case "CUBMETERCUBCENTIMETER":
			outputVolume = cubicMeterToCenti(inputVolume);
			break;
		case "CUBMETERCUBMILLIMETER":
			outputVolume = cubicMeterToMilli(inputVolume);
			break;
		case "CUBMETERCUBKILOMETER":
			outputVolume = cubicMeterToKilo(inputVolume);
			break;
		case "CUBMETERLITER":
			outputVolume = cubicMeterToLiter(inputVolume);
			break;
		case "CUBMETERGALLON":
			outputVolume = cubicMeterToGallon(inputVolume);
			break;
		case "CUBMETERQUART":
			outputVolume = cubicMeterToQuart(inputVolume);
			break;
		case "CUBMETERCUP":
			outputVolume = cubicMeterToCup(inputVolume);
			break;
		case "CUBMETERCUBFOOT":
			outputVolume = cubicMeterToFeet(inputVolume);
			break;
		case "CUBMETERMILLILITER":
			outputVolume = cubicMeterToMilliliter(inputVolume);
			break;
		case "CUBMETERKILOLITER":
			outputVolume = cubicMeterToKiloliter(inputVolume);
			break;
		// Cubic Centimeter conversion
		case "CUBCENTIMETERCUBMETER":
			outputVolume = cubicCentiToMeter(inputVolume);
			break;
		case "CUBCENTIMETERCUBMILLIMETER":
			outputVolume = cubicCentiToMilli(inputVolume);
			break;
		case "CUBCENTIMETERCUBKILOMETER":
			outputVolume = cubicCentiToKilo(inputVolume);
			break;
		case "CUBCENTIMETERLITER":
			outputVolume = cubicCentiToLiter(inputVolume);
			break;
		case "CUBCENTIMETERGALLON":
			outputVolume = cubicCentiToGallon(inputVolume);
			break;
		case "CUBCENTIMETERQUART":
			outputVolume = cubicCentiToQuart(inputVolume);
			break;
		case "CUBCENTIMETERCUP":
			outputVolume = cubicCentiToCup(inputVolume);
			break;
		case "CUBCENTIMETERCUBFOOT":
			outputVolume = cubicCentiToFeet(inputVolume);
			break;
		case "CUBCENTIMETERMILLILITER":
			outputVolume = cubicCentiToMilliliter(inputVolume);
			break;
		case "CUBCENTIMETERKILOLITER":
			outputVolume = cubicCentiToKiloliter(inputVolume);
			break;
		// Cubic Millimeter conversion
		case "CUBMILLIMETERCUBMETER":
			outputVolume = cubicMilliToMeter(inputVolume);
			break;
		case "CUBMILLIMETERCUBCENTIMETER":
			outputVolume = cubicMilliToCenti(inputVolume);
			break;
		case "CUBMILLIMETERCUBKILOMETER":
			outputVolume = cubicMilliToKilo(inputVolume);
			break;
		case "CUBMILLIMETERLITER":
			outputVolume = cubicMilliToLiter(inputVolume);
			break;
		case "CUBMILLIMETERGALLON":
			outputVolume = cubicMilliToGallon(inputVolume);
			break;
		case "CUBMILLIMETERQUART":
			outputVolume = cubicMilliToQuart(inputVolume);
			break;
		case "CUBMILLIMETERCUP":
			outputVolume = cubicMilliToCup(inputVolume);
			break;
		case "CUBMILLIMETERCUBFOOT":
			outputVolume = cubicMilliToFeet(inputVolume);
			break;
		case "CUBMILLIMETERMILLILITER":
			outputVolume = cubicMilliToMilliliter(inputVolume);
			break;
		case "CUBMILLIMETERKILOLITER":
			outputVolume = cubicMilliToKiloliter(inputVolume);
			break;
		// Cubic Kilometer conversion
		case "CUBKILOMETERCUBMETER":
			outputVolume = cubicKiloToMeter(inputVolume);
			break;
		case "CUBKILOMETERCUBCENTIMETER":
			outputVolume = cubicKiloToCenti(inputVolume);
			break;
		case "CUBKILOMETERCUBMILLIMETER":
			outputVolume = cubicKiloToMilli(inputVolume);
			break;
		case "CUBKILOMETERLITER":
			outputVolume = cubicKiloToLiter(inputVolume);
			break;
		case "CUBKILOMETERGALLON":
			outputVolume = cubicKiloToGallon(inputVolume);
			break;
		case "CUBKILOMETERQUART":
			outputVolume = cubicKiloToQuart(inputVolume);
			break;
		case "CUBKILOMETERCUP":
			outputVolume = cubicKiloToCup(inputVolume);
			break;
		case "CUBKILOMETERCUBFOOT":
			outputVolume = cubicKiloToFeet(inputVolume);
			break;
		case "CUBKILOMETERMILLILITER":
			outputVolume = cubicKiloToMilliliter(inputVolume);
			break;
		case "CUBKILOMETERKILOLITER":
			outputVolume = cubicKiloToKiloliter(inputVolume);
			break;
		// Liter conversion
		case "LITERCUBMETER":
			outputVolume = literToCubicMeter(inputVolume);
			break;
		case "LITERCUBCENTIMETER":
			outputVolume = literToCubicCenti(inputVolume);
			break;
		case "LITERCUBMILLIMETER":
			outputVolume = literToCubicMilli(inputVolume);
			break;
		case "LITERCUBKILOMETER":
			outputVolume = literToCubicKilo(inputVolume);
			break;
		case "LITERGALLON":
			outputVolume = literToGallon(inputVolume);
			break;
		case "LITERQUART":
			outputVolume = literToQuart(inputVolume);
			break;
		case "LITERCUP":
			outputVolume = literToCup(inputVolume);
			break;
		case "LITERCUBFOOT":
			outputVolume = literToCubicFeet(inputVolume);
			break;
		case "LITERMILLILITER":
			outputVolume = literToMilliliter(inputVolume);
			break;
		case "LITERKILOLITER":
			outputVolume = literToKiloliter(inputVolume);
			break;
		// Gallon conversion
		case "GALLONCUBMETER":
			outputVolume = gallonToCubicMeter(inputVolume);
			break;
		case "GALLONCUBCENTIMETER":
			outputVolume = gallonToCubicCenti(inputVolume);
			break;
		case "GALLONCUBMILLIMETER":
			outputVolume = gallonToCubicMilli(inputVolume);
			break;
		case "GALLONCUBKILOMETER":
			outputVolume = gallonToCubicKilo(inputVolume);
			break;
		case "GALLONLITER":
			outputVolume = gallonToLiter(inputVolume);
			break;
		case "GALLONQUART":
			outputVolume = gallonToQuart(inputVolume);
			break;
		case "GALLONCUP":
			outputVolume = gallonToCup(inputVolume);
			break;
		case "GALLONCUBFOOT":
			outputVolume = gallonToCubicFeet(inputVolume);
			break;
		case "GALLONMILLILITER":
			outputVolume = gallonToMilliliter(inputVolume);
			break;
		case "GALLONKILOLITER":
			outputVolume = gallonToKiloliter(inputVolume);
			break;
		// Quart conversion
		case "QUARTCUBMETER":
			outputVolume = quartToCubicMeter(inputVolume);
			break;
		case "QUARTCUBCENTIMETER":
			outputVolume = quartToCubicCenti(inputVolume);
			break;
		case "QUARTCUBMILLIMETER":
			outputVolume = quartToCubicMilli(inputVolume);
			break;
		case "QUARTCUBKILOMETER":
			outputVolume = quartToCubicKilo(inputVolume);
			break;
		case "QUARTLITER":
			outputVolume = quartToLiter(inputVolume);
			break;
		case "QUARTGALLON":
			outputVolume = quartsToGallon(inputVolume);
			break;
		case "QUARTCUP":
			outputVolume = quartToCup(inputVolume);
			break;
		case "QUARTCUBFOOT":
			outputVolume = quartToCubicFeet(inputVolume);
			break;
		case "QUARTMILLILITER":
			outputVolume = quartToMilliliter(inputVolume);
			break;
		case "QUARTKILOLITER":
			outputVolume = quartToKiloliter(inputVolume);
			break;
		// Cup conversion
		case "CUPCUBMETER":
			outputVolume = cupsToCubicMeter(inputVolume);
			break;
		case "CUPCUBCENTIMETER":
			outputVolume = cupsToCubicCenti(inputVolume);
			break;
		case "CUPCUBMILLIMETER":
			outputVolume = cupsToCubicMilli(inputVolume);
			break;
		case "CUPCUBKILOMETER":
			outputVolume = cupsToCubicKilo(inputVolume);
			break;
		case "CUPLITER":
			outputVolume = cupsToLiter(inputVolume);
			break;
		case "CUPGALLON":
			outputVolume = cupsToGallon(inputVolume);
			break;
		case "CUPQUART":
			outputVolume = cupsToQuart(inputVolume);
			break;
		case "CUPCUBFOOT":
			outputVolume = cupsToCubicFeet(inputVolume);
			break;
		case "CUPMILLILITER":
			outputVolume = cupsToMilliliter(inputVolume);
			break;
		case "CUPKILOLITER":
			outputVolume = cupsToKiloliter(inputVolume);
			break;
		// Cubic Foot conversion
		case "CUBFOOTCUBMETER":
			outputVolume = cubicFeetToMeter(inputVolume);
			break;
		case "CUBFOOTCUBCENTIMETER":
			outputVolume = cubicFeetToCenti(inputVolume);
			break;
		case "CUBFOOTCUBMILLIMETER":
			outputVolume = cubicFeetToMilli(inputVolume);
			break;
		case "CUBFOOTCUBKILOMETER":
			outputVolume = cubicFeetToKilo(inputVolume);
			break;
		case "CUBFOOTLITER":
			outputVolume = cubicFeetToLiter(inputVolume);
			break;
		case "CUBFOOTGALLON":
			outputVolume = cubicFeetToGallon(inputVolume);
			break;
		case "CUBFOOTQUART":
			outputVolume = cubicFeetToQuart(inputVolume);
			break;
		case "CUBFOOTCUP":
			outputVolume = cubicFeetToCup(inputVolume);
			break;
		case "CUBFOOTMILLILITER":
			outputVolume = cubicFeetToMilliliter(inputVolume);
			break;
		case "CUBFOOTKILOLITER":
			outputVolume = cubicFeetToKiloliter(inputVolume);
			break;
		// Milliliter conversion
		case "MILLILITERCUBMETER":
			outputVolume = milliliterToCubicMeter(inputVolume);
			break;
		case "MILLILITERCUBCENTIMETER":
			outputVolume = milliliterToCubicCenti(inputVolume);
			break;
		case "MILLILITERCUBMILLIMETER":
			outputVolume = milliliterToCubicMilli(inputVolume);
			break;
		case "MILLILITERCUBKILOMETER":
			outputVolume = milliliterToCubicKilo(inputVolume);
			break;
		case "MILLILITERLITER":
			outputVolume = milliliterToLiter(inputVolume);
			break;
		case "MILLILITERGALLON":
			outputVolume = milliliterToGallon(inputVolume);
			break;
		case "MILLILITERQUART":
			outputVolume = milliliterToQuart(inputVolume);
			break;
		case "MILLILITERCUP":
			outputVolume = milliliterToCup(inputVolume);
			break;
		case "MILLILITERCUBFOOT":
			outputVolume = milliliterToCubicFeet(inputVolume);
			break;
		case "MILLILITERKILOLITER":
			outputVolume = milliliterToKiloliter(inputVolume);
			break;
		// Kiloliter conversion
		case "KILOLITERCUBMETER":
			outputVolume = kiloliterToCubicMeter(inputVolume);
			break;
		case "KILOLITERCUBCENTIMETER":
			outputVolume = kiloliterToCubicCenti(inputVolume);
			break;
		case "KILOLITERCUBMILLIMETER":
			outputVolume = kiloliterToCubicMilli(inputVolume);
			break;
		case "KILOLITERCUBKILOMETER":
			outputVolume = kiloliterToCubicKilo(inputVolume);
			break;
		case "KILOLITERLITER":
			outputVolume = kiloliterToLiter(inputVolume);
			break;
		case "KILOLITERGALLON":
			outputVolume = kiloliterToGallon(inputVolume);
			break;
		case "KILOLITERQUART":
			outputVolume = kiloliterToQuart(inputVolume);
			break;
		case "KILOLITERCUP":
			outputVolume = kiloliterToCup(inputVolume);
			break;
		case "KILOLITERCUBFOOT":
			outputVolume = kiloliterToCubicFeet(inputVolume);
			break;
		case "KILOLITERMILLILITER":
			outputVolume = kiloliterToMilliliter(inputVolume);
			break;
		default:
			//  Return input if the input unit is the same as the output unit.
			outputVolume = inputVolume;
		}
		
		return outputVolume;
	}
}
