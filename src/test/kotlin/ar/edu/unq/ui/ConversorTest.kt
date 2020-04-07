package test.kotlin.ar.edu.unq.ui

import main.kotlin.ar.edu.unq.ui.ConversionKmMillas
import main.kotlin.ar.edu.unq.ui.ConversionMillasKm
import main.kotlin.ar.edu.unq.ui.Conversor
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ConversorTest {
    @Test
    fun millasKmTest() {
        val conversor = Conversor(ConversionMillasKm())
        assertEquals(1.61, conversor.parametrizado(1.00))
        assertEquals(0.00, conversor.parametrizado(0.00))
    }

    @Test
    fun kmMillas() {
        val conversor = Conversor(ConversionKmMillas())
        assertEquals(0.62, conversor.parametrizado(1.00))
        assertEquals(0.00, conversor.parametrizado(0.00))
    }
    /*
    @Test
    fun conversionCombinada() {
        val conversor = Conversor()
        assertEquals(Pair(0.62, 1.61), conversor.combinada(1.00))
        assertEquals(0.62, conversor.combinada(1.00).first)
        assertEquals(1.61, conversor.combinada(1.00).second)
    }
    */

}


