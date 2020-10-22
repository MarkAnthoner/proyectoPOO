package ejercicio;

import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Scanner variable = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de alumnos: ");
        int a = sc.nextInt();
        
        while(a < 3){
            System.out.println("Ingrese mas de dos");
            a = sc.nextInt();
        }
        
        String varAux = new String();   //variable auxiliar string
        String varAux2 = new String();   //variable auxiliar string
        int varAux3;   //variable auxiliar
        Alumno alumnos[] = new Alumno[a];   //creo un arreglo de alumnos
        
        for(int i = 0; i<a; i++){   //for que se repetirá segun el numero de alumnos ingresados
            System.out.println("Ingrese los datos del alumno " + (i+1) + ": ");
            System.out.println("Nombre: ");
            varAux = variable.nextLine();
            System.out.println("Apellido: ");
            varAux2 = variable.nextLine();
            System.out.println("Edad: ");
            varAux3 = sc.nextInt();
            alumnos[i] = new Alumno(varAux,varAux2,varAux3);    // a cada alumno (cada uno tendrá una posicion en el arreglo), le mando la informacion 
            
            alumnos[i].AsignarDomicilioAlu();   //tambien a cada alumno se le asignara su domicilo, asignaturas y profesor
            alumnos[i].AsignarAsignaturasAlu();
            System.out.println(" ");
        
            
        }
        
        for(int i = 0; i<a; i++){   //for que se repetirá segun el numero de alumnos ingresados para imprimir todos sus datos
            alumnos[i].imprimir(alumnos[i]);
            System.out.println(" ");
        }
        
        System.out.println("Numero de alumnos creados: " + Alumno.alumnos);
        System.out.println("Numero de profesores creados: " + Profesor.profesores);
    }
    
}
