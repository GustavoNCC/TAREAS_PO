//ME BASE EN UN CODIGO QUE HICIMOS EL SEMESTRE PASADO Y AYUDA DE CHAT GPT EN ERRORES
package menu;

import figuras.*;
import java.util.Scanner;

public class MenuFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMENÚ ");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Rombo");
            System.out.println("5. Círculo");
            System.out.println("6. Figura de N lados");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = scanner.nextDouble();
                    Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                    cuadrado.imprime();
                    break;

                case 2:
                    System.out.print("Ingrese la base del rectángulo: ");
                    double baseRect = scanner.nextDouble();
                    System.out.print("Ingrese la altura del rectángulo: ");
                    double alturaRect = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);
                    rectangulo.imprime();
                    break;

                case 3:
                    System.out.print("Ingrese la base del triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.print("Ingrese el otro lado del triángulo (se asume isósceles): ");
                    double ladoTriangulo = scanner.nextDouble();

                    Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, ladoTriangulo);
                    triangulo.imprime();
                    break;


                case 4:
                    System.out.print("Ingrese el lado del rombo: ");
                    double ladoRombo = scanner.nextDouble();
                    System.out.print("Ingrese la diagonal mayor: ");
                    double diagMayor = scanner.nextDouble();
                    System.out.print("Ingrese la diagonal menor: ");
                    double diagMenor = scanner.nextDouble();
                    Rombo rombo = new Rombo(ladoRombo, diagMayor, diagMenor);
                    rombo.imprime();
                    break;

                case 5:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.imprime();
                    break;

                case 6:
                    System.out.print("Ingrese el número de lados: ");
                    int numLados = scanner.nextInt();
                    System.out.print("Ingrese la longitud de los lados: ");
                    double longitudLado = scanner.nextDouble();
                    FiguraDeLados figura = new FiguraDeLados(numLados, longitudLado);
                    figura.imprime();
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Ingrese de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }
}
