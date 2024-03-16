import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 =teclado.nextInt();
        int num2 =teclado.nextInt();
        while(num1!=num2){
            if(num1>num2){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
            num1 =teclado.nextInt();
            num2 =teclado.nextInt();
        }
    }
}
