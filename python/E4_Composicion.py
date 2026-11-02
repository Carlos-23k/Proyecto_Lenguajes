from E3_Agregacion import Medicamento

class Venta:
    def __init__(self, nVenta, ):
        self.__numeroVenta = nVenta
        self.__medicamentos = []


     #Metodos Getters   
    @property
    def numeroVenta(self): return self.__numeroVenta


    def agregaMedicamento(self, codigo, nombre, precio, cantidad):
         medicamento = Medicamento(codigo, nombre, precio, cantidad)
         self.__medicamentos.append(medicamento)


    def mostrarVenta(self):
        total = 0.0
        print(f"Venta N°: {self.numeroVenta}")
        print("-" * 30)
        for medicamento in self.__medicamentos:
            medicamento.mostrarMedicamento()
            total = total + medicamento.calularSubTotal()
        print("-" * 30)
        print(f"TOTAL A PAGAR:    S/{total:,.2f} ")    
        print("-" * 30) 


## =============================
## BLOQUE PRINCIPAL DE EJECUCIÓN
## =============================
if __name__ == "__main__":
    # Impresión obligatoria con el nombre del equipo
    print("EJECUCIÓN: RELACIÓN D COMPOSICIÓN  - EQUIPO: N°2")

    venta = Venta("V-001")
    venta.agregaMedicamento("P-001","Panadol", 3.00, 1)
    venta.agregaMedicamento("P-002", "Paracetamol 500mg (Caja x 100)", 12.50, 5)
    venta.agregaMedicamento("P-003", "Ibuprofeno 400mg (Blíster x 10)", 3.00, 3)
    venta.agregaMedicamento("P-004", "Naproxeno 550mg (Blíster x 10)", 5.50, 3)

    venta.mostrarVenta()
                

        
