public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int año;
    private double precioBase;

    public Vehiculo() {
    }

    public Vehiculo(double precioBase, int año, String modelo, String marca, String placa) {
        this.precioBase = precioBase;
        this.año = año;
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
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










}
