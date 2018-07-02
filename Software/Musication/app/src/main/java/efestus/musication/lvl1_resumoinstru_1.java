package efestus.musication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lvl1_resumoinstru_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl1_resumoinstru_1);

        Button but1 = (Button) findViewById(R.id.button6);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lvl1_resumoinstru_1.this, lvl1_resumoinstru_2.class);
                startActivity(intent);
            }
        });
    }
}
