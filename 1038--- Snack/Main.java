import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] precio = {4.00, 4.50, 5.00, 2.00, 1.50};
        int producto, cantidad;
        producto = teclado.nextInt();
        cantidad = teclado.nextInt();
        double total = precio[producto-1] * cantidad;
        System.out.println(String.format("Total: R$ %.2f", total));
    }
}
