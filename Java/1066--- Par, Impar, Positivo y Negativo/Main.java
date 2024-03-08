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
        int numeroPares = 0;
        int numeroPositivos = 0;
        int numerosNegativos = 0;
        for(int i = 0; i < 5; i++){
            if((numeros[i]%2)==0){
                numeroPares++;
            }
            if(numeros[i]>0){
                numeroPositivos++;
            }
            if(numeros[i]<0){
                numerosNegativos++;
            }
        }
        System.out.println(numeroPares + " valor(es) par(es)");
        System.out.println((5-numeroPares) + " valor(es) impar(es)");
        System.out.println(numeroPositivos + " valor(es) positivo(s)");
        System.out.println(numerosNegativos + " valor(es) negativo(s)");
    }
}