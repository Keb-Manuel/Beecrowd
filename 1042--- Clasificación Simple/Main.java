import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int  [] numeros = new int[3];
        numeros[0] = teclado.nextInt();
        numeros[1] = teclado.nextInt();
        numeros[2] = teclado.nextInt();
        int [] numeros2 = {numeros[0], numeros[1], numeros[2]};
        int aux = 0;
        for(int i=0; i<numeros.length-1;i++){
            for(int j=0; j < numeros.length-1; j++){
                if(numeros[j]>numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        for(int a=0; a<3; a++){
        System.out.println(numeros[a]);
        }
        System.out.println("");
        for(int a=0; a<3; a++){
        System.out.println(numeros2[a]);
        }
    }
}
