package efestus.musication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Base64;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode

        TextView textView = (TextView) findViewById(R.id.textView13);
        textView.setText(pref.getString("username", ""));

        String imagePath = pref.getString("image", "");

        if(imagePath != ""){
            byte[] b = Base64.decode(imagePath, Base64.DEFAULT);
            Bitmap bitmap = BitmapFactory.decodeByteArray(b, 0, b.length);
            ImageView imageView = (ImageView) findViewById(R.id.imageView5);
            imageView.setImageBitmap(bitmap);
        }

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Toast toast = Toast.makeText(getApplicationContext(), "Sobre", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(LoginActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

        Button but = (Button) findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode

                if(pref.getString("username", "") != ""){
                    Toast toast = Toast.makeText(getApplicationContext(), "Olá, " + pref.getString("username", "") , Toast.LENGTH_LONG);
                    toast.show();

                    Intent intent;

                    switch(pref.getInt("level", 0)){
                        case 0:
                            intent = new Intent(LoginActivity.this, IntroActivity.class);
                            startActivity(intent);
                            break;
                        case 1:
                            intent = new Intent(LoginActivity.this, lvl1_content.class);
                            startActivity(intent);
                            break;
                        case 2:
                            intent = new Intent(LoginActivity.this, lvl2_content.class);
                            startActivity(intent);
                            break;
                        case 3:
                            intent = new Intent(LoginActivity.this, lvl3_content.class);
                            startActivity(intent);
                            break;
                        case 4:
                            intent = new Intent(LoginActivity.this, lvl4_content.class);
                            startActivity(intent);
                            break;
                    }

                }

            }
        });

        Button but2 = (Button) findViewById(R.id.button3);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Toast toast = Toast.makeText(getApplicationContext(), "Registar perfil", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
