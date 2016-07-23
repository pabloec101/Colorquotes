package com.example.juanp.colorquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button mBotonCita;

    private TextView mTextoCita;

    private TextView mTextoAutor;

    private static final String TAG = MainActivity.class.getName();

    private String[] mCitas = new String[7];
    private String[] mAutores = new String[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotonCita = (Button) findViewById(R.id.botonCita);
        mTextoCita = (TextView) findViewById(R.id.textoCita);
        mTextoAutor = (TextView) findViewById(R.id.textoAutor);

    }

    public void nuevaCita(View v) {
        Log.d(TAG, "El botón ha sido presionado desde xml");

        GeneradorCitas generadorCitas = new GeneradorCitas();
        Cita cita = generadorCitas.getCitaAleatoria();
            mTextoCita.setText(cita.getTexto());
        mTextoCita.setTextColor(cita.getColor());
        mTextoAutor.setText(cita.getAutor());
        mTextoAutor.setTextColor(cita.getColor());
        mBotonCita.setBackgroundColor(cita.getColor());

        Log.d(TAG, "Color aleatorio: " + cita.getColor());
    }


}
