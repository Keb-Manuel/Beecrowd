import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias, mes=0, anio=0;
        dias = teclado.nextInt();
        while (365<=dias) {
            dias = dias - 365;
            anio++;
        }
        while (30<=dias) {
            dias = dias - 30;
            mes++;
        }
        System.out.println(anio + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}
