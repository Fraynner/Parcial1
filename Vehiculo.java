public class Vehiculo {
    private String placa;
    private String propietario;
    private int cilindraje;
    private String modelo;
    private boolean disponible;


    public Vehiculo(String placa, String propietario, int cilindraje, String modelo) {
        this.placa = placa;
        this.propietario = propietario;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
        this.disponible = false; 
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}
