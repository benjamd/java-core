/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.com.benjamd.ventas;

/**
 *
 * @author benja
 */
public class Orden {
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        //la pos del arreglo coincide con la cantidad de productos
        //luego se posincrementa para agregar el sig. producto
        if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
                this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }
   /* 
    public void quitarProducto(Producto producto){
        if(this.contadorProductos > 0)
            //la pos del arreglo coincide con la cantidad de productos
            //luego se posincrementa para agregar el sig. producto
            this.productos[this.contadorProductos--] = null;
            
    }    
    */
    public double calcularTotal(){
        double total = 0;
        
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio(); // total = total + producto.getPrecio();
            //una sola linea
            total += this.productos[i].getPrecio();
        }
               
        return total;
    }
    
    public void mostarOrden(){
        System.out.println("idOrden:" + this.idOrden);
        System.out.println("Total orden: $" + this.calcularTotal());
        System.out.println("Productos:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
            
        }
       
    }
}
