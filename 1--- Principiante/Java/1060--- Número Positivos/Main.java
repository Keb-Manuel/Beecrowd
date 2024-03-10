import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numero = new float[6];
        numero[0] = teclado.nextFloat();
        numero[1] = teclado.nextFloat();
        numero[2] = teclado.nextFloat();
        numero[3] = teclado.nextFloat();
        numero[4] = teclado.nextFloat();
        numero[5] = teclado.nextFloat();
        int i = 0;
        int numPositivos = 0;
        while (i<6) {
            if(numero[i]>0){
                numPositivos++;
            }
            i++;
        }
        System.out.println(numPositivos + " valores positivos");
    }
}
