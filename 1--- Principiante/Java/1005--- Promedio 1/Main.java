import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        float a, b;
        double respuesta;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        respuesta = ((a*3.5)+(b*7.5))/11;
        System.out.println(String.format("MEDIA = %.5f", respuesta));
    }
}
