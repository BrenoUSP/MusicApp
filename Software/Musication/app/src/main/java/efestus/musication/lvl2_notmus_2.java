package efestus.musication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.Random;

public class lvl2_notmus_2 extends AppCompatActivity {

    int points = 0, questions = 0;

    public int getRandomWithExclusion(Random rnd, int start, int end, int... exclude) {
        int random = start + rnd.nextInt(end - start + 1 - exclude.length);
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }

    public void newButton(int but, String note){
        Button but1 = (Button) findViewById(R.id.button5);
        Button but2 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button2);
        Button but5 = (Button) findViewById(R.id.button1);

        switch (but) {
            case 0:
                but1.setText(note);
                break;
            case 1:
                but2.setText(note);
                break;
            case 2:
                but3.setText(note);
                break;
            case 3:
                but4.setText(note);
                break;
            case 4:
                but5.setText(note);
                break;
        }
    }

    public String newNotes(int note){
        switch(note){
            case 0:
                return "C";
            case 1:
                return "D";
            case 2:
                return "E";
            case 3:
                return "F";
            case 4:
                return "G";
            case 5:
                return "A";
            case 6:
                return "B";
            case 7:
                return "dó";
            case 8:
                return "ré";
            case 9:
                return "mi";
            case 10:
                return "fá";
            case 11:
                return "sol";
            case 12:
                return "lá";
            case 13:
                return "si";
        }

        return "";
    }

    public void newNoteBut(){
        Random rand = new Random();

        int note = rand.nextInt(14);

        TextView noteText = (TextView) findViewById(R.id.textView1);

        Button but1 = (Button) findViewById(R.id.button5);
        Button but2 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button2);
        Button but5 = (Button) findViewById(R.id.button1);

        int[] vet = new int[7];
        int[] not = new int[5];

        for(int i = 0; i < 7; i++){
            vet[i] = 1000;
        }

        vet[0] = note;

        if(note < 7){
            vet[1] = note + 7;
        } else {
            vet[1] = note - 7;
        }

        for(int i = 2; i < 7; i++){
            Arrays.sort(vet);
            switch (i) {
                case 2:
                    vet[i] = getRandomWithExclusion(rand, 0, 13, vet);
                    not[i-2] = vet[i];
                    break;
                case 3:
                    vet[i] = getRandomWithExclusion(rand, 0, 13, vet);
                    not[i-2] = vet[i];
                    break;
                case 4:
                    vet[i] = getRandomWithExclusion(rand, 0, 13, vet);
                    not[i-2] = vet[i];
                    break;
                case 5:
                    vet[i] = getRandomWithExclusion(rand, 0, 13, vet);
                    not[i-2] = vet[i];
                    break;
                case 6:
                    vet[i] = getRandomWithExclusion(rand, 0, 13, vet);
                    not[i-2] = vet[i];
                    break;
            }
        }

        but1.setText(newNotes(not[0]));
        but2.setText(newNotes(not[1]));
        but3.setText(newNotes(not[2]));
        but4.setText(newNotes(not[3]));
        but5.setText(newNotes(not[4]));

        switch(note){
            case 0:
                noteText.setText("C");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 1:
                noteText.setText("D");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 2:
                noteText.setText("E");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 3:
                noteText.setText("F");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 4:
                noteText.setText("G");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 5:
                noteText.setText("A");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 6:
                noteText.setText("B");

                newButton(rand.nextInt(5), newNotes(note + 7));
                break;
            case 7:
                noteText.setText("dó");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 8:
                noteText.setText("ré");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 9:
                noteText.setText("mi");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 10:
                noteText.setText("fá");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 11:
                noteText.setText("sol");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 12:
                noteText.setText("lá");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
            case 13:
                noteText.setText("si");

                newButton(rand.nextInt(5), newNotes(note - 7));
                break;
        }
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

        Button but1 = (Button) findViewById(R.id.button5);
        Button but2 = (Button) findViewById(R.id.button4);
        Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button2);
        Button but5 = (Button) findViewById(R.id.button1);

        newNoteBut();

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questions++;

                //String textNote = ((TextView) findViewById(R.id.textView1)).getText().toString();
               // String butText = but1.getText().toString();

                //compareNotes(textNote, butText);

                if(questions == 5){
                    // INDICA A PONTUAÇÃO E VÊ SE PODE IR PRA PRÓXIMA TELA
                } else {

                }

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode


            }
        });

    }
}
