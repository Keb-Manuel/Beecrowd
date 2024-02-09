import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int hora, kilometros;
        double litros;
        hora = teclado.nextInt();
        kilometros = teclado.nextInt();
        litros = (hora*kilometros)/12f;
        System.out.println(String.format("%.3f", litros));
        
    }
}
