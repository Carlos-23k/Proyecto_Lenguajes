
class Medicamento:
    def __init__(self, codigo: str, nombre: str, precio: float, cantidad = 0):
        # Atributos privados del medicamento
        self.__codigo = codigo
        self.__nombre = nombre
        self.__precio = precio
        self.__cantidad = cantidad

    # Método que retorna el detalle formateado del fármaco
    def get_detalle(self) -> str:
        return f"[{self.__codigo}] {self.__nombre} - S/ {self.__precio:.2f}"

    def get_codigo(self):
        return self.__codigo

    def get_nombre(self):
        return self.__nombre

    def get_precio(self):
        return self.__precio

    def get_cantidad(self):
        return self.__cantidad

    def calularSubTotal(self):
        if(self.get_cantidad() > 0):
            return self.__precio * self.__cantidad
        else:
            return 0.0

    def mostrarMedicamento(self):
            print(f"{self.get_codigo()}: {self.get_nombre()} | cant: {self.get_cantidad()} | subtotal: S/{self.calularSubTotal():,.2f} ")


# Clase principal que administra la lista
class CategoriaFarmacia:
    def __init__(self, nombre_categoria: str):
        self.__nombre_categoria = nombre_categoria
        # Inicialización obligatoria de la lista vacía para guardar muchos objetos
        self.__medicamentos: list[Medicamento] = []

    # 1. Método para agregar un medicamento a la lista
    def agregar_medicamento(self, med: Medicamento) -> None:
        self.__medicamentos.append(med)

    # 2. Método para contar los medicamentos almacenados
    def contar_medicamentos(self) -> int:
        return len(self.__medicamentos)

    # 3. Método para recorrer la colección y mostrar los elementos
    def listar_medicamentos(self) -> None:
        print(f"Categoría : {self.__nombre_categoria}")
        for m in self.__medicamentos:
            print(f"  -> {m.get_detalle()}")
        print(f"Total de medicamentos registrados: {self.contar_medicamentos()}")


# Bloque principal de ejecución
if __name__ == "__main__":
    # Impresión obligatoria con el nombre del equipo
    print("EJECUCIÓN: RELACIÓN BINARIA  - EQUIPO: N°2")

    # Instancia de la categoría (Lado 1)
    analgesicos = CategoriaFarmacia("Analgésicos y Antiinflamatorios")

    # Instancias de medicamentos (Lado *)
    m1 = Medicamento("MED-001", "Paracetamol 500mg (Caja x 100)", 12.50)
    m2 = Medicamento("MED-002", "Ibuprofeno 400mg (Blíster x 10)", 3.00)
    m3 = Medicamento("MED-003", "Naproxeno 550mg (Blíster x 10)", 5.50)

    # Registro en la colección
    analgesicos.agregar_medicamento(m1)
    analgesicos.agregar_medicamento(m2)
    analgesicos.agregar_medicamento(m3)

    # Recorrido e impresión en consola
    analgesicos.listar_medicamentos()
