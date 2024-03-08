import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        double b, c, d;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextLine();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        d = c * 0.15f;
        System.out.println(String.format("TOTAL = R$ %.2f", (d+b)));
    }
}