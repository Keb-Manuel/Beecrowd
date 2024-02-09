import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, pi, area1, area2, area3, area4, area5;
        pi = 3.14159;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        area1 = (a*c)/2;
        area2 = pi *(c*c);
        area3 = ((a + b)/2)*c;
        area4 = b * b;
        area5 = a * b;
        System.out.println(String.format("TRIANGULO: %.3f", area1));
        System.out.println(String.format("CIRCULO: %.3f", area2));
        System.out.println(String.format("TRAPEZIO: %.3f", area3));
        System.out.println(String.format("QUADRADO: %.3f", area4));
        System.out.println(String.format("RETANGULO: %.3f", area5));
    }
}