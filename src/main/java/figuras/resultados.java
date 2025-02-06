package figuras;

public interface resultados {

    Double area();
    Double perimetro();

    default void imprime(){
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }

}