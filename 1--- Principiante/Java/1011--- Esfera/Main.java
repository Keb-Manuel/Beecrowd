import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double a, pi, r, resultado;
        a = (4/3.0);
        pi = 3.14159;
       Scanner teclado = new Scanner(System.in);
        r = teclado.nextDouble();
        resultado = a * pi * (r*r*r);
        System.out.println(String.format("VOLUME = %.3f", resultado));
    }
}