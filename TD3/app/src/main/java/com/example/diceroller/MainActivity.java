package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String nb_face="6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Affichage1 = (TextView) findViewById(R.id.TexteView);
        TextView Affichage2 = (TextView) findViewById(R.id.TexteView2);
        Button rollButton = (Button) findViewById(R.id.Bouton_lancer_de_de);

        EditText Affichage_nb_face = (EditText) findViewById(R.id.TextView_nb_face);
        Button validButton = (Button) findViewById(R.id.validation_face);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this, "Dé lancé!", Toast.LENGTH_SHORT);
                toast.show();
                Affichage2.setText(alea(Integer.parseInt(nb_face)));
                Affichage1.setText(alea(Integer.parseInt(nb_face)));
            }
        });

        validButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nb_face=Affichage_nb_face.getText().toString();
                Toast toast = Toast.makeText(MainActivity.this, "Nb de face pris en compte : "+nb_face, Toast.LENGTH_SHORT);
                toast.show();

            }
        });

    }

    private String alea(int n){
        Random random = new Random();
        return String.valueOf(random.nextInt(n));
    }

}