/**
 * E2_ReflexivaFramacia
 */
import java.util.ArrayList;
import java.util.List;

// Relación reflexiva: la clase se asocia consigo misma
class PersonalFarmacia {
    private String nombre;
    private String cargo;
    private PersonalFarmacia supervisor;           // Sentido 1: Multiplicidad 0..1
    private List<PersonalFarmacia> subordinados;   // Sentido 2: Multiplicidad 0..*

    public PersonalFarmacia(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.supervisor = null; // No tiene jefe si es el quimico titular (0..1)
        this.subordinados = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getCargo() { return cargo; }

    // Sincroniza la relación reflexiva en ambos sentidos
    public void asignarSubordinado(PersonalFarmacia tecnico) {
        this.subordinados.add(tecnico);
        tecnico.supervisor = this;
    }

    // Demuestra la relación en los dos sentidos
    public void mostrarEnAmbosSentidos() {
        System.out.println("--------------------------------------------------");
        System.out.println("Personal: " + nombre + " [" + cargo + "]");

        // Sentido 1: De Subordinado hacia Supervisor (0..1)
        if (supervisor != null) {
            System.out.println("  -> [Sentido Subordinado -> Jefe] Supervisado por: " 
                               + supervisor.getNombre() + " (" + supervisor.getCargo() + ")");
        } else {
            System.out.println("  -> [Sentido Subordinado -> Jefe] No tiene supervisor (Es Jefe de Turno).");
        }

        // Sentido 2: De Supervisor hacia su colección de Subordinados (0..*)
        if (!subordinados.isEmpty()) {
            System.out.println("  -> [Sentido Jefe -> Subordinados] Supervisa a " + subordinados.size() + " persona(s):");
            for (PersonalFarmacia sub : subordinados) {
                System.out.println("       * " + sub.getNombre() + " (" + sub.getCargo() + ")");
            }
        } else {
            System.out.println("  -> [Sentido Jefe -> Subordinados] No tiene personal subordinado a su cargo.");
        }
    }
}

// ===========================================================
// PROGRAMA PRINCIPAL QUE IMPRIME EL FUNCIONAMIENTO EN CONSOLA
// ===========================================================
public class E2_ReflexivaFramacia {
    public static void main(String[] args) {
        
        System.out.println("EJECUCIÓN: RELACIÓN REFLEXIVA- EQUIPO N°2");

        PersonalFarmacia encargada = new PersonalFarmacia("Dra. Maria Sanchéz Polo", "Químico Farmacéutico Titular");
        PersonalFarmacia tecnico = new PersonalFarmacia("Luis Gomez", "Técnico en Farmacia - Dispensación");
        PersonalFarmacia tecnica = new PersonalFarmacia("Elena Torres", "Técnica en Farmacia - Almacén");
        
        encargada.asignarSubordinado(tecnico);
        encargada.asignarSubordinado(tecnica);
        encargada.mostrarEnAmbosSentidos();
        tecnico.mostrarEnAmbosSentidos();
        tecnica.mostrarEnAmbosSentidos();
    } 
}