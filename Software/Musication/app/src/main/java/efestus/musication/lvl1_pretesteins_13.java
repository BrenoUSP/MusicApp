package efestus.musication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lvl1_pretesteins_13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_pretesteins_13);

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("nivelamento_instr", 0) != 0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    editor.putInt("nivelamento_instr", pref.getInt("nivelamento_instr", 0) - 1);
                    editor.commit();
                    builder1.setMessage("Você tem " + pref.getInt("nivelamento_instr", 0) + " tentativa(s)!");

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
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    builder1.setMessage("Você não tem mais tentativas!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_pretesteins_13.this, lvl1_pretesteins_0.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lvl1_pretesteins_13.this, lvl1_pretesteins_14.class);
                startActivity(intent);
            }
        });

        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("nivelamento_instr", 0) != 0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    editor.putInt("nivelamento_instr", pref.getInt("nivelamento_instr", 0) - 1);
                    editor.commit();
                    builder1.setMessage("Você tem " + pref.getInt("nivelamento_instr", 0) + " tentativa(s)!");

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
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    builder1.setMessage("Você não tem mais tentativas!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_pretesteins_13.this, lvl1_pretesteins_0.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("nivelamento_instr", 0) != 0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    editor.putInt("nivelamento_instr", pref.getInt("nivelamento_instr", 0) - 1);
                    editor.commit();
                    builder1.setMessage("Você tem " + pref.getInt("nivelamento_instr", 0) + " tentativa(s)!");

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
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    builder1.setMessage("Você não tem mais tentativas!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_pretesteins_13.this, lvl1_pretesteins_0.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });

        Button but5 = (Button) findViewById(R.id.button5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("nivelamento_instr", 0) != 0){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    editor.putInt("nivelamento_instr", pref.getInt("nivelamento_instr", 0) - 1);
                    editor.commit();
                    builder1.setMessage("Você tem " + pref.getInt("nivelamento_instr", 0) + " tentativa(s)!");

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
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl1_pretesteins_13.this);
                    builder1.setMessage("Você não tem mais tentativas!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    Intent intent = new Intent(lvl1_pretesteins_13.this, lvl1_pretesteins_0.class);
                                    startActivity(intent);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });
    }
}
