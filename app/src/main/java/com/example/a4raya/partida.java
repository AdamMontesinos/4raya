package com.example.a4raya;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class partida extends AppCompatActivity {

    ImageView Cuadro[][] = new ImageView[6][7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida);

        Cuadro[0][0] = findViewById(R.id.imageButton9);
        Cuadro[0][1] = findViewById(R.id.imageButton47);
        Cuadro[0][2] = findViewById(R.id.imageButton48);
        Cuadro[0][3] = findViewById(R.id.imageButton49);
        Cuadro[0][4] = findViewById(R.id.imageButton50);
        Cuadro[0][5] = findViewById(R.id.imageButton51);
        Cuadro[0][6] = findViewById(R.id.imageButton52);

        Cuadro[1][0] = findViewById(R.id.imageButton55);
        Cuadro[1][1] = findViewById(R.id.imageButton56);
        Cuadro[1][2] = findViewById(R.id.imageButton57);
        Cuadro[1][3] = findViewById(R.id.imageButton58);
        Cuadro[1][4] = findViewById(R.id.imageButton59);
        Cuadro[1][5] = findViewById(R.id.imageButton60);
        Cuadro[1][6] = findViewById(R.id.imageButton61);

        Cuadro[2][0] = findViewById(R.id.imageButton65);
        Cuadro[2][1] = findViewById(R.id.imageButton66);
        Cuadro[2][2] = findViewById(R.id.imageButton67);
        Cuadro[2][3] = findViewById(R.id.imageButton68);
        Cuadro[2][4] = findViewById(R.id.imageButton69);
        Cuadro[2][5] = findViewById(R.id.imageButton70);
        Cuadro[2][6] = findViewById(R.id.imageButton71);

        Cuadro[3][0] = findViewById(R.id.imageButton73);
        Cuadro[3][1] = findViewById(R.id.imageButton76);
        Cuadro[3][2] = findViewById(R.id.imageButton77);
        Cuadro[3][3] = findViewById(R.id.imageButton78);
        Cuadro[3][4] = findViewById(R.id.imageButton79);
        Cuadro[3][5] = findViewById(R.id.imageButton80);
        Cuadro[3][6] = findViewById(R.id.imageButton81);

        Cuadro[4][0] = findViewById(R.id.imageButton74);
        Cuadro[4][1] = findViewById(R.id.imageButton82);
        Cuadro[4][2] = findViewById(R.id.imageButton83);
        Cuadro[4][3] = findViewById(R.id.imageButton84);
        Cuadro[4][4] = findViewById(R.id.imageButton85);
        Cuadro[4][5] = findViewById(R.id.imageButton86);
        Cuadro[4][6] = findViewById(R.id.imageButton87);

        Cuadro[5][0] = findViewById(R.id.imageButton75);
        Cuadro[5][1] = findViewById(R.id.imageButton88);
        Cuadro[5][2] = findViewById(R.id.imageButton89);
        Cuadro[5][3] = findViewById(R.id.imageButton90);
        Cuadro[5][4] = findViewById(R.id.imageButton91);
        Cuadro[5][5] = findViewById(R.id.imageButton92);
        Cuadro[5][6] = findViewById(R.id.imageButton93);

        PosarColor();
    }

    public void AgafarPosicio(View view) {
        String Casilla = view.getTag().toString();
        //con este codigo cogemos la posicion de la casilla y la dividimos en:row y col
        int row = Character.getNumericValue(Casilla.charAt(0));
        int col = Character.getNumericValue(Casilla.charAt(1));
        int row1 = row;
        int col1 = col;
        //Almacena en las variables row y col las posiciones de la pieza en el tablero
        if (Cuadro[row][col] != null) {//se activa si clicas una pieza
            Cuadro[row][col].setBackgroundColor(Color.parseColor("#3b83bd05"));
        }
    }

    public void PosarColor() {
        int contador;
        contador = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 6; j++) {
                if (Cuadro[i][j] != null && contador==0){
                    Cuadro[i][j].setBackgroundColor(Color.parseColor("#ffd700"));
                    contador = 1;
                }
                else if (Cuadro[i][j] != null && contador==1){
                    Cuadro[i][j].setBackgroundColor(Color.parseColor("#bb1144"));
                    contador = 0;
                }
            }
        }
    }
}
        