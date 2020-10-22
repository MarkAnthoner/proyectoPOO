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
public class Profesor {
    
    static int profesores;  //variable estática
    String nombre;
    String apellido;
    int edad;
    
    public Profesor(){
        
    }
    
    public Profesor(String nombre, String apellido, int edad){    //constructor
        profesores += 1;   //cada que se agregue un nuevo alumno, se incrementará el contador
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
    
    public void imprimirProfesor(){    //interaccion de Alumno con Domicilio
       
        System.out.println("Nombre profesor: " + this.getNombre());
        System.out.println("Apellido del profesor: " + this.getApellido());
        System.out.println("Edad: " + this.getEdad());
       
    }
    
    
}
