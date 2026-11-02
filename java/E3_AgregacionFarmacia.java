//E3_Agregacion
import java.util.ArrayList;
import java.util.List;

class CategoriaFarmacia {
    private String nombreCategoria;
    private List<Medicamento> medicamentos;

    public CategoriaFarmacia(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        // Instanciación obligatoria de la colección para evitar NullPointerException
        this.medicamentos = new ArrayList<>();
    }

    // Operación 1: Agregar a la colección
    public void agregarFarmaco(Medicamento med) {
        this.medicamentos.add(med);
    }

    // Operación 2: Contar elementos de la colección
    public int contarMedicamentos() {
        return this.medicamentos.size();
    }

    // Operación 3: Recorrer y listar la colección
    public void listarMedicamentos() {
        System.out.println("Categoría: " + nombreCategoria);
        for (Medicamento m : medicamentos) {
            System.out.println("  -> " + m.getDetalle());
        }
        System.out.println("Total de medicamentos en la categoría: " + contarMedicamentos());
    }
}  

    // Clase pincipal "Muchos" (0..*)
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

    public String getCodigo(){ return codigo; }
    public String getNombre(){ return nombre; }
    public double getPrecio(){ return precio; }
    public int getCantidad(){ return cantidad;}

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
public class E3_AgregacionFarmacia {
    public static void main(String[] args) {
        
        System.out.println("EJECUCIÓN: RELACIÓN DE AGREGACIÓN - EQUIPO N°2");

        CategoriaFarmacia analgesicos = new CategoriaFarmacia("Antihistamínicos(Alergias y Congestión)");
        Medicamento m1 = new Medicamento("MED-005", "Cetirizina (10mg)", 0.50);
        Medicamento m2 = new Medicamento("MED-006", "Fexofenadina (120 mg)", 1.80);
        Medicamento m3 = new Medicamento("MED-007", "Clorfenamina (4 mg)", 1.00);

        analgesicos.agregarFarmaco(m1);
        analgesicos.agregarFarmaco(m2);
        analgesicos.agregarFarmaco(m3);
        analgesicos.listarMedicamentos();      
    }  
}