package efestus.musication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class lvl2_notmus_4 extends AppCompatActivity {
    final int NUMBER_OF_RADIOBUTTONS_TO_ADD = 6;//Change it for other number of RadioButtons
    RadioButton[] radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_notmus_4);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        RadioButton radioBut1 = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radioBut2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton radioBut3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radioBut4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton radioBut5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton radioBut6 = (RadioButton) findViewById(R.id.radioButton6);

        radioGroup.addView(radioBut1);
        radioGroup.addView(radioBut3);
        radioGroup.addView(radioBut2);
        radioGroup.addView(radioBut4);
        radioGroup.addView(radioBut5);
        radioGroup.addView(radioBut6);
    }
}
