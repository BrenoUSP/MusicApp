package efestus.musication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class lvl1_teomus_2 extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_teomus_2);

        final Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PRIMEIRA QUESTÃO

                RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
                RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radio_group5);
                RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radio_group6);
                RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radio_group7);
                RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radio_group8);
                RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radio_group9);
                RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radio_group10);

                int radioButtonID1 = radioGroup1.getCheckedRadioButtonId();

                if (radioButtonID1 >= 0) {
                    View radioButton = radioGroup1.findViewById(radioButtonID1);
                    int idx = radioGroup1.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup1.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton2);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // SEGUNDA QUESTÃO

                int radioButtonID2 = radioGroup2.getCheckedRadioButtonId();

                if (radioButtonID2 >= 0) {
                    View radioButton = radioGroup2.findViewById(radioButtonID2);
                    int idx = radioGroup2.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup2.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton23);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // TERCEIRA QUESTÃO

                int radioButtonID3 = radioGroup3.getCheckedRadioButtonId();

                if (radioButtonID3 >= 0) {
                    View radioButton = radioGroup3.findViewById(radioButtonID3);
                    int idx = radioGroup3.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup3.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton34);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // QUARTA QUESTÃO

                int radioButtonID4 = radioGroup4.getCheckedRadioButtonId();

                if (radioButtonID4 >= 0) {
                    View radioButton = radioGroup4.findViewById(radioButtonID4);
                    int idx = radioGroup4.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup4.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton42);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // QUINTA QUESTÃO

                int radioButtonID5 = radioGroup5.getCheckedRadioButtonId();

                if (radioButtonID5 >= 0) {
                    View radioButton = radioGroup5.findViewById(radioButtonID5);
                    int idx = radioGroup5.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup5.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton51);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // SEXTA QUESTÃO

                int radioButtonID6 = radioGroup6.getCheckedRadioButtonId();

                if (radioButtonID6 >= 0) {
                    View radioButton = radioGroup6.findViewById(radioButtonID6);
                    int idx = radioGroup6.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup6.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton62);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // SÉTIMA QUESTÃO

                int radioButtonID7 = radioGroup7.getCheckedRadioButtonId();

                if (radioButtonID7 >= 0) {
                    View radioButton = radioGroup7.findViewById(radioButtonID7);
                    int idx = radioGroup7.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup7.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton71);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // OITAVA QUESTÃO

                int radioButtonID8 = radioGroup8.getCheckedRadioButtonId();

                if (radioButtonID8 >= 0) {
                    View radioButton = radioGroup8.findViewById(radioButtonID8);
                    int idx = radioGroup8.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup8.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton84);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // NONA QUESTÃO

                int radioButtonID9 = radioGroup9.getCheckedRadioButtonId();

                if (radioButtonID9 >= 0) {
                    View radioButton = radioGroup9.findViewById(radioButtonID9);
                    int idx = radioGroup9.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup9.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton93);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                // DÉCIMA QUESTÃO

                int radioButtonID10 = radioGroup10.getCheckedRadioButtonId();

                if (radioButtonID10 >= 0) {
                    View radioButton = radioGroup10.findViewById(radioButtonID10);
                    int idx = radioGroup10.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup10.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton103);

                    if (r.equals(c)) {
                        points++;
                    }

                }

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if (points == 10) {
                    points = 0;
                    clearRadio();

                    if (pref.getInt("level", 0) <= 2) {
                        editor.putInt("level", 3);
                    }

                    if (pref.getInt("level_teomus", 0) < 3) {
                        editor.putInt("level_teomus", 3);
                    }

                    editor.commit();

                    Intent intent = new Intent(lvl1_teomus_2.this, lvl1_teomus_3.class);
                    startActivity(intent);

                } else {
                    if(pref.getInt("nivelamento_teomus", 0) != 0){
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_2.this);
                        editor.putInt("nivelamento_teomus", pref.getInt("nivelamento_teomus", 0) - 1);
                        editor.commit();
                        builder1.setMessage("Você errou pelo menos uma questão! Você tem mais " + pref.getInt("nivelamento_teomus", 0) + " tentativa(s)!");
                        points = 0;
                        clearRadio();
                        builder1.setCancelable(true);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    } else {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_2.this);
                        builder1.setMessage("Você não tem mais tentativas!");
                        points = 0;
                        clearRadio();
                        builder1.setCancelable(true);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                        Intent intent = new Intent(lvl1_teomus_2.this, LoginActivity.class);
                                        startActivity(intent);
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                }
            }
        });

    }

    public void clearRadio() {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
        RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
        RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radio_group5);
        RadioGroup radioGroup6 = (RadioGroup) findViewById(R.id.radio_group6);
        RadioGroup radioGroup7 = (RadioGroup) findViewById(R.id.radio_group7);
        RadioGroup radioGroup8 = (RadioGroup) findViewById(R.id.radio_group8);
        RadioGroup radioGroup9 = (RadioGroup) findViewById(R.id.radio_group9);
        RadioGroup radioGroup10 = (RadioGroup) findViewById(R.id.radio_group10);

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
        radioGroup6.clearCheck();
        radioGroup7.clearCheck();
        radioGroup8.clearCheck();
        radioGroup9.clearCheck();
        radioGroup10.clearCheck();
    }
}