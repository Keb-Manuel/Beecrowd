import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int ronda = 0;
        while(ronda < num){
            int aux = ronda + 1;
            int[] array = new int[]{aux, aux*aux, aux*aux*aux};
            System.out.print(array[0] + " ");
            System.out.print(array[1] + " ");
            System.out.print(array[2]);
            System.out.println(" ");
            System.out.print(array[0] + " ");
            System.out.print(array[1] + 1 + " ");
            System.out.print(array[2] + 1);
            System.out.println(" ");
            ronda++;
        }
    }
}
