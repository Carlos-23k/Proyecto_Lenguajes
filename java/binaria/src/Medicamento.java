    // Clase pincipal "Muchos" (0..*)
public class Medicamento {
    private String codigo;
    private String nombre;
    private double precio;

    public Medicamento(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDetalle() {
        return "[" + codigo + "] " + nombre + " - S/ " + String.format("%.2f", precio);
    }

}
