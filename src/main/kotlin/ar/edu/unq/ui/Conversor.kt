package main.kotlin.ar.edu.unq.ui

import kotlin.Double

public class Conversor {
    // toma el valor (double) en millas y lo convierte a kilometros.
    // valor referencia: 1 milla = 1.61 kilometro (1.609344)
    fun millasKm(millas: Double): Double {
        return millas*1.61
    }
}