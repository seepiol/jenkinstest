import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CalcolatriceTest {

    Calcolatrice calc = new Calcolatrice();

    @Test
    void testSomma() {
        Assertions.assertEquals(2, calc.somma(1,1), "Somma");
    }

    @Test
    void testSottrazione() {
        Assertions.assertEquals(2, calc.sottrazione(4,2), "Sottrazione");
    }

    @Test
    void testMoltiplicazione() {
        Assertions.assertEquals(4, calc.moltiplicazione(2,2), "Moltiplicazione");
    }

    @Test
    void testDivisione() throws Exception {
        // il metodo non deve generare nessuna eccezione
        Assertions.assertEquals(2, calc.divisione(4,2), "Divisione");
    }

    @Test
    void testDivisionePerZero() {
        int risultato;
        try {
            risultato = calc.divisione(4, 0);
        } catch (Exception e) {
            Assertions.assertEquals("Divisione per zero!", e.getMessage(), "Messaggio di errore");
            Assertions.assertEquals(DivisionePerZero.class, e.getClass(), "Classe eccezione");
        }

    }
}