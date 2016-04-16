package converters;

import converters.ConversionLiterals.Unit;

/**
 * Mass and weight conversions. Including: ounces, pounds,
 * atomic mass units, grams, milligrams, kilograms, metric tons.
 *
 * @author John-Paul Steed
 */
public class MassConverter {

    /***************Basic Conversions**************************/

    /**
     * Convert ounces to pound.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToPound(double inputMass) {
        return (inputMass / ConversionLiterals.OUNCESPERPOUND);
    }

    /**
     * Convert pound to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double poundToOunces(double inputMass) {
        return (inputMass * ConversionLiterals.OUNCESPERPOUND);
    }

    /**
     * Convert pound to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double poundsToGram(double inputMass) {
        return (inputMass * ConversionLiterals.GRAMSPERPOUND);
    }

    /**
     * Convert gram to pound.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToPound(double inputMass) {
        return (inputMass / ConversionLiterals.GRAMSPERPOUND);
    }

    /**
     * Convert atoms to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToGram(double inputMass) {
        return (inputMass / ConversionLiterals.ATOMSPERGRAM);
    }

    /**
     * Convert gram to atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToAtom(double inputMass) {
        return (inputMass * ConversionLiterals.ATOMSPERGRAM);
    }

    /**
     * Convert gram to milligrams.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToMilli(double inputMass) {
        return (inputMass / ConversionLiterals.MILLI);
    }

    /**
     * Convert milligram to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double milliToGrams(double inputMass) {
        return (inputMass * ConversionLiterals.MILLI);
    }

    /**
     * Convert gram to kilogram.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToKilo(double inputMass) {
        return (inputMass / ConversionLiterals.KILO);
    }

    /**
     * Convert kilogram to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double kiloToGrams(double inputMass) {
        return (inputMass * ConversionLiterals.KILO);
    }

    /**
     * Convert gram to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToTon(double inputMass) {
        return (inputMass / ConversionLiterals.MEGA);
    }

    /**
     * Convert metric ton to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double tonsToGram(double inputMass) {
        return (inputMass * ConversionLiterals.MEGA);
    }


    /******************Advanced Conversions***********************/

    /*****************Ounce Conversions***************************/

    /**
     * Convert ounces to gram.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToGram(double inputMass) {
        inputMass = ouncesToPound(inputMass);
        return poundsToGram(inputMass);
    }

    /**
     * Convert ounces to milligram.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToMilligram(double inputMass) {
        inputMass = ouncesToGram(inputMass);
        return gramsToMilli(inputMass);
    }

    /**
     * Convert ounces to kilogram.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToKilogram(double inputMass) {
        inputMass = ouncesToGram(inputMass);
        return gramsToKilo(inputMass);
    }

    /**
     * Convert ounces to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToTon(double inputMass) {
        inputMass = ouncesToGram(inputMass);
        return gramsToTon(inputMass);
    }

    /**
     * Convert ounces to atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double ouncesToAtom(double inputMass) {
        inputMass = ouncesToGram(inputMass);
        return gramsToAtom(inputMass);
    }

    /*****************Pound Conversions*********************/

    /**
     * Convert pounds to milligram.
     *
     * @param inputMass
     * @return double
     */
    public static double poundsToMilligram(double inputMass) {
        inputMass = poundsToGram(inputMass);
        return gramsToMilli(inputMass);
    }

    /**
     * Convert pounds to kilogram.
     *
     * @param inputMass
     * @return double
     */
    public static double poundsToKilogram(double inputMass) {
        inputMass = poundsToGram(inputMass);
        return gramsToKilo(inputMass);
    }

    /**
     * Convert pounds to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double poundsToTon(double inputMass) {
        inputMass = poundsToGram(inputMass);
        return gramsToTon(inputMass);
    }

    /**
     * Convert pounds to atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double poundsToAtom(double inputMass) {
        inputMass = poundsToGram(inputMass);
        return gramsToAtom(inputMass);
    }

    /***************Gram Conversions***************************/

    /**
     * Convert gram to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double gramsToOunces(double inputMass) {
        inputMass = gramsToPound(inputMass);
        return poundToOunces(inputMass);
    }

    /****************Milligram Conversions*********************/

    /**
     * Convert milligram to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double milligramsToOunces(double inputMass) {
        inputMass = milliToGrams(inputMass);
        return gramsToOunces(inputMass);
    }

    /**
     * Convert milligram to pound.
     *
     * @param inputMass
     * @return double
     */
    public static double milligramsToPound(double inputMass) {
        inputMass = milliToGrams(inputMass);
        return gramsToPound(inputMass);
    }

    /**
     * Convert milligram to kilogram.
     *
     * @param inputMass
     * @return double
     */
    public static double milligramsToKilo(double inputMass) {
        inputMass = milliToGrams(inputMass);
        return gramsToKilo(inputMass);
    }

    /**
     * Convert milligram to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double milligramsToTon(double inputMass) {
        inputMass = milliToGrams(inputMass);
        return gramsToTon(inputMass);
    }

    /**
     * Convert milligram to atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double milligramsToAtom(double inputMass) {
        inputMass = milliToGrams(inputMass);
        return gramsToAtom(inputMass);
    }


    /******************Kilogram Conversions*********************/

    /**
     * Convert kilogram to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double kilogramsToOunces(double inputMass) {
        inputMass = kiloToGrams(inputMass);
        return gramsToOunces(inputMass);
    }

    /**
     * Convert kilogram to pound.
     *
     * @param inputMass
     * @return double
     */
    public static double kilogramsToPound(double inputMass) {
        inputMass = kiloToGrams(inputMass);
        return gramsToPound(inputMass);
    }

    /**
     * Convert kilogram to milligram.
     *
     * @param inputMass
     * @return double
     */
    public static double kilogramsToMilli(double inputMass) {
        inputMass = kiloToGrams(inputMass);
        return gramsToMilli(inputMass);
    }

    /**
     * Convert kilogram to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double kilogramsToTon(double inputMass) {
        inputMass = kiloToGrams(inputMass);
        return gramsToTon(inputMass);
    }

    /**
     * Convert kilogram to atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double kilogramsToAtom(double inputMass) {
        inputMass = kiloToGrams(inputMass);
        return gramsToAtom(inputMass);
    }

    /****************Metric Ton Conversions***********************/

    /**
     * Convert metric ton to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double tonToOunces(double inputMass) {
        inputMass = tonsToGram(inputMass);
        return gramsToOunces(inputMass);
    }

    /**
     * Convert metric ton pound.
     *
     * @param inputMass
     * @return double
     */
    public static double tonToPound(double inputMass) {
        inputMass = tonsToGram(inputMass);
        return gramsToPound(inputMass);
    }

    /**
     * Convert metric ton milligram.
     *
     * @param inputMass
     * @return double
     */
    public static double tonToMilli(double inputMass) {
        inputMass = tonsToGram(inputMass);
        return gramsToMilli(inputMass);
    }

    /**
     * Convert metric ton kilogram.
     *
     * @param inputMass
     * @return double
     */
    public static double tonToKilogram(double inputMass) {
        inputMass = tonsToGram(inputMass);
        return gramsToKilo(inputMass);
    }

    /**
     * Convert metric ton atoms.
     *
     * @param inputMass
     * @return double
     */
    public static double tonToAtom(double inputMass) {
        inputMass = tonsToGram(inputMass);
        return gramsToAtom(inputMass);
    }

    /*****************Atom conversions******************************/

    /**
     * Convert atoms to ounces.
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToOunces(double inputMass) {
        inputMass = atomsToGram(inputMass);
        return gramsToOunces(inputMass);
    }

    /**
     * Convert atoms to pound.
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToPound(double inputMass) {
        inputMass = atomsToGram(inputMass);
        return gramsToPound(inputMass);
    }

    /**
     * Convert atoms to milligram.
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToMilli(double inputMass) {
        inputMass = atomsToGram(inputMass);
        return gramsToMilli(inputMass);
    }

    /**
     * Convert atoms to kilogram
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToKilogram(double inputMass) {
        inputMass = atomsToGram(inputMass);
        return gramsToKilo(inputMass);
    }

    /**
     * Convert atoms to metric ton.
     *
     * @param inputMass
     * @return double
     */
    public static double atomsToTon(double inputMass) {
        inputMass = atomsToGram(inputMass);
        return gramsToTon(inputMass);
    }

    /**********************************************************/

    /**
     * Convert mass from input unit to output unit.
     * Units allowed from Unit data type: OUNCE, POUND, ATOMICMASSUNIT,
     * GRAM, MILLIGRAM, KILOGRAM, METRICTON.
     *
     * @param inputUnit  : Unit data type in ConversionLiterals class
     * @param outputUnit : Unit data type in ConversionLiterals class
     * @param inputMass  : double
     * @return double
     */
    public static double convertMass(Unit inputUnit, Unit outputUnit, double inputMass) {
        double outputMass = 0;
        String choice = inputUnit.toString() + outputUnit.toString();

        // Determine conversion function.
        switch (choice) {
            // Ounce conversion
            case "OUNCEPOUND":
                outputMass = ouncesToPound(inputMass);
                break;
            case "OUNCEATOMICMASSUNIT":
                outputMass = ouncesToAtom(inputMass);
                break;
            case "OUNCEGRAM":
                outputMass = ouncesToGram(inputMass);
                break;
            case "OUNCEMILLIGRAM":
                outputMass = ouncesToMilligram(inputMass);
                break;
            case "OUNCEKILOGRAM":
                outputMass = ouncesToKilogram(inputMass);
                break;
            case "OUNCEMETRICTON":
                outputMass = ouncesToTon(inputMass);
                break;
            // Pound conversion
            case "POUNDOUNCE":
                outputMass = poundToOunces(inputMass);
                break;
            case "POUNDATOMICMASSUNIT":
                outputMass = poundsToAtom(inputMass);
                break;
            case "POUNDGRAM":
                outputMass = poundsToGram(inputMass);
                break;
            case "POUNDMILLIGRAM":
                outputMass = poundsToMilligram(inputMass);
                break;
            case "POUNDKILOGRAM":
                outputMass = poundsToKilogram(inputMass);
                break;
            case "POUNDMETRICTON":
                outputMass = poundsToTon(inputMass);
                break;
            // Atomic Mass Unit conversion
            case "ATOMICMASSUNITOUNCE":
                outputMass = atomsToOunces(inputMass);
                break;
            case "ATOMICMASSUNITPOUND":
                outputMass = atomsToPound(inputMass);
                break;
            case "ATOMICMASSUNITGRAM":
                outputMass = atomsToGram(inputMass);
                break;
            case "ATOMICMASSUNITMILLIGRAM":
                outputMass = atomsToMilli(inputMass);
                break;
            case "ATOMICMASSUNITKILOGRAM":
                outputMass = atomsToKilogram(inputMass);
                break;
            case "ATOMICMASSUNITMETRICTON":
                outputMass = atomsToTon(inputMass);
                break;
            // Gram conversion
            case "GRAMOUNCE":
                outputMass = gramsToOunces(inputMass);
                break;
            case "GRAMPOUND":
                outputMass = gramsToPound(inputMass);
                break;
            case "GRAMATOMICMASSUNIT":
                outputMass = gramsToAtom(inputMass);
                break;
            case "GRAMMILLIGRAM":
                outputMass = gramsToMilli(inputMass);
                break;
            case "GRAMKILOGRAM":
                outputMass = gramsToKilo(inputMass);
                break;
            case "GRAMMETRICTON":
                outputMass = gramsToTon(inputMass);
                break;
            // Milligram conversion
            case "MILLIGRAMOUNCE":
                outputMass = milligramsToOunces(inputMass);
                break;
            case "MILLIGRAMPOUND":
                outputMass = milligramsToPound(inputMass);
                break;
            case "MILLIGRAMATOMICMASSUNIT":
                outputMass = milligramsToAtom(inputMass);
                break;
            case "MILLIGRAMGRAM":
                outputMass = milliToGrams(inputMass);
                break;
            case "MILLIGRAMKILOGRAM":
                outputMass = milligramsToKilo(inputMass);
                break;
            case "MILLIGRAMMETRICTON":
                outputMass = milligramsToTon(inputMass);
                break;
            // Kilogram conversion
            case "KILOGRAMOUNCE":
                outputMass = kilogramsToOunces(inputMass);
                break;
            case "KILOGRAMPOUND":
                outputMass = kilogramsToPound(inputMass);
                break;
            case "KILOGRAMATOMICMASSUNIT":
                outputMass = kilogramsToAtom(inputMass);
                break;
            case "KILOGRAMGRAM":
                outputMass = kiloToGrams(inputMass);
                break;
            case "KILOGRAMMILLIGRAM":
                outputMass = kilogramsToMilli(inputMass);
                break;
            case "KILOGRAMMETRICTON":
                outputMass = kilogramsToTon(inputMass);
                break;
            // Metric Ton conversion
            case "METRICTONOUNCE":
                outputMass = tonToOunces(inputMass);
                break;
            case "METRICTONPOUND":
                outputMass = tonToPound(inputMass);
                break;
            case "METRICTONATOMICMASSUNIT":
                outputMass = tonToAtom(inputMass);
                break;
            case "METRICTONGRAM":
                outputMass = tonsToGram(inputMass);
                break;
            case "METRICTONMILLIGRAM":
                outputMass = tonToMilli(inputMass);
                break;
            case "METRICTONKILOGRAM":
                outputMass = tonToKilogram(inputMass);
                break;
            default:
                //  Return input if the input unit is the same as the output unit.
                outputMass = inputMass;
        }

        return outputMass;
    }


}
