import java.util.ArrayList;
import java.util.List;

// Clase pincipal "Muchos" (0..*)
class Medicamento {
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

// Clase secundaria "Uno" (1) que administra la colección ArrayList 
class CategoriaFarmacia {
    private String nombreCategoria;
    private List<Medicamento> medicamentos;

    public CategoriaFarmacia(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
        // Instanciación obligatoria de la colección para evitar NullPointerException
        this.medicamentos = new ArrayList<>();
    }

    // Operación 1: Agregar a la colección
    public void agregarMedicamento(Medicamento med) {
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

public class E1_BinariaFarmacia {
    public static void main(String[] args) {
        System.out.println("EJECUCIÓN: RELACIÓN BINARIA - EQUIPO N°2");

        CategoriaFarmacia analgesicos = new CategoriaFarmacia("Analgésicos y Antiinflamatorios");

        Medicamento m1 = new Medicamento("MED-001", "Paracetamol 500mg (Caja x 100)", 12.50);
        Medicamento m2 = new Medicamento("MED-002", "Ibuprofeno 400mg (Blíster x 10)", 3.00);
        Medicamento m3 = new Medicamento("MED-003", "Naproxeno 550mg (Blíster x 10)", 5.50);

        analgesicos.agregarMedicamento(m1);
        analgesicos.agregarMedicamento(m2);
        analgesicos.agregarMedicamento(m3);

        analgesicos.listarMedicamentos();
    }
}





