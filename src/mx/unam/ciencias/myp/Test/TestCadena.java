package mx.unam.ciencias.myp.test;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
/**
 *
 */
public class TestCadena{

    private Cadena cad;

    @Test
    public void testConstructor(){

    }
    @Test
    public void testConcatenacion(){
      Assert.assertTrue(cad.concatenacion());
      String c = " ";
      Assert.assertTrue(cad.concatenacion() == cad + c);
    }

    @Test
    public void testReversa(){

    }

    @Test
    public void testPalindromo(){
      Assert.assertTrue(cad.palindromo());
      String aux = cad.reversa();
      Assert.assertTrue(aux == cad);
    }

    @Test
    public void testRepetidos(){

    }

    @Test
    public void testQuitaEspacios(){

    }
}
