import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        numeros[0] = teclado.nextInt();
        numeros[1] = teclado.nextInt();
        numeros[2] = teclado.nextInt();
        numeros[3] = teclado.nextInt();
        numeros[4] = teclado.nextInt();
        int i = 0;
        int numeroPares = 0;
        while(i<5){
            if((numeros[i]%2)==0){
                numeroPares++;
            }
            i++;
        }
        System.out.println(numeroPares + " valores pares");
    }
}
