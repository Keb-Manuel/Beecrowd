import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        double a, b, c, respuesta;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        respuesta = ((a*2)+(b*3)+(c*5))/10;
        System.out.println(String.format("MEDIA = %.1f", respuesta));
    }
}
