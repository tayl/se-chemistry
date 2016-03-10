package jpsteed.professionals.converters;

import jpsteed.professionals.converters.ConversionLiterals.Unit;

/**
 * Density conversions.
 * @author John-Paul Steed
 *
 */
public class DensityConverter {
	
	/**
	 * Convert density from input mass/volume unit to output mass/volume unit.
	 * Mass units allowed from Unit data type: OUNCE, POUND, ATOMICMASSUNIT,
	 * 		GRAM, MILLIGRAM, KILOGRAM, METRICTON.
	 * Volume units allowed from Unit data type: CUBMETER, CUBCENTIMETER, CUBMILLIMETER,
	 * 		CUBKILOMETER, LITER, GALLON, QUART, CUP, CUBFOOT, MILLILITER, KILOLITER.
	 * @param inputMassUnit : Unit data type in ConversionLiterals class
	 * @param inputVolumeUnit : Unit data type in ConversionLiterals class
	 * @param outputMassUnit : Unit data type in ConversionLiterals class
	 * @param outputVolumeUnit : Unit data type in ConversionLiterals class
	 * @param inputDensity : double
	 * @return double
	 */
	public static double convertDensity(Unit inputMassUnit, Unit inputVolumeUnit, Unit outputMassUnit, Unit outputVolumeUnit, double inputDensity) {
		// Mass conversion.
		inputDensity = MassConverter.convertMass(inputMassUnit, outputMassUnit, inputDensity);
		
		// Invert
		inputDensity = 1 / inputDensity;
		
		// Volume conversion.
		double outputDensity = VolumeConverter.convertVolume(inputVolumeUnit, outputVolumeUnit, inputDensity);
		
		// Invert again.
		outputDensity = 1 / outputDensity;
		
		return outputDensity;
		
	}

}
