import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double x1, x2, y1, y2, resultado, operacion;
    x1 = teclado.nextDouble();
    y1 = teclado.nextDouble();
    x2 = teclado.nextDouble();
    y2 = teclado.nextDouble();
    operacion = Math.pow((x2-x1), 2) + Math.pow((y2-y1),2);
    resultado = Math.sqrt(operacion);
    System.out.println(String.format("%.4f", resultado));
   } 
}
