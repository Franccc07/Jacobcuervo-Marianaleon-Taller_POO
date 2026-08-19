public class CamionCarga extends Vehiculo {
     private double capacidadToneladas;

    public CamionCarga() {
    }

    public CamionCarga(String marca, String modelo, int año, String placa, double precioBase, double capacidadToneladas) {
        super(marca, modelo, año, placa, precioBase);
        this.capacidadToneladas = capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public String toString() {
        return "CamionCarga{" +
                "capacidadToneladas=" + capacidadToneladas +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }
}
