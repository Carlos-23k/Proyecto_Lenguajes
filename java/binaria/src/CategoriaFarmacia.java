import java.util.ArrayList;
import java.util.List;

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