
package app;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author evert
 */
public abstract class Persona implements Compra{
    private String Nombre;
    private String Rut;
    private String Direccion;
    private int dinero;

    private Vendedor vendedor;

    public Persona() {
    }
    
    
    
    public Persona(String Nombre, String Rut, String Direccion) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.Direccion = Direccion;
    }
    
                                                           
    public abstract String identificarse();

    public Persona(String Nombre, String Rut, String Direccion, int dinero, Vendedor vendedor) {
        this.Nombre = Nombre;
        this.Rut = Rut;
        this.Direccion = Direccion;
        this.dinero = dinero;
        this.vendedor = vendedor;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    
    
    
    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
    public  String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public  String getRut(){
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    } 
    @Override
    public void ComprarProducto() {
        String ProductoComprar="";
        Scanner Entrada = new Scanner(System.in);
        
        if(dinero > 0){
            System.out.println("¿Que producto desea comprar? "+getNombre());
            ProductoComprar=Entrada.nextLine();
            if(vendedor.ValidarProducto(ProductoComprar)){
                setDinero(dinero-100);
            }
        }
    }
    
    public int captarFondos(int valor){
        return valor;
    }
    
    @Override
    public void AgregarFondos() throws NoNuevosFondosException{
        int nuevosFondos=-1;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("¿Cuanto dinero quieres agregar? "+getNombre());
        try {
            
            nuevosFondos = Entrada.nextInt();
            
        }catch(InputMismatchException e){
            System.out.println("Ingrese un numero para añadir fondos");
        }
        
        if (nuevosFondos > 0){
            setDinero(dinero+nuevosFondos);
        } else{
            throw new NoNuevosFondosException();
        }
        
    }
}
