package mx.unam.ciencias.myp.Test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import mx.unam.ciencias.myp.Cadena;
/**
 * 
 */
public class TestCadena{

    @Test
    public void testConstructor(){

    }
    @Test
    public void testConcatenacion(){

    }

    /**
     * Prueba unitaria para {@link Cadena#reversa}
     */
    @Test
    public void testReversa(){
        String reversa = "Bedfordshire";
        Cadena prueba = new Cadena(reversa);
        Assert.assertTrue(prueba.reversa().equals("erihsdrofdeB"));
        Assert.assertFalse(prueba.reversa().equals("hola mom"));
    }

    @Test
    public void testPalindromo(){

    }

    @Test
    public void testRepetidos(){

    }

    @Test
    public void testQuitaEspacios(){
        
    }
}