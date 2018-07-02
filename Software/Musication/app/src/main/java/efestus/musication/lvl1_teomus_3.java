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

public class lvl1_teomus_3 extends AppCompatActivity {
    int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_teomus_3);

        Button but = (Button) findViewById(R.id.button4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // PRIMEIRA QUESTÃO

                RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radio_group1);
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radio_group2);
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radio_group3);
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radio_group4);
                RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radio_group5);

                int radioButtonID1 = radioGroup1.getCheckedRadioButtonId();

                if (radioButtonID1 >= 0) {
                    View radioButton = radioGroup1.findViewById(radioButtonID1);
                    int idx = radioGroup1.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup1.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton3);

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
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton22);

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
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton35);

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
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton43);

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

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if (points == 5) {
                    points = 0;
                    clearRadio();

                    if (pref.getInt("level", 0) <= 3) {
                        editor.putInt("level", 4);
                    }

                    if (pref.getInt("level_teomus", 0) < 4) {
                        editor.putInt("level_teomus", 4);
                    }

                    editor.commit();

                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_3.this);
                    editor.putInt("nivelamento_teomus", 0);
                    builder1.setMessage("Você desbloqueou todos os níveis do ramo de teoria musical!");
                    points = 0;
                    clearRadio();
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_teomus_3.this, lvl4_content.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();

                } else {
                    if (pref.getInt("nivelamento_teomus", 0) != 0) {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_3.this);
                        editor.putInt("nivelamento_teomus", pref.getInt("nivelamento_teomus", 0) - 1);
                        editor.commit();
                        builder1.setMessage("Você desbloqueou o módulo de Notas Musicais!");
                        points = 0;
                        clearRadio();
                        builder1.setCancelable(true);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                        Intent intent = new Intent(lvl1_teomus_3.this, lvl3_content.class);
                                        startActivity(intent);
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    } else {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_3.this);
                        builder1.setMessage("Você não tem mais tentativas!");
                        points = 0;
                        clearRadio();
                        builder1.setCancelable(true);

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                        Intent intent = new Intent(lvl1_teomus_3.this, LoginActivity.class);
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

        radioGroup1.clearCheck();
        radioGroup2.clearCheck();
        radioGroup3.clearCheck();
        radioGroup4.clearCheck();
        radioGroup5.clearCheck();
    }
}