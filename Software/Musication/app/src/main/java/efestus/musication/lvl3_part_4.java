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

public class lvl3_part_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl3_part_4);

        Button but = (Button) findViewById(R.id.button4);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);

                int radioButtonID1 = radioGroup.getCheckedRadioButtonId();

                if (radioButtonID1 >= 0) {
                    View radioButton = radioGroup.findViewById(radioButtonID1);
                    int idx = radioGroup.indexOfChild(radioButton);
                    RadioButton r = (RadioButton) radioGroup.getChildAt(idx);
                    RadioButton c = (RadioButton) findViewById(R.id.radioButton3);

                    if (r.equals(c)) {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl3_part_4.this);
                        builder1.setMessage("Resposta correta!");
                        builder1.setCancelable(true);

                        radioGroup.clearCheck();

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                        Intent intent = new Intent(lvl3_part_4.this, lvl3_part_5.class);
                                        startActivity(intent);
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    } else {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl3_part_4.this);
                        builder1.setMessage("Resposta incorreta!");
                        builder1.setCancelable(true);

                        radioGroup.clearCheck();

                        builder1.setPositiveButton(
                                "Ok",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                });

                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }

                }

            }
        });
    }
}
