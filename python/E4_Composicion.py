from E3_Agregacion import Medicamento

class Venta:
    def __init__(self, nVenta, ):
        self.nVenta = nVenta
        self.medicamentos = []


    def agregaMedicamento(self, codigo, nombre, precio, cantidad):
         medicamento = Medicamento(codigo, nombre, precio, cantidad)
         self.medicamentos.append(medicamento)


    def mostrarVenta(self):
        total = 0.0
        print(f"Venta N°: {self.nVenta}")
        print("-" * 30)
        for medicamento in self.medicamentos:
            medicamento.mostrarMedicamento()
            total = total + medicamento.calularSubTotal()
        print("-" * 30)
        print(f"TOTAL A PAGAR:    S/{total:,.2f} ")    
        print("-" * 30) 


venta = Venta("V-001")
venta.agregaMedicamento("P-001","Panadol", 3.00, 1)
venta.agregaMedicamento("P-002", "Paracetamol 500mg (Caja x 100)", 12.50, 5)
venta.agregaMedicamento("P-003", "Ibuprofeno 400mg (Blíster x 10)", 3.00, 3)
venta.agregaMedicamento("P-004", "Naproxeno 550mg (Blíster x 10)", 5.50, 3)


venta.mostrarVenta()
                

        
