package figuras;

public abstract class propiedades {
    protected double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public abstract Double area();

    public  abstract Double perimetro();
}
