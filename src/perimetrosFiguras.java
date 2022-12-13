import java.util.Scanner;

public class perimetrosFiguras {
    private double lado, base, altura;
    private Scanner sc = new Scanner(System.in);
    static void mostrarMenu() {
        System.out.println("****MENU****");
        System.out.println("1. AREAS DE FIGURAS");
        System.out.println("2. PERIMETROS DE FIGURAS");
        System.out.println("3. VOLUMENES DE FIGURAS");
    }
    public void menuPerimetros() {
        System.out.println("PERIMTROS DE FIGURAS\n");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triangulo");
        System.out.println("3. Rectangulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Circulo");

    }
    public void perimCuadrado(){
        System.out.println("Ingresa el lado del cuadrado: ");
        lado = sc.nextDouble();
        double perimCua = 4 * lado;
        System.out.println("El perimetro del cuadrado es: " + perimCua);
    }
}

