public class Main {
    public static void main(String[] args) {

        System.out.println("EJECUCIÓN: RELACIÓN BINARIA - EQUIPO N°2");
        CategoriaFarmacia analgesicos = new CategoriaFarmacia("Analgésicos y Antiinflamatorios");
        Medicamento m1 = new Medicamento("MED-001", "Paracetamol 500mg (Caja x 100)", 12.50);
        Medicamento m2 = new Medicamento("MED-002", "Ibuprofeno 400mg (Blíster x 10)", 3.00);
        Medicamento m3 = new Medicamento("MED-003", "Naproxeno 550mg (Blíster x 10)", 5.50);
        analgesicos.agregarFarmaco(m1);
        analgesicos.agregarFarmaco(m2);
        analgesicos.agregarFarmaco(m3);
        analgesicos.listarMedicamentos();

        
        System.out.println("EJECUCIÓN: RELACIÓN REFLEXIVA Y DE AGREGACIÓN - EQUIPO N°2");
        PersonalFarmacia encargada = new PersonalFarmacia("Dra. Maria Sanchéz Polo", "Químico Farmacéutico Titular");
        PersonalFarmacia tecnico = new PersonalFarmacia("Luis Gomez", "Técnico en Farmacia - Dispensación");
        PersonalFarmacia tecnica = new PersonalFarmacia("Elena Torres", "Técnica en Farmacia - Almacén");
        encargada.asignarSubordinado(tecnico);
        encargada.asignarSubordinado(tecnica);
        encargada.mostrarEnAmbosSentidos();
        tecnico.mostrarEnAmbosSentidos();
        tecnica.mostrarEnAmbosSentidos();

        System.out.println("EJECUCIÓN: RELACIÓN DE COMPOSCIÓN - EQUIPO N°2");
        Venta venta = new Venta("N-023");
        venta.agregarMedicamento("P-025", "Panadol Antigripal", 3.00, 2);
        venta.agregarMedicamento("P-026", "Paracetamol 500mg", 3.50, 1);
        venta.agregarMedicamento("P-027", "Bismutol 262mg", 1.40, 4);
        venta.mostrarVenta();
 
    }
}
