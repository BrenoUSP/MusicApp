package efestus.musication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Arrays;
import java.util.Random;

public class lvl2_notmus_4 extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioBut1;
    RadioButton radioBut2;
    RadioButton radioBut3;
    RadioButton radioBut4;
    RadioButton radioBut5;
    RadioButton radioBut6;

    public int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
        int random = start + rnd.nextInt(end - start + 1 - exclude.length);
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_notmus_4);

        radioGroup = (RadioGroup) findViewById(R.id.radio_group);

        radioBut1 = new RadioButton(this);
        radioBut1.setText("Notas acidentes, Nota, Acidente, G#, Ab");

        radioBut2 = new RadioButton(this);
        radioBut2.setText("Frequências acidentais, Acidente, Nota, #G, bA");

        radioBut3 = new RadioButton(this);
        radioBut3.setText("Notas acidentes, Nota, Acidente, G#, bA");

        radioBut4 = new RadioButton(this);
        radioBut4.setText("Frequências acidentais, Nota, Acidente, G#, Ab");

        radioBut5 = new RadioButton(this);
        radioBut5.setText("Notas agudas, Nota, Acidente, Gb, A#");

        radioBut6 = new RadioButton(this);
        radioBut6.setText("Notas agudas, Nota, Acidente, G#, Ab");

        Random rand = new Random();

        int num = rand.nextInt(3);

        switch(num){
            case 0:
                radioGroup.addView(radioBut1, 0);
                radioGroup.addView(radioBut3, 1);
                radioGroup.addView(radioBut6, 2);
                radioGroup.addView(radioBut2, 3);
                radioGroup.addView(radioBut4, 4);
                radioGroup.addView(radioBut5, 5);
                break;
            case 1:
                radioGroup.addView(radioBut3, 0);
                radioGroup.addView(radioBut1, 1);
                radioGroup.addView(radioBut5, 2);
                radioGroup.addView(radioBut2, 3);
                radioGroup.addView(radioBut4, 4);
                radioGroup.addView(radioBut6, 5);
                break;
            case 2:
                radioGroup.addView(radioBut6, 0);
                radioGroup.addView(radioBut4, 1);
                radioGroup.addView(radioBut5, 2);
                radioGroup.addView(radioBut2, 3);
                radioGroup.addView(radioBut1, 4);
                radioGroup.addView(radioBut3, 5);
                break;
        }



    }
}
