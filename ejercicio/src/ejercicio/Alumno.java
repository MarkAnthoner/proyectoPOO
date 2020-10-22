
package ejercicio;

import java.util.Scanner;
/**
 *
 * @author Marco 
 */
public class Alumno {
    static int alumnos;
    String nombre;
    String apellido;
    int edad;
    Domicilio dom = new Domicilio();
    Asignatura asig[] = new Asignatura[3];
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String apellido, int edad){    //constructor
        alumnos += 1;   //cada que se agregue un nuevo alumno, se incrementará el contador
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre(){  //getters y setters
        return nombre;
    }
    
    public void setNombre(String nombre){
        
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void AsignarDomicilioAlu(){    //interaccion de Alumno con Domicilio
        String calle;
        String delegacion; 
        int codPostal;
        Scanner variable = new Scanner(System.in);
      
        System.out.println("Ingrese el domicilio del alumno");
        System.out.println("Calle: ");
        calle = variable.nextLine();
        System.out.println("Delegacion: ");
        delegacion = variable.nextLine();
        System.out.println("Codigo postal: ");
        codPostal = variable.nextInt();
        
        dom.setCalle(calle);
        dom.setDelegacion(delegacion);
        dom.setCodPostal(codPostal);
        
    }
    
    public void AsignarAsignaturasAlu(){    //interaccion de Alumno con Domicilio
       
        Scanner variable = new Scanner(System.in);
        Scanner var = new Scanner(System.in);
        Scanner var1 = new Scanner(System.in);
        System.out.println("Ingrese el numero de asignaturas de los alumnos (al menos 3)");
        int k = var1.nextInt();
        
        while(k < 3){
            System.out.println("Ingrese mas de dos");
            k = var1.nextInt();
        }
        
        System.out.println("Ingrese las asignaturas del alumno");
        System.out.println("Ingrese primero nombre, luego semestre (en palabras) y finalmente creditos (en numero)");
        for(int i = 0; i<k; i++){
            System.out.println("Asignatura " + (i+1));
            asig[i] = new Asignatura(variable.nextLine(),variable.nextLine(),var.nextInt());
            asig[i].asignarProfesor();
        }
        
    }
    
    public void imprimir(Alumno alu){
        System.out.println("Alumno");
        System.out.println("Nombre: " + alu.getNombre());
        System.out.println("Apellido: " + alu.getApellido());
        System.out.println("Edad: " + alu.getEdad());
        System.out.println("Domicilio");
        System.out.println("Calle: " + alu.dom.getCalle());
        System.out.println("Delegacion: " + alu.dom.getDelegacion());
        System.out.println("Codigo postal: " + alu.dom.getCodPostal());
        System.out.println("Asignaturas");
        
        int i = 1;
        for(Asignatura recorrido:asig){
            System.out.println("Asignatura " + i);
            recorrido.imprimirAsignaturas();
            recorrido.profeAsignatura.imprimirProfesor();
            i++;
        }
        
    }
    
}
