import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float billete;
        int[] billetesTodos = new int[12];
        float[] valor = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        billete = teclado.nextFloat();
        billete *=100;
        for(int i=0; i <= 11 ; i++){
            while (billete >= valor[i]) {
                billete = billete - valor[i];
                billetesTodos[i]++;
            }
        }
        System.out.println("NOTAS:");
        int i = 0;
        while (i <= 5) {
            System.out.println(billetesTodos[i] + String.format(" nota(s) de R$ %.2f" , (valor[i]/100)));
            i++;
        }
        System.out.println("MOEDAS:");;
        while (i <= 11) {
            System.out.println(billetesTodos[i] +  String.format(" moeda(s) de R$ %.2f" , (valor[i]/100)));
            i++;
        }
    }
}