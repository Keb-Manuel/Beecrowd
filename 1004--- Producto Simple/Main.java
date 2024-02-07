import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int num1, num2, respuesta;
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        respuesta = num1 * num2;
        System.out.println("PROD = " + respuesta);
    }
}
