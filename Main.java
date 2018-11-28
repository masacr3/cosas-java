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

class DiscoMusical {

    private String titulo;
    private String autor;
    private int anioEdicion;
    private String formato;
    private Boolean digital;
    
    public DiscoMusical( String titulo, String autor, int anioEdicion, String formato, Boolean digital){
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
        this.formato = formato;
        this.digital = digital;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnioEdicion(){
        return anioEdicion;
    }
    
    public String getFormato(){
        return formato;
    }
    
    public Boolean getDigital(){
        return digital;
    }
    
    public void setTitulo( String titulo ){
        this.titulo = titulo;
    }
    
    public void setAutor( String autor ){
        this.autor = autor;
    }
    
    public void setAnioEdicion( int anioEdicion ){
        this.anioEdicion = anioEdicion;
    }
    
    public void setFormato( String formato ){
        this.formato = formato;
    }
    
    public void setDigital( Boolean digital ){
        this.digital = digital;
    }
    
    

}
    
    

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
