package efestus.musication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class lvl2_notmus_6 extends AppCompatActivity {
    Button but1 = (Button) findViewById(R.id.button5);
    Button but2 = (Button) findViewById(R.id.button4);
    Button but3 = (Button) findViewById(R.id.button3);
    Button but4 = (Button) findViewById(R.id.button2);
    Button but5 = (Button) findViewById(R.id.button1);
    Button but6 = (Button) findViewById(R.id.button6);

    public void generateQuestion(int q){
        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        switch(q){
            case 0:
                textView1.setText("C");
                textView2.setText("Um tom e meio ou um tom + um semitom a direita a essa nota:");
                but1.setText("D#"); // CERTA
                but2.setText("D");
                but3.setText("F");
                but4.setText("A#");
                but5.setText("G");
                break;
            case 1:
                textView1.setText("E");
                textView2.setText("Um tom e meio ou um tom + um semitom a esquerda a essa nota:");
                but1.setText("A");
                but2.setText("Eb");
                but3.setText("F");
                but4.setText("C#"); // CERTA
                but5.setText("G");
                break;
            case 2:
                textView1.setText("D#");
                textView2.setText("Dois tons e meio ou dois tons + um semitom a direita a essa nota:");
                but1.setText("D#");
                but2.setText("D");
                but3.setText("G"); // CERTA
                but4.setText("F#");
                but5.setText("G#");
                break;
        }
    }

    public boolean check(String note, int q){
        switch(q){
            case 0:
                if(note.equals("D#")){
                    return true;
                } else {
                    return false;
                }
            case 1:
                if(note.equals("C#")){
                    return true;
                } else {
                    return false;
                }
            case 2:
                if(note.equals("G")){
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_notmus_6);

        Random rand = new Random();

        final int q = rand.nextInt(3);

        generateQuestion(q);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check(but1.getText().toString(), q)){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta correta!");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    but6.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta incorreta!");
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

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check(but2.getText().toString(), q)){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta correta!");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    but6.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta incorreta!");
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
                };
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check(but3.getText().toString(), q)){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta correta!");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    but6.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta incorreta!");
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

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check(but4.getText().toString(), q)){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta correta!");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    but6.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta incorreta!");
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

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check(but5.getText().toString(), q)){
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta correta!");
                    builder1.setCancelable(true);

                    builder1.setPositiveButton(
                            "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                    but6.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_notmus_6.this);
                    builder1.setMessage("Resposta incorreta!");
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
