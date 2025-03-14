import java.util.Stack;
public class Estacionamiento {
    private Stack<Vehiculo> celdas;
    private int totalCeldas=16;

    public Estacionamiento(int totalCeldas) {
        this.totalCeldas = totalCeldas;
        celdas = new Stack<>();
    }


    public void agregarVehiculo(Vehiculo vehiculo) {
        if (celdas.size() < totalCeldas) {
            celdas.push(vehiculo);
            System.out.println("Vehículo agregado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible en el estacionamiento.");
        }
    }

 
    public void retirarVehiculo(String placa) {
        for (int i = 0; i < celdas.size(); i++) {
            Vehiculo vehiculo = celdas.get(i);
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                vehiculo.setDisponible(true);
                celdas.remove(i);
                System.out.println("Vehículo con placa " + placa + " ha sido retirado.");
                return;
            }
        }
        System.out.println("No se encontró un vehículo con esa placa.");
    }

    public void mostrarEstadoCeldas() {
        System.out.println("\nEstado de las celdas:");
        for (int i = 0; i < totalCeldas; i++) {
            if (i < celdas.size()) {
                System.out.println("Celda " + (i + 1) + ": Ocupada - " + celdas.get(i));
            } else {
                System.out.println("Celda " + (i + 1) + ": Disponible");
            }
        }
    }
}

