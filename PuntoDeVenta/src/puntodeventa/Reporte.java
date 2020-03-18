/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

/**
 *
 * @author Brandon
 */
public class Reporte extends Producto{
    private String factura;
    private int i = 0;
    public Reporte(String nombre, String unidad, double cantidad, 
            double precio){
        this.nombre = nombre;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public void calcularTotal(){
        total = precio * cantidad;
    }
}
