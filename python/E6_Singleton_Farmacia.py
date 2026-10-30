
class RegistroOperacionesFarmacia:

    # Variable que almacena la única instancia
    __instancia = None

    # Constructor controlado
    def __new__(cls):
        if cls.__instancia is None:
            cls.__instancia = super().__new__(cls)
        return cls.__instancia

    def __init__(self):
        # Evita inicializar nuevamente los datos
        if not hasattr(self, "_inicializado"):
            self.__operaciones = []
            self._inicializado = True

    # Método para obtener la instancia única
    @classmethod
    def getInstance(cls):
        return cls()

    # Registrar una operación
    def registrar_operacion(self, descripcion):
        self.__operaciones.append(descripcion)
        print("Operacion registrada:", descripcion)

    # Mostrar todas las operaciones
    def listar_operaciones(self):
        print("\n===== REGISTRO DE OPERACIONES =====")

        for operacion in self.__operaciones:
            print("->", operacion)

        print("Total de operaciones:", len(self.__operaciones))


# PROGRAMA PRINCIPAL
if __name__ == "__main__":

    print("======================================")
    print(" PATRON SINGLETON - FARMACIA")
    print(" EQUIPO N°2")
    print("======================================")

    # Primera llamada
    registro1 = RegistroOperacionesFarmacia.getInstance()

    # Segunda llamada
    registro2 = RegistroOperacionesFarmacia.getInstance()

    # Comprobación de que ambos son el mismo objeto
    print("\n¿Ambos objetos son iguales?")
    print(registro1 is registro2)

    # Registrar operaciones utilizando el primer objeto
    registro1.registrar_operacion("Ingreso de Paracetamol")
    registro1.registrar_operacion("Venta de Ibuprofeno")
    registro1.registrar_operacion("Actualizacion de inventario")

    # Mostrar operaciones utilizando el segundo objeto
    print("\nConsultando desde el segundo objeto:")
    registro2.listar_operaciones()

    print("\n======================================")
    print(" FIN DE LA EJECUCION")
    print("======================================")
