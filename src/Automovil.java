public class Automovil {
    int numeroPuertas;
    String tipoCombustible;

    public Automovil() {
    }

    public Automovil(int numeroPuertas, String tipoCombustible) {
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;


    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


}
