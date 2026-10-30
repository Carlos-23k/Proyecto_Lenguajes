
from abc import ABC, abstractmethod


# ==========================================
# CLASE PADRE
# ==========================================

class MedicamentoFarmaceutico(ABC):

    def __init__(self, codigo, nombre, precio):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio

    @abstractmethod
    def mostrar_detalle(self):
        pass


# ==========================================
# SUBCLASE 1: MEDICAMENTO GENERICO
# ==========================================

class MedicamentoGenerico(MedicamentoFarmaceutico):

    def mostrar_detalle(self):
        print("Tipo: Medicamento Generico")
        print("Codigo:", self.codigo)
        print("Nombre:", self.nombre)
        print("Precio: S/", self.precio)


# ==========================================
# SUBCLASE 2: MEDICAMENTO COMERCIAL
# ==========================================

class MedicamentoComercial(MedicamentoFarmaceutico):

    def mostrar_detalle(self):
        print("Tipo: Medicamento Comercial")
        print("Codigo:", self.codigo)
        print("Nombre:", self.nombre)
        print("Precio: S/", self.precio)


# ==========================================
# SUBCLASE 3: MEDICAMENTO CONTROLADO
# ==========================================

class MedicamentoControlado(MedicamentoFarmaceutico):

    def mostrar_detalle(self):
        print("Tipo: Medicamento Controlado")
        print("Codigo:", self.codigo)
        print("Nombre:", self.nombre)
        print("Precio: S/", self.precio)
        print("Requiere receta medica.")


# ==========================================
# CREADOR ABSTRACTO
# ==========================================

class CreadorMedicamentos(ABC):

    @abstractmethod
    def crear_medicamento(self, tipo, codigo, nombre, precio):
        pass


# ==========================================
# FACTORY METHOD
# ==========================================

class FarmaciaFactory(CreadorMedicamentos):

    def crear_medicamento(self, tipo, codigo, nombre, precio):

        if tipo.lower() == "generico":
            return MedicamentoGenerico(codigo, nombre, precio)

        elif tipo.lower() == "comercial":
            return MedicamentoComercial(codigo, nombre, precio)

        elif tipo.lower() == "controlado":
            return MedicamentoControlado(codigo, nombre, precio)

        else:
            print("Tipo de medicamento no disponible.")
            return None


# ==========================================
# PROGRAMA PRINCIPAL
# ==========================================

if __name__ == "__main__":

    print("======================================")
    print(" FACTORY METHOD - FARMACIA")
    print(" EQUIPO N°2")
    print("======================================")

    # Crear la fábrica
    fabrica = FarmaciaFactory()

    # Colección para almacenar medicamentos
    medicamentos = []

    # La fábrica crea los tres tipos de medicamentos
    m1 = fabrica.crear_medicamento(
        "generico", "MED-001", "Paracetamol", 12.50
    )

    m2 = fabrica.crear_medicamento(
        "comercial", "MED-002", "Panadol", 18.00
    )

    m3 = fabrica.crear_medicamento(
        "controlado", "MED-003", "Medicamento Especial", 25.00
    )

    # Registrar los medicamentos creados
    for medicamento in [m1, m2, m3]:
        if medicamento is not None:
            medicamentos.append(medicamento)

    # Mostrar los medicamentos
    print("\n===== MEDICAMENTOS CREADOS =====")

    for medicamento in medicamentos:
        print("\n-----------------------------")
        medicamento.mostrar_detalle()

    print("\nTotal de medicamentos creados:", len(medicamentos))

    print("\n======================================")
    print(" FIN DE LA EJECUCION")
    print("======================================")
