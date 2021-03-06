package converters;


/**
 * Constants for converter classes.
 *
 * @author John-Paul Steed
 */
public class ConversionLiterals {

    // Length Conversions
    static final double FEETPERMETER = 3.280839895013; //updated;
    static final int INCHESPERFOOT = 12;
    static final int FEETPERMILE = 5280;
    static final int FEETPERYARD = 3;
    // Metric subunits
    static final double PICO = 1E-12;
    static final double NANO = 1E-9;
    static final double MICRO = 1E-6;
    static final double MILLI = 1E-3;
    static final double CENTI = 1E-2;
    static final double DECI = 1E-1;
    static final double KILO = 1E3;
    static final double MEGA = 1E6;
    static final double GIGA = 1E9;
    // Mass Conversions
    static final double ATOMSPERGRAM = 6.02214129E23;//Updated
    static final int OUNCESPERPOUND = 16;
    static final double GRAMSPERPOUND = 453.59237; //Updated
    // Volume Conversions
    static final int QUARTSPERGALLON = 4;
    static final int CUPSPERGALLON = 16;
    static final double GALLONSPERCUBICMETER = 264.17205; //Updated
    static final int LITERSPERCUBICMETER = 1000;
    static final double CUBICFOOTPERCUBICMETER = 35.314667;//Updated
    // Temperature Conversions
    static final double CELSIUSKELVIN = 273.15;
    static final double FAHRENHEITCELSIUS1 = 1.8;
    static final int FAHRENHEITCELSIUS2 = 32;
    // Pressure Conversions
    static final int PASCALATMOSPHERE = 101325;
    static final double PASCALMMMERCURY = 133.322387; //Updated
    static final double PASCALPERPSI = 6894.76; //Updated
    static final double PASCALTORR = 133.322387; //Updated
    // Area Conversions
    static final int SQINCHSQFOOT = 144;
    static final int SQFOOTSQYARD = 9;
    static final int SQYARDPERACRE = 4840;
    static final int ACRESQMILE = 640;
    static final int HECTARESQKILOMETER = 100;
    static final double SQFOOTSQMETER = 10.763910416; //updated

    /**
     * Unit data type.
     *
     * @author John-Paul Steed
     */
    public enum Unit {
        // LengthConverter
        INCH,
        FOOT,
        YARD,
        MILE,
        PICOMETER,
        NANOMETER,
        MICROMETER,
        MILLIMETER,
        CENTIMETER,
        DECIMETER,
        METER,
        KILOMETER,
        MEGAMETER,
        GIGAMETER,
        //AreaConverter
        ACRE,
        HECTARE,
        SQMETER,
        SQCENTIMETER,
        SQMILLIMETER,
        SQKILOMETER,
        SQMILE,
        SQINCH,
        SQFOOT,
        SQYARD,
        //VolumeConverter
        CUBMETER,
        CUBCENTIMETER,
        CUBMILLIMETER,
        CUBKILOMETER,
        LITER,
        GALLON,
        QUART,
        CUP,
        CUBFOOT,
        MILLILITER,
        KILOLITER,
        //MassConverter
        OUNCE,
        POUND,
        ATOMICMASSUNIT,
        GRAM,
        MILLIGRAM,
        KILOGRAM,
        METRICTON,
        //TemperatureConverter
        KELVIN,
        CELSIUS,
        FAHRENHEIT,
        //PressureConverter
        ATMOSPHERE,
        TORR,
        PASCAL,
        KILOPASCAL,
        MILLIMERCURY,
        POUNDSSQINCH
    }

}
