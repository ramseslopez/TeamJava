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
    public String concatenacion(String c1){
        return cad + c1;
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
    public boolean palindromo(){
        
        Cadena aux = new Cadena(cad);
        if(aux.reversa().toString().equals(cad))
          return true;
        return false;
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

    /**
     * 
     */
    public String toString(){
        return cad;
    }
}
