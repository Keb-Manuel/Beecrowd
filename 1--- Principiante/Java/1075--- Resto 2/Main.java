import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int num = teclado.nextInt();
        for(int i = 0; (num*i) < 10000; i++){
            System.out.println((num*i)+2);
        }
    }
}
