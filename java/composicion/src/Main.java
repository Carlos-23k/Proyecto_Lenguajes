public class Main {
    public static void main(String[] args) {

         Venta venta = new Venta("V-001");



        venta.agregarMedicamento("MED-001", "Paracetamol 500mg (Caja x 100)", 12.50, 2);
        venta.agregarMedicamento("MED-002", "Ibuprofeno 400mg (Blíster x 10)", 3.00, 3);
        venta.agregarMedicamento("MED-003", "Naproxeno 550mg (Blíster x 10)", 5.50, 1);

        venta.mostrarVenta();
        System.out.println("aqui rtermina la ventaaaaaaaaaaaaaaaaaaaaa");
        
    }
}
