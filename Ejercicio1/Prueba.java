public class Prueba {
    public static void main (String[] args){
        Direccion direccion = new Direccion();
        Direccion direccion2 = new Direccion();
        direccion.numero=1;
        direccion2.numero=1;
        System.out.println(direccion.numero==direccion2.numero);

    }
}
