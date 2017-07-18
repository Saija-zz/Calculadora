package com.saija.android.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText pantalla;

    private long operandoA = 0;
    private long operandoB = 0;
    private char operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basico);

        /*
        try {
            pantalla = (EditText) findViewById(R.id.screen);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        */
    }

    /*public void onClickNumbers(View view) {

        Button leBoton = (Button)view;

        String txtBoton = leBoton.getText().toString();
        try{
            int numBoton = Integer.parseInt(txtBoton);
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append(pantalla.getText().toString());
            strBuilder.append(numBoton);

            pantalla.setText(strBuilder.toString());

        }catch(NumberFormatException nfe){
            pantalla.setText(nfe.getMessage());
        }

    }*/

    public void onClickPi(View view) {
        pantalla.setText(String.valueOf(Math.PI));
    }

    public void onClickOperator(View view) {
        Button leBoton = (Button)view;

        String txtBoton = leBoton.getText().toString();

        try{

        }catch(Exception nfe){
            pantalla.setText(nfe.getMessage());
        }

    }
}
