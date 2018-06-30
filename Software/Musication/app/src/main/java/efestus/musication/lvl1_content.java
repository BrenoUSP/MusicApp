package efestus.musication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class lvl1_content extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_content);

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

        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Teoria Musical", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(lvl1_content.this, lvl1_teomus_1.class);
                startActivity(intent);
            }
        });
    }
}
