/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.herencia;

/**
 *
 * @author masacr3
 */
public class Persona {
    private String nombre;
    private String fechaDeNacimiento;
    
    public Persona(){};
    
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setFechaDeNacimiento( String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public String getFechaDeNacimiento() { return this.fechaDeNacimiento;}
}