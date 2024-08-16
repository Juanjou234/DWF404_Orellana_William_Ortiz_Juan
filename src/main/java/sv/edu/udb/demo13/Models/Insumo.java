package sv.edu.udb.demo13.Models;

public class Insumo {
    private String nombre;
    private String fecha_vencimiento;
    private int cantidad;
    private String descripcion;
    private String imagen;

    public Insumo(String nombre, String fecha_vencimiento, int cantidad, String descripcion, String imagen){
        this.nombre = nombre;
        this.fecha_vencimiento = fecha_vencimiento;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
