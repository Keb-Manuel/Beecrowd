import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int suma = 0;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1 + 1; i <= num2 - 1; i++) {
            if (i % 2 == 1||i%2==-1) {
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}