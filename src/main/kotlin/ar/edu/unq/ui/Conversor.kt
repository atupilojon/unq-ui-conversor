package main.kotlin.ar.edu.unq.ui

import kotlin.Double

class Conversor(val strategy: StrategyConversion) {

    /*
    fun millasKm(millas: Double): Double {
        // toma el valor (double) en millas y lo convierte a kilometros.
        // valor referencia: 1 milla = 1.61 kilometro (1.609344)
        return millas*1.61
    }

    fun kmMillas(km: Double): Double {
        // toma el valor (double) en kilometros y lo convierte a millas.
        // valor referencia: 1 kilometro = 0.62 millas (0.621371)
        return km * 0.62
    }

    fun combinada(magnitud: Double): Pair<Double,Double> {
        // toma una magnitud y retorna una tupla (A,B) donde:
        //      A = magnitud en kilometros convertida a millas
        //      B = magnitud en millas convertida a kilometros
        return Pair(this.kmMillas(magnitud),this.millasKm(magnitud))
    }
    */

    fun parametrizado(magnitud: Double): Double {
        // toma una magnitud y le delega el calculo a la variable
        // que colabora (strategy)
        return strategy.convertirMagnitud(magnitud)
    }
}

interface StrategyConversion {

    fun convertirMagnitud(magnitud: Double): Double

}

class ConversionMillasKm: StrategyConversion {

    override fun convertirMagnitud(millas: Double): Double {
        return millas * 1.61
    }

}

class ConversionKmMillas: StrategyConversion {

    override fun convertirMagnitud(km: Double): Double {
        return km * 0.62
    }

}