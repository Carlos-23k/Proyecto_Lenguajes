public class Main {
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
