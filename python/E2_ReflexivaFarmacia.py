# Clase con relación reflexiva
class PersonalFarmacia:
    def __init__(self, nombre: str, cargo: str):
        self.__nombre = nombre
        self.__cargo = cargo
        # Referencia a un objeto de la misma clase para el rol supervisor (0..1)
        self.__supervisor: "PersonalFarmacia | None" = None
        # Lista de objetos de la misma clase para el rol subordinados (0..*)
        self.__subordinados: list["PersonalFarmacia"] = []

    def get_nombre(self) -> str:
        return self.__nombre

    def get_cargo(self) -> str:
        return self.__cargo

    # Método que registra la relación reflexiva en ambos sentidos
    def asignar_subordinado(self, tecnico: "PersonalFarmacia") -> None:
        self.__subordinados.append(tecnico)  # Agrega a la lista del jefe
        tecnico.__supervisor = self          # Asigna al jefe como supervisor del técnico

    # Método que imprime en consola ambos sentidos de la relación reflexiva
    def mostrar_en_ambos_sentidos(self) -> None:
        print("-" * 50)
        print(f"Personal: {self.__nombre} [{self.__cargo}]")

        # Sentido 1: De Subordinado hacia su Jefe (0..1)
        if self.__supervisor is not None:
            print(f"  -> [Sentido Subordinado -> Jefe] Supervisado por: "
                  f"{self.__supervisor.get_nombre()} ({self.__supervisor.get_cargo()})")
        else:
            print("  -> [Sentido Subordinado -> Jefe] Sin supervisor (Es Jefe de Turno).")

        # Sentido 2: De Jefe hacia su lista de Subordinados (0..*)
        if len(self.__subordinados) > 0:
            print(f"  -> [Sentido Jefe -> Subordinados] Supervisa a {len(self.__subordinados)} persona(s):")
            for sub in self.__subordinados:
                print(f"       * {sub.get_nombre()} ({sub.get_cargo()})")
        else:
            print("  -> [Sentido Jefe -> Subordinados] No tiene personal subordinado a su cargo.")


# Bloque principal de ejecución
if __name__ == "__main__":
   
    print("EJECUCIÓN: RELACIÓN REFLEXIVA - EQUIPO: N°2")

    # Creación de instancias de la misma clase
    quimico_jefe = PersonalFarmacia("Dra. Elena Vargas", "Químico Farmacéutico Titular")
    tecnico1 = PersonalFarmacia("Luis Gómez", "Técnico en Farmacia - Dispensación")
    tecnico2 = PersonalFarmacia("María Torres", "Técnica en Farmacia - Almacén")

    # Se asignan los subordinados al químico jefe
    quimico_jefe.asignar_subordinado(tecnico1)
    quimico_jefe.asignar_subordinado(tecnico2)

    
    quimico_jefe.mostrar_en_ambos_sentidos()
    tecnico1.mostrar_en_ambos_sentidos()
    tecnico2.mostrar_en_ambos_sentidos()
