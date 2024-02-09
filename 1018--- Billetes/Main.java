import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int billete, billete100=0, billete50=0, billete20=0, billete10=0, billete5=0, billete2=0, billete1=0;
        billete = teclado.nextInt();
        System.out.println(billete);
        while (100<=billete) {
            billete = billete -100;
            billete100++;
        }
        while (50<=billete) {
            billete = billete -50;
            billete50++;
        }
        while (20<=billete) {
            billete = billete -20;
            billete20++;
        }
        while (10<=billete) {
            billete = billete -10;
            billete10++;
        }
        while (5<=billete) {
            billete = billete -5;
            billete5++;
        }
        while (2<=billete) {
            billete = billete -2;
            billete2++;
        }
        while (1<=billete) {
            billete = billete -1;
            billete1++;
        }
        
        
        System.out.println(billete100 + " nota(s) de R$ 100,00");
        System.out.println(billete50 + " nota(s) de R$ 50,00");
        System.out.println(billete20 + " nota(s) de R$ 20,00");
        System.out.println(billete10 + " nota(s) de R$ 10,00");
        System.out.println(billete5 + " nota(s) de R$ 5,00");
        System.out.println(billete2 + " nota(s) de R$ 2,00");
        System.out.println(billete1 + " nota(s) de R$ 1,00");
    }
}
