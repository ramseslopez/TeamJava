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

    private Cadena cad;

    @Test
    public void testConstructor(){
        cad = new Cadena("");
    }
    @Test
    public void testConcatenacion(){
      Assert.assertFalse(cad.concatenacion("1").equals(cad));
      String c = " ";
      Assert.assertTrue(cad.concatenacion(" ").equals(cad + c));
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
      Assert.assertTrue(cad.palindromo());
      String aux = cad.reversa();
      Assert.assertTrue(aux.equals(cad.toString()));
    }

    @Test
    public void testRepetidos(){

    }

    @Test
    public void testQuitaEspacios(){

    }
}
