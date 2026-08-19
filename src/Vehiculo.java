public abstract class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String placa, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.placa = placa;
        this.precioBase = precioBase;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precioBase=" + precioBase +
                '}';
    }

}
