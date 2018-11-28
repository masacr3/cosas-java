/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipm.tech;

/**
 *
 * @author masacr3
 */
public class Empleado {
    String nombre;
    String cedula;
    int edad;
    Boolean casado;
    double salario;
    
    public Empleado(){}
    
    public Empleado(String nombre, String cedula, int edad, Boolean casado, double salario){
        this.nombre = nombre;
        this.cedula = cedula;
        
        /* post: si edad no esta en rango se 
                 almacenara -1 y le marcara 
                 un error al usuario para 
                 que luego lo actualize
        */
        if (edad < 18 || edad > 45){
            this.edad = -1;
            System.out.println("error: La edad tiene que estar entre 18 y 45. Por favor corrijalo\n");
        }
        else this.edad = edad;
        
        this.casado = casado;
        this.salario = salario;
    }
    
    public void imprimir_datos(){
        System.out.println("nombre : "+this.nombre);
        System.out.println("cedula: "+this.cedula);
        System.out.println("edad : "+this.edad);
        System.out.println("casado : "+ (this.casado ? "si" : "no") );
        System.out.println("salario $"+this.salario);
    }
    
    public void mostrar_clasificacion(){
        if (this.edad <= 21) System.out.println("Principiante");
        
        else if ( this.edad <= 35) System.out.println("Intermedio");
        
        else System.out.println("Senior");
    }
    
    public void aumentar_salario(double porcentaje){
        this.salario += (porcentaje * this.salario / 100);
    }
    
    
}
