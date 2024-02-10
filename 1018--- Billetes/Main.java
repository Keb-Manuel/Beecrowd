import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int billete;
        int[] billetesTodos = new int[7];
        int[] valor = {100, 50, 20, 10, 5, 2, 1};
        billete = teclado.nextInt();
        System.out.println(billete);
        for(int i=0; i <= 6 ; i++){
            while (billete >= valor[i]) {
                billete = billete - valor[i];
                billetesTodos[i]++;
            }
        }
        int i = 0;
        while (i <= 6) {
            System.out.println(billetesTodos[i] + " nota(s) de R$ " + valor[i] + ",00");
            i++;
        }
    }
}
