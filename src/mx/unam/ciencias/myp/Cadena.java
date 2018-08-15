package mx.unam.ciencias.myp;
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
    public String concatenacion(){
        return "";
    }

    /**
     * 
     */
    public String reversa(){
        String reversa = "";
        for(int i = cad.length() - 1; i >= 0; i--){
            reversa += cad.charAt(i);
        }
        return reversa;
    }

     /**
      * 
      */
    public String palindromo(){
        return "";
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