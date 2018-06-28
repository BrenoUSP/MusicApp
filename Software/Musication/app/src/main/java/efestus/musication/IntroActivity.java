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

import org.w3c.dom.Text;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

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

        Button but = (Button) findViewById(R.id.button1);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                AlertDialog.Builder builder1 = new AlertDialog.Builder(IntroActivity.this);
                builder1.setMessage("Você está agora nos módulos de nível 1!");

                builder1.setCancelable(true);

                builder1.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();


                        Toast toast = Toast.makeText(getApplicationContext(), "Nível 1", Toast.LENGTH_LONG);
                        toast.show();

                        Intent intent = new Intent(IntroActivity.this, lvl1_content.class);
                        startActivity(intent);
                        }
                });

                AlertDialog alert11 = builder1.create();
                alert11.show();

                if(pref.getInt("level", 0) == 0){
                    editor.putInt("level", 1);
                    editor.commit();
                }

                TextView textView1 = (TextView) findViewById(R.id.textView1);
                textView1.setText("Nível: " + pref.getInt("level", 0));

            }
        });
    }
}
