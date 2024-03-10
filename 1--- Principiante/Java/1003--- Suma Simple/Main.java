import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        int num1, num2, suma;
        Scanner teclado = new Scanner(System.in);
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        suma = num1 + num2;
        System.out.println("SOMA = " + suma);
    }
}
