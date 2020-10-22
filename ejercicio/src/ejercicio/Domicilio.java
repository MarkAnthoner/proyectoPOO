
package ejercicio;

/**
 *
 * @author Marco
 */
public class Domicilio {
    String calle;
    String delegacion;
    int codPostal;
    
    public Domicilio(){ //constructor
        
    }
    
    public Domicilio(String calle, String delegacion, int codPostal){    //constructor
        this.calle = calle;
        this.delegacion = delegacion;
        this.codPostal = codPostal;
    }
    
     public String getCalle(){  //getters y setters
        return calle;
    }
    
    public void setCalle(String calle){
        this.calle = calle;
    }
    
    public String getDelegacion(){
        return delegacion;
    }
    
    public void setDelegacion(String delegacion){
        this.delegacion = delegacion;
    }
    
    public int getCodPostal(){
        return codPostal;
    }
    
    public void setCodPostal(int codPostal){
        this.codPostal = codPostal;
    }
    
}
