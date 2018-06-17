package efestus.musication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        Button but = (Button) findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Toast toast = Toast.makeText(getApplicationContext(), "Notas Musicais", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(IntroActivity.this, lvl2_notmus_1.class);
                startActivity(intent);
            }
        });
    }
}
