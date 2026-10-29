    // Clase pincipal "Muchos" (0..*)
public class Medicamento {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public Medicamento(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Medicamento(String codigo, String nombre, double precio){
        this(codigo,nombre, precio, 0);
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }


    public String getDetalle() {
        return "[" + getCodigo() + "] " + getNombre() + " - S/ " + String.format("%.2f", getPrecio());
    }

    public String mostrarMedicamento(){
        return "[" + getCodigo() + "]: " + getNombre() + " | - S/ " +"Subtotal: " + String.format("%.2f", this.calularSubTotal());

    }

    
    public Double calularSubTotal(){
        if(getCantidad() > 0){
            return getPrecio() * getCantidad();
        }
        return 0.0;
    }
        

    
}
