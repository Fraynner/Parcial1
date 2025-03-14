import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCeldas = 16;
        Estacionamiento estacionamiento = new Estacionamiento(totalCeldas);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n--- Menú de Estacionamiento ---");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Retirar vehículo");
            System.out.println("3. Mostrar estado del estacionamiento");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
            
                    scanner.nextLine();  
                    System.out.print("Ingresa la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingresa el nombre del propietario: ");
                    String propietario = scanner.nextLine();
                    System.out.print("Ingresa el cilindraje del vehículo: ");
                    int cilindraje = scanner.nextInt();
                    scanner.nextLine();  
                    System.out.print("Ingresa el modelo del vehículo: ");
                    String modelo = scanner.nextLine();

                    Vehiculo vehiculo = new Vehiculo(placa, propietario, cilindraje, modelo);
                    estacionamiento.agregarVehiculo(vehiculo);
                    break;

                case 2:
                    
                    scanner.nextLine(); 
                    System.out.print("Ingresa la placa del vehículo a retirar: ");
                    String placaRetiro = scanner.nextLine();
                    estacionamiento.retirarVehiculo(placaRetiro);
                    break;

                case 3:
                    
                    estacionamiento.mostrarEstadoCeldas();
                    break;

                case 4:
                    
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
