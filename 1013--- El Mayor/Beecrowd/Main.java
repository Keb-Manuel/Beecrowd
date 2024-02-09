import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c, mayor, resultado;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        mayor = (a+b+Math.abs(a-b))/2;
        resultado = (mayor+c+Math.abs(mayor-c))/2;
        System.out.println(resultado + " eh o maior");
    }
}
