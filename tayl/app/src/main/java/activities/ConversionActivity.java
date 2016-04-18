package activities;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.chemistry.R;

import java.text.DecimalFormat;

import converters.ConversionLiterals;


/**
 * Created by Daniel on 3/23/16.
 */
public class ConversionActivity extends Activity {

    TextView calculatedValue;
    EditText inputTextView;

    //Drop down menus on UI
    Spinner conversionSpinner;
    Spinner unitFromnSpinner;
    Spinner unitToSpinner;
    Spinner densityFromSpinner;
    Spinner densityToSpinner;

    ArrayAdapter<CharSequence> conversionTypeAdaptor;
    ArrayAdapter<CharSequence> unitAdaptor;

    DecimalFormat df = new DecimalFormat("#.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion);

        calculatedValue = (TextView) findViewById(R.id.calculatedTextView);
        inputTextView = (EditText) findViewById(R.id.inputText);

        //Sets object to respective ui element
        conversionSpinner = (Spinner) findViewById(R.id.conversionTypeSpinner);
        unitFromnSpinner = (Spinner) findViewById(R.id.conversionFromSpinner);
        unitToSpinner = (Spinner) findViewById(R.id.conversionToSpinner);
        densityFromSpinner = (Spinner) findViewById((R.id.densityMassFrom));
        densityToSpinner = (Spinner) findViewById((R.id.densityMassTo));

        conversionTypeAdaptor = ArrayAdapter.createFromResource(this, R.array.converstionTypes, android.R.layout.simple_spinner_item);
        conversionTypeAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        conversionSpinner.setAdapter(conversionTypeAdaptor);
        conversionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                densityFromSpinner.setVisibility(View.INVISIBLE);
                densityToSpinner.setVisibility(View.INVISIBLE);

                switch (position) {
                    case 0:
                        populateSpinnerArea();
                        break;
                    case 1:
                        populateSpinnerDensity();
                        break;
                    case 2:
                        populateSpinnerLength();
                        break;
                    case 3:
                        populateSpinnerMass();
                        break;
                    case 4:
                        populateSpinnerPressure();
                        break;
                    case 5:
                        populateSpinnerTemperature();
                        break;
                    case 6:
                        populateSpinnerVolume();
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void populateSpinnerArea() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.areaUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    private void populateSpinnerDensity() {
        densityFromSpinner.setVisibility(View.VISIBLE);
        densityToSpinner.setVisibility(View.VISIBLE);
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.volumeUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.massUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        densityFromSpinner.setAdapter(unitAdaptor);
        densityToSpinner.setAdapter(unitAdaptor);

    }

    private void populateSpinnerLength() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.lengthUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    private void populateSpinnerMass() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.massUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    private void populateSpinnerPressure() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.pressureUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    private void populateSpinnerTemperature() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.temperatureUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    private void populateSpinnerVolume() {
        unitAdaptor = ArrayAdapter.createFromResource(this, R.array.volumeUnits, android.R.layout.simple_spinner_item);
        unitAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        unitFromnSpinner.setAdapter(unitAdaptor);
        unitToSpinner.setAdapter(unitAdaptor);
    }

    public void calculateButtonListener(View v) {
        int conversionType = conversionSpinner.getSelectedItemPosition();
        Double output = new Double(0);


        if (TextUtils.isEmpty(inputTextView.getText())) {
            calculatedValue.setText("");
            return;
        }


        double inputValue = Double.valueOf(inputTextView.getText().toString());

        ConversionLiterals.Unit fromUnit = getUnit(unitFromnSpinner);
        ConversionLiterals.Unit toUnit = getUnit(unitToSpinner);


        switch (conversionType) {
            case 0:
                output = converters.AreaConverter.convertArea(fromUnit, toUnit, inputValue);
                break;
            case 1:
                output = converters.DensityConverter.convertDensity(getUnit(densityFromSpinner), fromUnit, getUnit(densityToSpinner), toUnit, inputValue);
                break;
            case 2:
                output = converters.LengthConverter.convertLength(fromUnit, toUnit, inputValue);
                break;
            case 3:
                output = converters.MassConverter.convertMass(fromUnit, toUnit, inputValue);
                break;
            case 4:
                output = converters.PressureConverter.convertPressure(fromUnit, toUnit, inputValue);
                break;
            case 5:
                output = converters.TemperatureConverter.convertTemperature(fromUnit, toUnit, inputValue);
                break;
            case 6:
                output = converters.VolumeConverter.convertVolume(fromUnit, toUnit, inputValue);
                break;
            default:
                break;
        }
        calculatedValue.setText(output.toString());
    }

    public ConversionLiterals.Unit getUnit(Spinner spinner) {

        switch (spinner.getSelectedItem().toString()) {
            // LengthConverter

            case "Acre":
                return ConversionLiterals.Unit.ACRE;

            case "Hectare":
                return ConversionLiterals.Unit.HECTARE;

            case "Sq Metre":
                return ConversionLiterals.Unit.SQMETER;

            case "Sq Centimetre":
                return ConversionLiterals.Unit.SQCENTIMETER;

            case "Sq Millimetre":
                return ConversionLiterals.Unit.SQMILLIMETER;

            case "Sq Kilometre":
                return ConversionLiterals.Unit.SQKILOMETER;

            case "Sq Mile":
                return ConversionLiterals.Unit.SQMILE;

            case "Sq Inch":
                return ConversionLiterals.Unit.SQINCH;

            case "Sq Foot":
                return ConversionLiterals.Unit.SQFOOT;

            case "Sq Yard":
                return ConversionLiterals.Unit.SQYARD;

            case "Inch":
                return ConversionLiterals.Unit.INCH;

            case "Foot":
                return ConversionLiterals.Unit.FOOT;

            case "Yard":
                return ConversionLiterals.Unit.YARD;

            case "Mile":
                return ConversionLiterals.Unit.MILE;

            case "Picometre":
                return ConversionLiterals.Unit.PICOMETER;

            case "Nanometre":
                return ConversionLiterals.Unit.NANOMETER;

            case "Micrometre":
                return ConversionLiterals.Unit.MICROMETER;

            case "Millimetre":
                return ConversionLiterals.Unit.MILLIMETER;

            case "Centimetre":
                return ConversionLiterals.Unit.CENTIMETER;

            case "Decimetre":
                return ConversionLiterals.Unit.DECIMETER;

            case "Metre":
                return ConversionLiterals.Unit.METER;

            case "Kilometre":
                return ConversionLiterals.Unit.KILOMETER;

            case "Megametre":
                return ConversionLiterals.Unit.MEGAMETER;

            case "Gigametre":
                return ConversionLiterals.Unit.GIGAMETER;

            case "Ounce":
                return ConversionLiterals.Unit.OUNCE;

            case "Pound":
                return ConversionLiterals.Unit.POUND;

            case "Atomic Mass Unit/Dalton":
                return ConversionLiterals.Unit.ATOMICMASSUNIT;

            case "Gram":
                return ConversionLiterals.Unit.GRAM;

            case "Milligram":
                return ConversionLiterals.Unit.MILLIGRAM;

            case "Kilogram":
                return ConversionLiterals.Unit.KILOGRAM;

            case "Metric Ton":
                return ConversionLiterals.Unit.METRICTON;

            case "Atmosphere":
                return ConversionLiterals.Unit.ATMOSPHERE;

            case "Torr":
                return ConversionLiterals.Unit.TORR;

            case "Pascal":
                return ConversionLiterals.Unit.PASCAL;

            case "Kilopascal":
                return ConversionLiterals.Unit.KILOPASCAL;

            case "Millimetre of Mercury":
                return ConversionLiterals.Unit.MILLIMERCURY;

            case "Pounds per Sq Inch":
                return ConversionLiterals.Unit.POUNDSSQINCH;

            case "Cubic Metre":
                return ConversionLiterals.Unit.CUBMETER;

            case "Cubic Centimetre":
                return ConversionLiterals.Unit.CUBCENTIMETER;

            case "Cubic Millimetre":
                return ConversionLiterals.Unit.CUBMILLIMETER;

            case "Cubic Kilometre":
                return ConversionLiterals.Unit.CUBKILOMETER;

            case "Litre":
                return ConversionLiterals.Unit.LITER;

            case "Gallon":
                return ConversionLiterals.Unit.GALLON;

            case "Quart":
                return ConversionLiterals.Unit.QUART;

            case "Cup":
                return ConversionLiterals.Unit.CUP;

            case "Cubic Feet":
                return ConversionLiterals.Unit.CUBFOOT;

            case "Millilitre":
                return ConversionLiterals.Unit.MILLILITER;

            case "Kilolitre":
                return ConversionLiterals.Unit.KILOLITER;

            case "Kelvin":
                return ConversionLiterals.Unit.KELVIN;

            case "Celsius":
                return ConversionLiterals.Unit.CELSIUS;

            case "Fahrenheit":
                return ConversionLiterals.Unit.FAHRENHEIT;

        }
        return ConversionLiterals.Unit.FAHRENHEIT;
    }


}
