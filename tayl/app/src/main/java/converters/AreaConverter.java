package converters;

import converters.ConversionLiterals.Unit;

/**
 * Area conversions. Including acre, hectacre, square meter,
 * square cm, square mm, square km, square mile, sq inch,
 * square ft, square yard.
 *
 * @author John-Paul Steed
 */
public class AreaConverter {

    /**************Basic Conversions****************************/

    /**
     * Convert square meter to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareMillimeter(double inputArea) {
        return (inputArea / Math.pow(ConversionLiterals.MILLI, 2));
    }

    /**
     * Convert square millimeter to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareMeter(double inputArea) {
        return (inputArea * Math.pow(ConversionLiterals.MILLI, 2));
    }

    /**
     * Convert square meter to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareCentimeter(double inputArea) {
        return (inputArea / Math.pow(ConversionLiterals.CENTI, 2));
    }

    /**
     * Convert square centimeter to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareMeter(double inputArea) {
        return (inputArea * Math.pow(ConversionLiterals.CENTI, 2));
    }

    /**
     * Convert square meter to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareKilometer(double inputArea) {
        return (inputArea / Math.pow(ConversionLiterals.KILO, 2));
    }

    /**
     * Convert square kilometer to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareMeter(double inputArea) {
        return (inputArea * Math.pow(ConversionLiterals.KILO, 2));
    }

    /**
     * Convert hectare to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareKilometer(double inputArea) {
        return (inputArea / ConversionLiterals.HECTARESQKILOMETER);
    }

    /**
     * Convert square kilometer to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToHectare(double inputArea) {
        return (inputArea * ConversionLiterals.HECTARESQKILOMETER);
    }

    /**
     * Convert square foot to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareMeter(double inputArea) {
        return (inputArea / ConversionLiterals.SQFOOTSQMETER);
    }

    /**
     * Convert square meter to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareFoot(double inputArea) {
        return (inputArea * ConversionLiterals.SQFOOTSQMETER);
    }

    /**
     * Convert square foot to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareInch(double inputArea) {
        return (inputArea * ConversionLiterals.SQINCHSQFOOT);
    }

    /**
     * Convert square inch to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareFoot(double inputArea) {
        return (inputArea / ConversionLiterals.SQINCHSQFOOT);
    }

    /**
     * Convert square foot to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareYard(double inputArea) {
        return (inputArea / ConversionLiterals.SQFOOTSQYARD);
    }

    /**
     * Convert square yard to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareFoot(double inputArea) {
        return (inputArea * ConversionLiterals.SQFOOTSQYARD);
    }

    /**
     * Convert acre to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareYard(double inputArea) {
        return (inputArea * ConversionLiterals.SQYARDPERACRE);
    }

    /**
     * Convert square yard to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToAcre(double inputArea) {
        return (inputArea / ConversionLiterals.SQYARDPERACRE);
    }

    /**
     * Convert acre to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareMile(double inputArea) {
        return (inputArea / ConversionLiterals.ACRESQMILE);
    }

    /**
     * Convert square mile to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToAcre(double inputArea) {
        return (inputArea * ConversionLiterals.ACRESQMILE);
    }

    /*******************Advanced Conversions*****************************/

    /******************Sq Meter Conversions*****************************/

    /**
     * Convert square meter to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToHectare(double inputArea) {
        inputArea = squareMeterToSquareKilometer(inputArea);
        return squareKilometerToHectare(inputArea);
    }

    /**
     * Convert square meter to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareInch(double inputArea) {
        inputArea = squareMeterToSquareFoot(inputArea);
        return squareFootToSquareInch(inputArea);
    }

    /**
     * Convert square meter to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareYard(double inputArea) {
        inputArea = squareMeterToSquareFoot(inputArea);
        return squareFootToSquareYard(inputArea);
    }

    /**
     * Convert square meter to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToAcre(double inputArea) {
        inputArea = squareMeterToSquareYard(inputArea);
        return squareYardToAcre(inputArea);
    }

    /**
     * Convert square meter to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMeterToSquareMile(double inputArea) {
        inputArea = squareMeterToAcre(inputArea);
        return acreToSquareMile(inputArea);
    }


    /******************Sq Millimeter Conversions*****************************/

    /**
     * Convert square millimeter to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareCentimeter(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square millimeter to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareKilometer(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square millimeter to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToHectare(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square millimeter to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareInch(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert square millimeter to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareFoot(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**
     * Convert square millimeter to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareYard(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }

    /**
     * Convert square millimeter to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToSquareMile(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert square millimeter to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMillimeterToAcre(double inputArea) {
        inputArea = squareMillimeterToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Sq Centimeter Conversions*****************************/

    /**
     * Convert square centimeter to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareMillimeter(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square centimeter to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareKilometer(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square centimeter to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToHectare(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square centimeter to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareInch(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert square centimeter to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareFoot(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**
     * Convert square centimeter to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareYard(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }

    /**
     * Convert square centimeter to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToSquareMile(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert square centimeter to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareCentimeterToAcre(double inputArea) {
        inputArea = squareCentimeterToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Sq Kilometer Conversions*****************************/

    /**
     * Convert square kilometer to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareMillimeter(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square kilometer to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareCentimeter(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square kilometer to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareInch(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert square kilometer to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareFoot(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**
     * Convert square kilometer to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareYard(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }

    /**
     * Convert square kilometer to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToSquareMile(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert square kilometer to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareKilometerToAcre(double inputArea) {
        inputArea = squareKilometerToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Hectare Conversions*****************************/

    /**
     * Convert hectare to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareMeter(double inputArea) {
        inputArea = hectareToSquareKilometer(inputArea);
        return squareKilometerToSquareMeter(inputArea);
    }

    /**
     * Convert hectare to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareMillimeter(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert hectare to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareCentimeter(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert hectare to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareInch(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert hectare to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareFoot(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**
     * Convert hectare to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareYard(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }

    /**
     * Convert hectare to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToSquareMile(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert hectare to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double hectareToAcre(double inputArea) {
        inputArea = hectareToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Sq Inch Conversions*****************************/

    /**
     * Convert square inch to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareMeter(double inputArea) {
        inputArea = squareInchToSquareFoot(inputArea);
        return squareFootToSquareMeter(inputArea);
    }

    /**
     * Convert square inch to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareMillimeter(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square inch to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareCentimeter(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square inch to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareKilometer(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square inch to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToHectare(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square inch to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareYard(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }

    /**
     * Convert square inch to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToSquareMile(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert square inch to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareInchToAcre(double inputArea) {
        inputArea = squareInchToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Sq Foot Conversions*****************************/

    /**
     * Convert square foot to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareMillimeter(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square foot to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareCentimeter(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square foot to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareKilometer(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square foot to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToHectare(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square foot to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToSquareMile(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /**
     * Convert square foot to acre.
     *
     * @param inputArea
     * @return double
     */
    private static double squareFootToAcre(double inputArea) {
        inputArea = squareFootToSquareMeter(inputArea);
        return squareMeterToAcre(inputArea);
    }

    /******************Sq Yard Conversions*****************************/

    /**
     * Convert square yard to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareMeter(double inputArea) {
        inputArea = squareYardToSquareFoot(inputArea);
        return squareFootToSquareMeter(inputArea);
    }

    /**
     * Convert square yard to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareMillimeter(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square yard to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareCentimeter(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square yard to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareKilometer(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square yard to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToHectare(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square yard to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareInch(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert square yard to square mile.
     *
     * @param inputArea
     * @return double
     */
    private static double squareYardToSquareMile(double inputArea) {
        inputArea = squareYardToSquareMeter(inputArea);
        return squareMeterToSquareMile(inputArea);
    }

    /******************Sq Mile Conversions*****************************/

    /**
     * Convert square mile to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareMeter(double inputArea) {
        inputArea = squareMileToAcre(inputArea);
        return acreToSquareMeter(inputArea);
    }

    /**
     * Convert square mile to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareMillimeter(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert square mile to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareCentimeter(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert square mile to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareKilometer(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert square mile to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToHectare(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert square mile to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareInch(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert square mile to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareFoot(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**
     * Convert square mile to square yard.
     *
     * @param inputArea
     * @return double
     */
    private static double squareMileToSquareYard(double inputArea) {
        inputArea = squareMileToSquareMeter(inputArea);
        return squareMeterToSquareYard(inputArea);
    }


    /******************Acre Conversions*****************************/

    /**
     * Convert acre to square meter.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareMeter(double inputArea) {
        inputArea = acreToSquareYard(inputArea);
        return squareYardToSquareMeter(inputArea);
    }

    /**
     * Convert acre to square millimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareMillimeter(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToSquareMillimeter(inputArea);
    }

    /**
     * Convert acre to square centimeter.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareCentimeter(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToSquareCentimeter(inputArea);
    }

    /**
     * Convert acre to square kilometer.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareKilometer(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToSquareKilometer(inputArea);
    }

    /**
     * Convert acre to hectare.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToHectare(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToHectare(inputArea);
    }

    /**
     * Convert acre to square inch.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareInch(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToSquareInch(inputArea);
    }

    /**
     * Convert acre to square foot.
     *
     * @param inputArea
     * @return double
     */
    private static double acreToSquareFoot(double inputArea) {
        inputArea = acreToSquareMeter(inputArea);
        return squareMeterToSquareFoot(inputArea);
    }

    /**********************************************************/

    /**
     * Convert area from input unit to output unit.
     * Units allowed from Unit data type: ACRE, HECTARE, SQMETER, SQCENTIMETER,
     * SQMILLIMETER, SQKILOMETER, SQMILE, SQINCH, SQFOOT, SQYARD.
     *
     * @param inputUnit  : Unit data type in ConversionLiterals class
     * @param outputUnit : Unit data type in ConversionLiterals class
     * @param inputArea  : double
     * @return double
     */
    public static double convertArea(Unit inputUnit, Unit outputUnit, double inputArea) {
        double outputArea;
        String choice = inputUnit.toString() + outputUnit.toString();

        // Determine conversion function.
        switch (choice) {
            // sq meter conversion
            case "SQMETERSQMILLIMETER":
                outputArea = squareMeterToSquareMillimeter(inputArea);
                break;
            case "SQMETERSQCENTIMETER":
                outputArea = squareMeterToSquareCentimeter(inputArea);
                break;
            case "SQMETERSQKILOMETER":
                outputArea = squareMeterToSquareKilometer(inputArea);
                break;
            case "SQMETERHECTARE":
                outputArea = squareMeterToHectare(inputArea);
                break;
            case "SQMETERSQINCH":
                outputArea = squareMeterToSquareInch(inputArea);
                break;
            case "SQMETERSQFOOT":
                outputArea = squareMeterToSquareFoot(inputArea);
                break;
            case "SQMETERSQYARD":
                outputArea = squareMeterToSquareYard(inputArea);
                break;
            case "SQMETERSQMILE":
                outputArea = squareMeterToSquareMile(inputArea);
                break;
            case "SQMETERACRE":
                outputArea = squareMeterToAcre(inputArea);
                break;
            // sq millimeter conversion
            case "SQMILLIMETERSQMETER":
                outputArea = squareMillimeterToSquareMeter(inputArea);
                break;
            case "SQMILLIMETERSQCENTIMETER":
                outputArea = squareMillimeterToSquareCentimeter(inputArea);
                break;
            case "SQMILLIMETERSQKILOMETER":
                outputArea = squareMillimeterToSquareKilometer(inputArea);
                break;
            case "SQMILLIMETERHECTARE":
                outputArea = squareMillimeterToHectare(inputArea);
                break;
            case "SQMILLIMETERSQINCH":
                outputArea = squareMillimeterToSquareInch(inputArea);
                break;
            case "SQMILLIMETERSQFOOT":
                outputArea = squareMillimeterToSquareFoot(inputArea);
                break;
            case "SQMILLIMETERSQYARD":
                outputArea = squareMillimeterToSquareYard(inputArea);
                break;
            case "SQMILLIMETERSQMILE":
                outputArea = squareMillimeterToSquareMile(inputArea);
                break;
            case "SQMILLIMETERACRE":
                outputArea = squareMillimeterToAcre(inputArea);
                break;
            // sq centimeter conversion
            case "SQCENTIMETERSQMETER":
                outputArea = squareCentimeterToSquareMeter(inputArea);
                break;
            case "SQCENTIMETERSQMILLIMETER":
                outputArea = squareCentimeterToSquareMillimeter(inputArea);
                break;
            case "SQCENTIMETERSQKILOMETER":
                outputArea = squareCentimeterToSquareKilometer(inputArea);
                break;
            case "SQCENTIMETERHECTARE":
                outputArea = squareCentimeterToHectare(inputArea);
                break;
            case "SQCENTIMETERSQINCH":
                outputArea = squareCentimeterToSquareInch(inputArea);
                break;
            case "SQCENTIMETERSQFOOT":
                outputArea = squareCentimeterToSquareFoot(inputArea);
                break;
            case "SQCENTIMETERSQYARD":
                outputArea = squareCentimeterToSquareYard(inputArea);
                break;
            case "SQCENTIMETERSQMILE":
                outputArea = squareCentimeterToSquareMile(inputArea);
                break;
            case "SQCENTIMETERACRE":
                outputArea = squareCentimeterToAcre(inputArea);
                break;
            // sq kilometer conversion
            case "SQKILOMETERSQMETER":
                outputArea = squareKilometerToSquareMeter(inputArea);
                break;
            case "SQKILOMETERSQMILLIMETER":
                outputArea = squareKilometerToSquareMillimeter(inputArea);
                break;
            case "SQKILOMETERSQCENTIMETER":
                outputArea = squareKilometerToSquareCentimeter(inputArea);
                break;
            case "SQKILOMETERHECTARE":
                outputArea = squareKilometerToHectare(inputArea);
                break;
            case "SQKILOMETERSQINCH":
                outputArea = squareKilometerToSquareInch(inputArea);
                break;
            case "SQKILOMETERSQFOOT":
                outputArea = squareKilometerToSquareFoot(inputArea);
                break;
            case "SQKILOMETERSQYARD":
                outputArea = squareKilometerToSquareYard(inputArea);
                break;
            case "SQKILOMETERSQMILE":
                outputArea = squareKilometerToSquareMile(inputArea);
                break;
            case "SQKILOMETERACRE":
                outputArea = squareKilometerToAcre(inputArea);
                break;
            // hectare conversion
            case "HECTARESQMETER":
                outputArea = hectareToSquareMeter(inputArea);
                break;
            case "HECTARESQMILLIMETER":
                outputArea = hectareToSquareMillimeter(inputArea);
                break;
            case "HECTARESQCENTIMETER":
                outputArea = hectareToSquareCentimeter(inputArea);
                break;
            case "HECTARESQKILOMETER":
                outputArea = hectareToSquareKilometer(inputArea);
                break;
            case "HECTARESQINCH":
                outputArea = hectareToSquareInch(inputArea);
                break;
            case "HECTARESQFOOT":
                outputArea = hectareToSquareFoot(inputArea);
                break;
            case "HECTARESQYARD":
                outputArea = hectareToSquareYard(inputArea);
                break;
            case "HECTARESQMILE":
                outputArea = hectareToSquareMile(inputArea);
                break;
            case "HECTAREACRE":
                outputArea = hectareToAcre(inputArea);
                break;
            // sq inch conversion
            case "SQINCHSQMETER":
                outputArea = squareInchToSquareMeter(inputArea);
                break;
            case "SQINCHSQMILLIMETER":
                outputArea = squareInchToSquareMillimeter(inputArea);
                break;
            case "SQINCHSQCENTIMETER":
                outputArea = squareInchToSquareCentimeter(inputArea);
                break;
            case "SQINCHSQKILOMETER":
                outputArea = squareInchToSquareKilometer(inputArea);
                break;
            case "SQINCHHECTARE":
                outputArea = squareInchToHectare(inputArea);
                break;
            case "SQINCHSQFOOT":
                outputArea = squareInchToSquareFoot(inputArea);
                break;
            case "SQINCHSQYARD":
                outputArea = squareInchToSquareYard(inputArea);
                break;
            case "SQINCHSQMILE":
                outputArea = squareInchToSquareMile(inputArea);
                break;
            case "SQINCHACRE":
                outputArea = squareInchToAcre(inputArea);
                break;
            // sq foot conversion
            case "SQFOOTSQMETER":
                outputArea = squareFootToSquareMeter(inputArea);
                break;
            case "SQFOOTSQMILLIMETER":
                outputArea = squareFootToSquareMillimeter(inputArea);
                break;
            case "SQFOOTSQCENTIMETER":
                outputArea = squareFootToSquareCentimeter(inputArea);
                break;
            case "SQFOOTSQKILOMETER":
                outputArea = squareFootToSquareKilometer(inputArea);
                break;
            case "SQFOOTHECTARE":
                outputArea = squareFootToHectare(inputArea);
                break;
            case "SQFOOTSQINCH":
                outputArea = squareFootToSquareInch(inputArea);
                break;
            case "SQFOOTSQYARD":
                outputArea = squareFootToSquareYard(inputArea);
                break;
            case "SQFOOTSQMILE":
                outputArea = squareFootToSquareMile(inputArea);
                break;
            case "SQFOOTACRE":
                outputArea = squareFootToAcre(inputArea);
                break;
            // sq yard conversion
            case "SQYARDSQMETER":
                outputArea = squareYardToSquareMeter(inputArea);
                break;
            case "SQYARDSQMILLIMETER":
                outputArea = squareYardToSquareMillimeter(inputArea);
                break;
            case "SQYARDSQCENTIMETER":
                outputArea = squareYardToSquareCentimeter(inputArea);
                break;
            case "SQYARDSQKILOMETER":
                outputArea = squareYardToSquareKilometer(inputArea);
                break;
            case "SQYARDHECTARE":
                outputArea = squareYardToHectare(inputArea);
                break;
            case "SQYARDSQINCH":
                outputArea = squareYardToSquareInch(inputArea);
                break;
            case "SQYARDSQFOOT":
                outputArea = squareYardToSquareFoot(inputArea);
                break;
            case "SQYARDSQMILE":
                outputArea = squareYardToSquareMile(inputArea);
                break;
            case "SQYARDACRE":
                outputArea = squareYardToAcre(inputArea);
                break;
            // sq mile conversion
            case "SQMILESQMETER":
                outputArea = squareMileToSquareMeter(inputArea);
                break;
            case "SQMILESQMILLIMETER":
                outputArea = squareMileToSquareMillimeter(inputArea);
                break;
            case "SQMILESQCENTIMETER":
                outputArea = squareMileToSquareCentimeter(inputArea);
                break;
            case "SQMILESQKILOMETER":
                outputArea = squareMileToSquareKilometer(inputArea);
                break;
            case "SQMILEHECTARE":
                outputArea = squareMileToHectare(inputArea);
                break;
            case "SQMILESQINCH":
                outputArea = squareMileToSquareInch(inputArea);
                break;
            case "SQMILESQFOOT":
                outputArea = squareMileToSquareFoot(inputArea);
                break;
            case "SQMILESQYARD":
                outputArea = squareMileToSquareYard(inputArea);
                break;
            case "SQMILEACRE":
                outputArea = squareMileToAcre(inputArea);
                break;
            // acre conversion
            case "ACRESQMETER":
                outputArea = acreToSquareMeter(inputArea);
                break;
            case "ACRESQMILLIMETER":
                outputArea = acreToSquareMillimeter(inputArea);
                break;
            case "ACRESQCENTIMETER":
                outputArea = acreToSquareCentimeter(inputArea);
                break;
            case "ACRESQKILOMETER":
                outputArea = acreToSquareKilometer(inputArea);
                break;
            case "ACREHECTARE":
                outputArea = acreToHectare(inputArea);
                break;
            case "ACRESQINCH":
                outputArea = acreToSquareInch(inputArea);
                break;
            case "ACRESQFOOT":
                outputArea = acreToSquareFoot(inputArea);
                break;
            case "ACRESQYARD":
                outputArea = acreToSquareYard(inputArea);
                break;
            case "ACRESQMILE":
                outputArea = acreToSquareMile(inputArea);
                break;
            default:
                //  Return input if the input unit is the same as the output unit.
                outputArea = inputArea;
        }

        return outputArea;
    }


}
