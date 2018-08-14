package mx.unam.ciencias.myp.Cadena;
/**
 * Clase para realizar operaciones con cadenas
 */
public class Cadena{
    private String cad;
    /**
     *
     */
    public Cadena(String cad){
        this.cad = cad;
    }

    /**
     *
     */
    public String concatenacion(String c1){
        return cad + c1;
    }

    /**
     *
     */
    public String reversa(){
        return "";
    }

     /**
      *
      */
    public boolean palindromo(){
        String aux = cad;
        if(aux.reversa() == cad)
          return true;
    }

      /**
       *
       */
    public String repetidos(){
        return "";
    }

      /**
       *
       */
    public String quitaEspacios(){
        return "";
    }
}
