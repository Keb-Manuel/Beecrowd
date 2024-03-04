import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        int horas, minutos;
        if (a == c && b == d) {
            horas = 24;
            minutos = 0;
        } else if (c > a || (c == a && d >= b)) {
            horas = c - a;
            minutos = d - b;
        } else {
            horas = (24 - a) + c;
            minutos = d - b;
        }

        while (minutos < 0) {
            minutos += 60;
            horas--;
        }

        System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");
    }
}