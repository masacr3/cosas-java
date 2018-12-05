/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author masacr3
 */
public class Cuidador extends Persona {
    private final int cantidadDeRaciones;
    
    public Cuidador( int cantidadDeRaciones){
        this.cantidadDeRaciones = cantidadDeRaciones;
    }
    
    public void alimentarAnimales(int cantidadDeAnimales, int racionPorAnimal ){
        boolean ok = this.cantidadDeRaciones >= ( cantidadDeAnimales * racionPorAnimal);
        
        System.out.println( ok ? "Se alimentaron a todos los animales correctamente" : "La racion no alcanzo para alimentar a todos los animales" );
    }
    
    //set ang get
    
    public int getCantidadDeRaciones() { return this.cantidadDeRaciones; } 
    
}
