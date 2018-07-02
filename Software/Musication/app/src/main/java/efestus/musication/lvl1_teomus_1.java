package efestus.musication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class lvl1_teomus_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_teomus_1);

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_1.this);
                builder1.setMessage("Você está agora nos módulos de nível 2!");

                builder1.setCancelable(true);

                builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();


                        Toast toast = Toast.makeText(getApplicationContext(), "Nível 2", Toast.LENGTH_LONG);
                        toast.show();

                        Intent intent = new Intent(lvl1_teomus_1.this, lvl2_content.class);
                        startActivity(intent);
                    }
                });

                AlertDialog alert11 = builder1.create();
                alert11.show();

                if(pref.getInt("level_teomus", 0) == 0){
                    editor.putInt("level_teomus", 2);
                }

                if(pref.getInt("level", 0) == 1){
                    editor.putInt("level", 2);
                    editor.commit();
                }

            }
        });

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("nivelamento_teomus", 0) != 0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_1.this);
                    editor.putInt("nivelamento_teomus", pref.getInt("nivelamento_teomus", 0) - 1);
                    builder1.setMessage("Você tem " + pref.getInt("nivelamento_teomus", 0) + " tentativas!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_teomus_1.this, lvl1_teomus_2.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_teomus_1.this);
                    builder1.setMessage("Você não tem mais tentativas!");

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
                }
            }
        });


    }
}
