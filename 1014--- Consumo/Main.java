import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float gasolina, kilometro, resultado;
        gasolina = teclado.nextFloat();
        kilometro = teclado.nextFloat();
        resultado = gasolina / kilometro;
        System.out.println(String.format("%.3f", resultado) + " km/l"); 
    }
}