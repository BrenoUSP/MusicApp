package efestus.musication;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class lvl2_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_content);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        textView1.setText("Nível: " + pref.getInt("level", 0));
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(pref.getString("username", ""));

        String imagePath = pref.getString("image", "");

        if(imagePath != ""){
            byte[] b = Base64.decode(imagePath, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
            ImageView imageView = (ImageView) findViewById(R.id.imageView3);
            imageView.setImageBitmap(bitmap);
        }

        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("level_genre", 0) == 2){
                    //Intent intent = new Intent(lvl2_content.this, lvl2_notmus_1.class);
                    //startActivity(intent);
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_content.this);
                    builder1.setMessage("Comece o ramo de gêneros musicais para começar esse módulo!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }

            }
        });

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("level_instr", 0) == 2){
                    //Intent intent = new Intent(lvl2_content.this, lvl2_notmus_1.class);
                    //startActivity(intent);
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_content.this);
                    builder1.setMessage("Comece o ramo de instrumentos musicais para começar esse módulo!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
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
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                if(pref.getInt("level_teomus", 0) == 2){
                    Intent intent = new Intent(lvl2_content.this, lvl2_notmus_1.class);
                    startActivity(intent);
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(lvl2_content.this);
                    builder1.setMessage("Comece o ramo de teoria musical para começar esse módulo!");

                    builder1.setCancelable(true);

                    builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
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
                Intent intent = new Intent(lvl2_content.this, lvl1_content.class);
                startActivity(intent);
            }
        });

        Button but6 = (Button) findViewById(R.id.button6);
        if(pref.getInt("level", 0) > 2){
            but6.setVisibility(View.VISIBLE);
        }

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lvl2_content.this, lvl3_content.class);
                startActivity(intent);
            }
        });

        Button but7 = (Button) findViewById(R.id.button7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lvl2_content.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
