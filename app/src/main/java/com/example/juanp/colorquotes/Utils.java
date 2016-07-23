package com.example.juanp.colorquotes;

import java.util.Random;

/**
 * Created by juanp on 5/07/2016.
 */
public class Utils {

    public static int getNumeroAleatorio(int max) {
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        int numeroAleatorio = rand.nextInt(max);

        return numeroAleatorio;
    }

}
