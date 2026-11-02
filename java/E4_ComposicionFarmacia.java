import java.util.ArrayList;
import java.util.List;

// Relacion de composición
class Venta {
    private String nVenta;
    private List<Medicamento> medicamentos;

    public Venta(String nVenta){
        this.nVenta = nVenta;
        this.medicamentos = new ArrayList<>();
    }

    public String getnVenta(){
        return nVenta;
    }

    public void agregarMedicamento(String codigo, String nombre, double precio, int cantidad){
        Medicamento medicamento = new Medicamento(codigo, nombre, precio, cantidad);
        medicamentos.add(medicamento);
    }

    public void mostrarVenta(){
        double total = 0.0;
        System.out.println("Venta N°: " + getnVenta());
        System.out.println("-------------------------------");
        for (Medicamento med: medicamentos){
            System.out.println(med.mostrarMedicamento());
            total = total + med.calularSubTotal();
        }
        System.out.println("-------------------------------");
        System.out.println("TOTAL A PAGAR:    S/" +  String.format("%.2f", total));
        System.out.println("-------------------------------"); 
    }
}

class Medicamento {
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

    //Metódos Getters
    public String getCodigo(){ return codigo; }
    public String getNombre(){ return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }

    public String getDetalle() {
        return "[" + getCodigo() + "] " + getNombre() + " - S/ " + String.format("%.2f", getPrecio());
    }

    public String mostrarMedicamento(){
        return "[" + getCodigo() + "]: " + getNombre() + " | " +"Subtotal: S/" + String.format("%.2f", this.calularSubTotal());
    }

    public Double calularSubTotal(){
        if(getCantidad() > 0){
            return getPrecio() * getCantidad();
        }
        return 0.0;
    }       
}

// ===========================================================
// PROGRAMA PRINCIPAL QUE IMPRIME EL FUNCIONAMIENTO EN CONSOLA
// ===========================================================
public class E4_ComposicionFarmacia {
    public static void main(String[] args) {
        System.out.println("EJECUCIÓN: RELACIÓN DE COMPOSCIÓN - EQUIPO N°2");

        Venta venta = new Venta("N-023");

        venta.agregarMedicamento("P-025", "Panadol Antigripal", 3.00, 2);
        venta.agregarMedicamento("P-026", "Paracetamol 500mg", 3.50, 1);
        venta.agregarMedicamento("P-027", "Bismutol 262mg", 1.40, 4);
        venta.mostrarVenta();   
    }  
}
