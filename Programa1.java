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
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zoologico zoo = new Zoologico();
        
        zoo.abrir();
        
        System.out.println("Se abrio el zoo");
        
        zoo.AlimentarAnimales(8000);
        
        zoo.cerrar();
        
        System.out.println("El cerro el zoo\n");
        
        
        System.out.println("---------------------------\n");
        
        Zoologico zoo2 = new Zoologico();
        
        zoo2.abrir();
        
        System.out.println("Se abrio el zoo2");
        
        zoo2.AlimentarAnimales(80);
        
        zoo2.cerrar();
        
        System.out.println("El cerro el zoo2");
    }
    
}
