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
public class Motocicleta {
    private String matricula;
    private String color;
    private int velocidad;
    private Boolean en_marcha;
    
    public Motocicleta(){
        this.matricula = "No asignado";
        this.color = "No asignado";
        this.velocidad = 0;
        this.en_marcha = false;
    }
    
    public Motocicleta( String matricula, String color){
        this.matricula = matricula;
        this.color = color;
        this.velocidad = 0;
        this.en_marcha = false;
    }
    
    //tomamos en_marcha como si la motocicleta esta apaga o prendida
    public void arrancar(){
        this.en_marcha = true;
    }
    
    public void acelerar( int velocidad ){
        this.velocidad += velocidad;
    }
    
    public void frenar(){
        this.velocidad = 0;
    }
    
    
    public void datos(){
        System.out.println("matricula : "+this.matricula);
        System.out.println("color : "+this.color);
        System.out.println("velocidad : "+this.velocidad);
        System.out.println("en marcha : "+this.en_marcha);
    }
    
    /* 
        no se especifico ninguna accion
        solo una idea de que parametros
        se le asignaria
    */
    public void girar( String lado){
        /* no se especifico que haria */
    } 
    
    
}
