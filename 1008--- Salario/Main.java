import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        float b, c, d;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
        d = b * c;
        System.out.println("NUMBER = " + a);
        System.out.println(String.format("SALARY = U$ %.2f", d));
    }
}
