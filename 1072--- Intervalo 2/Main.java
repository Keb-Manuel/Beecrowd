import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = teclado.nextInt();
        }
        int cont = 0;
        for(int x = 0; x < n; x++){
             if(num[x]>=10&&num[x]<=20){
                cont++;
             }
        }
        System.out.println(cont + " in");
        System.out.println(n-cont + " out");
    }
}
