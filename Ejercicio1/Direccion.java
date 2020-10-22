
public class Direccion {
    String calle;
    int numero;
    String colonia;
    String municipio;
    String estado;

    public Direccion (String calle, int numero, String colonia, String municipio, String estado){
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.municipio = municipio;
        this.estado = estado;
    }

    public void print(){
        System.out.printf("Direccion: %ncalle: %s numero: %d colonia: %s municipio: %s estado: %s %n",this.calle,
        this.numero,this.colonia,this.municipio,this.estado);
    }
}
