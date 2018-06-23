package efestus.musication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class lvl2_notmus_2 extends AppCompatActivity {

    int points = 0, questions = 0;

    public void newNotes(){

    }

    public void compareNotes(String textNote, String butText){
        switch(textNote){
            case "C":
                if (butText.equals("dó")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "D":
                if (butText.equals("ré")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "E":
                if (butText.equals("mi")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "F":
                if (butText.equals("fá")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "G":
                if (butText.equals("sol")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "A":
                if (butText.equals("lá")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "B":
                if (butText.equals("si")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "dó":
                if (butText.equals("C")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "ré":
                if (butText.equals("D")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "mi":
                if (butText.equals("E")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "fá":
                if (butText.equals("F")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "sol":
                if (butText.equals("G")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "lá":
                if (butText.equals("A")){
                    // FORMATA TUDO
                    points++;
                }
                break;
            case "si":
                if (butText.equals("B")){
                    // FORMATA TUDO
                    points++;
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_notmus_2);

        newNotes();

        final Button but1 = (Button) findViewById(R.id.button5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questions++;

                String textNote = ((TextView) findViewById(R.id.textView1)).getText().toString();
                String butText = but1.getText().toString();

                compareNotes(textNote, butText);

                if(questions == 5){
                    // INDICA A PONTUAÇÃO E VÊ SE PODE IR PRA PRÓXIMA TELA
                } else {

                }

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode

                /*if(pref.getString("username", "") != ""){
                    Toast toast = Toast.makeText(getApplicationContext(), "Olá, " + pref.getString("username", "") , Toast.LENGTH_LONG);
                    toast.show();

                    Intent intent = new Intent(LoginActivity.this, IntroActivity.class);
                    startActivity(intent);
                }
                */
            }
        });
    }
}
