package test.kotlin.ar.edu.unq.ui

import main.kotlin.ar.edu.unq.ui.Conversor
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ConversorTest {
    @Test
    fun millasKmTest() {
        val conversor = Conversor()
        assertEquals(1.61, conversor.millasKm(1.00))
        assertEquals(0.00, conversor.millasKm(0.00))
    }

}

