package programa1;

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

package programa1;

/**
 *
 * @author masacr3
 */
public class Zoologico {
    //definicion de constantes
    static private final int CANTIDAD_ANIMALES = 25;
    static private final int RACIONES_POR_ANIMAL = 25;
    
    
    protected boolean esta_abierto;
    
    public Zoologico () {
        this.esta_abierto = false;
    }
    
    public void abrir(){
        this.setEstaAbierto(true);
    }
    
    public void cerrar(){
        this.setEstaAbierto(false);
    }
    
    public void AlimentarAnimales( int unaCantidadDeRaciones){
        Cuidador cuidador = new Cuidador( unaCantidadDeRaciones);
        cuidador.alimentarAnimales( this.getCantidadAnimales(), this.getRacionesPorAnimal() );
    }
    
    //metodos publicos set and get
    
    public int getCantidadAnimales(){ return CANTIDAD_ANIMALES; }
    
    public int getRacionesPorAnimal(){ return RACIONES_POR_ANIMAL; }
    
    public boolean getEstaAbierto() { return this.esta_abierto; }
    
    public void setEstaAbierto( boolean ok ) { this.esta_abierto = ok; }
}

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

-----------------------------------------------------------------------

package programa2;

/**
 *
 * @author masacr3
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    public Cuenta( String titular){
        this.titular = titular;
        this.cantidad = 0;
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public void ingresar(double cantidad){
        if(cantidad>0){
            this.cantidad += cantidad;
    }
   }
    
    public void retirar(double cantidad){
        this.cantidad = this.getCantidad() - cantidad < 0 ? 0 : this.getCantidad() - cantidad;
     }   
    
    @Override
    public String toString(){
        return "El Titular: " + this.getTitular() + " tiene un saldo de : " + this.getCantidad() ;
    }
    
    public void setTitular( String titular) { this.titular = titular; }
    public void setCantidad ( double cantidad) { this.cantidad = cantidad; }
    
    public String getTitular() { return this.titular; }
    public double getCantidad() { return this.cantidad; }
    
}


package programa2;
import java.util.Random;

/**
 *
 * @author masacr3
 */
public class Persona {
    
    static private final String DEFAULT_NOMBRE = "";
    static private final int DEFAULT_EDAD = 0;
    static private final char DEFAULT_SEXO = 'H';
    
    
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    
    
    
    public Persona(){
        this.nombre = DEFAULT_NOMBRE;
        this.edad = DEFAULT_EDAD;
        this.sexo = DEFAULT_SEXO;
    }
    
    public Persona( String nombre, int edad, char sexo ){
        this.nombre = nombre;
        this.edad = edad;
        
        if ( sexo != 'H' && sexo != 'M') this.sexo = DEFAULT_SEXO;
        else this.sexo = sexo;
        
    }
    
    public Persona( String nombre, int edad, int dni, char sexo ){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        
        if ( this.comprobarSexo(sexo)) this.sexo = sexo;
        else this.sexo = DEFAULT_SEXO;
    }
    
    //post: Retorna falso si introdujo mal el sexo, en caso contrario True
    private boolean comprobarSexo(char sexo){
        return !(sexo != 'H' && sexo != 'M');
    }
    
    public boolean esMayorDeEdad(){
        return this.getEdad() >= 18;
    }
    
    public void generaDNI(){
        Random rnd = new Random();
        this.dni = (int) (rnd.nextDouble() * 8 + 1);
    }
    
    @Override
    public String toString(){
        return "nombre : " + this.getNombre() + "\n"+
               "edad : " + this.getEdad() +"\n"+
               "DNI : " + this.getDNI() +"\n"+
               "sexo : " + this.getSexo();
    }
    
    //set and get
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public int getDNI(){
        return this.dni;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setNombre( String nombre ){
        this.nombre = nombre;
    }
    
    public void setEdad( int edad ){
        this.edad = edad;
    }
    
    public void setSexo( char sexo ){
        if ( this.comprobarSexo(sexo)) this.sexo = sexo;
        else this.sexo = DEFAULT_SEXO;
    }
    
}

package programa2;

/**
 *
 * @author masacr3
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta = new Cuenta("leonel",5000);
        
        //override toString
        System.out.println("To string:");
        System.out.println( "\t"+cuenta.toString());
        
        //get
        System.out.println("\nget:");
        System.out.println( "\t"+cuenta.getTitular());
        System.out.println( "\t"+cuenta.getCantidad());
        
        //set
        cuenta.setTitular("Leonel Rodrido");
        cuenta.setCantidad(6000);
        
        //get
        System.out.println("\nModifico nombre y cantidad:");
        System.out.println( "\t"+cuenta.getTitular());
        System.out.println( "\t"+cuenta.getCantidad());
        
        //test metodos
        
        cuenta.ingresar(200);
        System.out.println("\ningreso 200$");
        System.out.println( "\t"+cuenta.getCantidad());
        
        cuenta.ingresar(-20);
        System.out.println("\ningreso -20$");
        System.out.println("no tendria que hacer nada");
        System.out.println( "\t"+cuenta.getCantidad());
        
        cuenta.retirar(2500.5);
        System.out.println("\nretiro 2500.5$");
        System.out.println("tiene que quedar en la cuenta 3699.5$");
        System.out.println( "\t"+cuenta.getCantidad());
        
        cuenta.retirar(10000);
        System.out.println("\ntrato de retirar 10000$");
        System.out.println("tiene que quedar en la cuenta 0$");
        System.out.println( "\t"+cuenta.getCantidad());
        
        cuenta.ingresar(499);
        System.out.println("\ningreso 499$");
        System.out.println( "\t"+cuenta.getCantidad());
        
        System.out.println("----------------------------");
        
        System.out.println("\nTest rapido");
        Cuenta cuenta2 = new Cuenta("otra persona");
        System.out.println(cuenta2.toString());
        System.out.println("Titular: "+cuenta2.getTitular());
        System.out.println("Cantidad: "+cuenta2.getCantidad());
        cuenta2.ingresar(20);
        System.out.println("Saldo: "+cuenta2.getCantidad());
        cuenta2.retirar(1000);
        System.out.println("saldo: "+cuenta2.getCantidad());
    }
    
}