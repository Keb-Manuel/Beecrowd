import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int kilometros, tiempo;
        kilometros = teclado.nextInt();
        tiempo = kilometros*2;
        System.out.println(tiempo + " minutos");
    }
}
