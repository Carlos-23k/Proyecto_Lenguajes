import java.util.ArrayList;
import java.util.List;


// Relacion de composición
public class Venta {
    private String nVenta;
    private List<Medicamento> medicamentos;

    public Venta(String nVenta){
        this.nVenta = nVenta;
        this.medicamentos = new ArrayList<>();
    }

    public String getnVenta(){
        return this.nVenta;
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


