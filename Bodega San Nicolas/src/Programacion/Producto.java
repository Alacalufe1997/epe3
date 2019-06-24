
package Programacion;


public class Producto {
    
    String id_pro,nombre_pro,cantidad,descripcion;

    public Producto(String id_pro, String nombre_pro, String cantidad, String descripcion) {
        this.id_pro = id_pro;
        this.nombre_pro = nombre_pro;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getId_pro() {
        return id_pro;
    }

    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }

    public String getNombre_pro() {
        return nombre_pro;
    }

    public void setNombre_pro(String nombre_pro) {
        this.nombre_pro = nombre_pro;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
