public class Main {
    public static void main(String[] args) {
         System.out.println("EJECUCIÓN: RELACIÓN REFLEXIVA - EQUIPO: N°2");

        PersonalFarmacia quimicoJefe = new PersonalFarmacia("Dra. Elena Vargas", "Químico Farmacéutico Titular");
        PersonalFarmacia tecnico1 = new PersonalFarmacia("Luis Gómez", "Técnico en Farmacia - Dispensación");
        PersonalFarmacia tecnico2 = new PersonalFarmacia("María Torres", "Técnica en Farmacia - Almacén");

        quimicoJefe.asignarSubordinado(tecnico1);
        quimicoJefe.asignarSubordinado(tecnico2);

        // Recorrido y demostración en consola en ambos sentidos
        quimicoJefe.mostrarEnAmbosSentidos();
        tecnico1.mostrarEnAmbosSentidos();
        tecnico2.mostrarEnAmbosSentidos();
        
    }
}
