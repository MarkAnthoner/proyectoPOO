/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Asignatura {
    
    String nombre;
    String semestre;
    int creditos;
    Profesor profeAsignatura = new Profesor();
    
    public Asignatura(){    //constructor
        
    }
    
    public Asignatura(String nombre, String semestre, int creditos){    //constructor
        this.nombre = nombre;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
     public String getNombre(){  //getters y setters
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getSemestre(){
        return semestre;
    }
    
    public void setSemestre(String semestre){
        this.semestre = semestre;
    }
    
    public int getCreditos(){
        return creditos;
    }
    
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    
    public void asignarProfesor(){
        String nombre;
        String apellido; 
        int edad;
        Scanner variable = new Scanner(System.in);
        Profesor.profesores+=1;
      
        System.out.println("Ingrese al profesor");
        System.out.println("Nombre: ");
        nombre = variable.nextLine();
        System.out.println("Apellido: ");
        apellido = variable.nextLine();
        System.out.println("Edad: ");
        edad = variable.nextInt();
        
        profeAsignatura.setNombre(nombre);
        profeAsignatura.setApellido(apellido);
        profeAsignatura.setEdad(edad);
    }
    
    public void imprimirAsignaturas(){
        System.out.println("Nombre asignatura: " + this.getNombre());
        System.out.println("Semestre: " + this.getSemestre());
        System.out.println("Creditos: " + this.getCreditos());
    }
    
}
