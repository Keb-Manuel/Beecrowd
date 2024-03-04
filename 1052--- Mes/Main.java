import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String [] mes = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int numMes  = teclado.nextInt();
        System.out.println(mes[numMes-1]);
    }
}
