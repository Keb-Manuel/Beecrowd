import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] num1 = { 0.0, 25.0, 50.0, 75.0 };
        double[] num2 = { 25.0, 50.0, 75.0, 100.0 };
        char[] caracter = { '[', '(', '(', '(' };
        char[] caracter2 = { ']', ']', ']', ']' };
        double num;
        boolean encontrado = false;
        num = teclado.nextDouble();
        for (int i = 0; i < 4; i++) {
            if ((num >= num1[i]) && (num <= num2[i])) {
                System.out.println("Intervalo " + caracter[i] + (int) Math.round(num1[i]) + "," + (int) Math.round(num2[i]) + caracter2[i]);
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println("Fora de intervalo");
        }
    }
}
