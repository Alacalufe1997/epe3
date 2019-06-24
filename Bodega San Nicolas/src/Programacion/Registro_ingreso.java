
package Programacion;


public class Registro_ingreso {
    
    String fecha_ingreso,id_user,rut,id_prodcuto,nombre_producto,cantidad;

    public Registro_ingreso(String fecha_ingreso, String id_user, String rut, String id_prodcuto, String nombre_producto, String cantidad) {
        this.fecha_ingreso = fecha_ingreso;
        this.id_user = id_user;
        this.rut = rut;
        this.id_prodcuto = id_prodcuto;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getId_prodcuto() {
        return id_prodcuto;
    }

    public void setId_prodcuto(String id_prodcuto) {
        this.id_prodcuto = id_prodcuto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    
    
    
    
}
