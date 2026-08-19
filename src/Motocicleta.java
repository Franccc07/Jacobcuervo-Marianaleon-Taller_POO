public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta() {
    }

    public Motocicleta(String marca, String modelo, int año, String placa, double precioBase, int cilindraje) {
        super(marca, modelo, año, placa, precioBase);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }
}
