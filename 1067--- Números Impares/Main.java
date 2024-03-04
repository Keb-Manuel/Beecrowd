import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int num1 = 1;
        while(num1<=num){
            System.out.println(num1);
            num1+=2;
        }
    }
}
