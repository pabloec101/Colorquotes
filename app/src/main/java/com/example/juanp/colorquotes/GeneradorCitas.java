package com.example.juanp.colorquotes;

import android.graphics.Color;

/**
 * Created by juanp on 5/07/2016.
 */
public class GeneradorCitas {

    private Cita[] mCitas;
    private int[] mColorsArray = {Color.CYAN,Color.RED,Color.BLACK,Color.GRAY,Color.YELLOW,Color.GREEN,Color.MAGENTA};

    public GeneradorCitas() {
        mCitas = new Cita[5];

        mCitas[0] = new Cita();
        mCitas[0].setAutor("Walt Disney");
        mCitas[0].setTexto("Aprendí que lo difícil no es llegar a la cima, sino jamás dejar de subir");

        mCitas[1] = new Cita();
        mCitas[1].setAutor("Albert Einstein");
        mCitas[1].setTexto("La imaginación es más importante que el conocimiento");

        mCitas[2] = new Cita();
        mCitas[2].setAutor("Steve Jobs");
        mCitas[2].setTexto("Tu tiempo es limitado, así que no lo desperdicies viviendo la vida de otra persona");

        mCitas[3] = new Cita();
        mCitas[3].setAutor("Albert Camus");
        mCitas[3].setTexto("El éxito es fácil de obtener. Lo difícil es merecerlo.");

        mCitas[4] = new Cita();
        mCitas[4].setAutor("Irving Berlin");
        mCitas[4].setTexto("El sabio no dice lo que sabe, y el necio no sabe lo que dice.");
    }

    public Cita getCitaAleatoria() {
        Cita cita = mCitas[Utils.getNumeroAleatorio(mCitas.length)];
        cita.setColor(mColorsArray[Utils.getNumeroAleatorio(mColorsArray.length)]);
        return cita;
    }

}
