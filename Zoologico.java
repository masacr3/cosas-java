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
public class Zoologico {
    //definicion de constantes
    static final int CANTIDAD_ANIMALES = 25;
    static final int RACIONES_POR_ANIMAL = 25;
    
    
    protected boolean esta_abierto;
    
    public Zoologico () {
        this.esta_abierto = false;
    }
    
    public void abrir(){
        this.esta_abierto = true;
    }
    
    public void cerrar(){
        this.esta_abierto = false;
    }
    
    public void AlimentarAnimales( int unaCantidadDeRaciones){
        Cuidador cuidador = new Cuidador( unaCantidadDeRaciones);
        cuidador.alimentarAnimales( this.CANTIDAD_ANIMALES, this.RACIONES_POR_ANIMAL );
    }
    
    //metodos publicos set and get
    
    public int getCantidadAnimales(){ return this.CANTIDAD_ANIMALES; }
    
    public int getRacionesPorAnimal(){ return this.RACIONES_POR_ANIMAL; }
    
    public boolean getEstaAbierto() { return this.esta_abierto; }
    
    public void setEstaAbierto( boolean ok ) { this.esta_abierto = ok; }
}
