import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int a, b, c, d;
        float e, f;
        double h, i, g;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        e = teclado.nextFloat();
        h = b * e;
        c = teclado.nextInt();
        d = teclado.nextInt();
        f = teclado.nextFloat();
        i = d *f;
        g = h + i;
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", g));
    }
}