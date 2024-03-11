import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTotal =  teclado.nextInt();
        for(int i = 0; i < numTotal;i++){
            float num1 = teclado.nextFloat();
            float num2 = teclado.nextFloat();
            float num3 = teclado.nextFloat();
            float promedio = ((num1*2)+(num2*3)+(num3*5))/10;
            System.out.println(String.format("%.1f", promedio));
        }
    }
}
