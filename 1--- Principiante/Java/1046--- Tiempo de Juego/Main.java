import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b;
        a = teclado.nextInt();
        b = teclado.nextInt();
        int horas = (24-a)+b;
        if(horas<=24){
            System.out.println("O JOGO DUROU " + horas + " HORA(S)");
        }
        else{
            System.out.println("O JOGO DUROU " + (horas-24) + " HORA(S)");
        }
    }
}
