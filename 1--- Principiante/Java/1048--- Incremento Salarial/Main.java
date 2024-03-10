import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] rango = {0,400.01,800.01,1200.01};
        double[] rango2 = {400.00,800.00,1200.00,2000.00};
        int[] porcentaje = {15, 12, 10, 7, 4};
        double salario = teclado.nextDouble();
        double incremento = 0;
        for(int i=0; i < 5; i++){
            if(i<4){
                if(salario>=rango[i] && salario<=rango2[i]){
                    incremento = (salario*porcentaje[i])/100;
                    System.out.println(String.format("Novo salario: %.02f", (incremento+salario)));
                    System.out.println(String.format("Reajuste ganho: %.2f", incremento));
                    System.out.println("Em percentual: " + porcentaje[i] + " %");
                }
            }
            if(i==4){
                if(salario>2000){
                    incremento = (salario*porcentaje[i])/100;
                    System.out.println(String.format("Novo salario: %.02f", (incremento+salario)));
                    System.out.println(String.format("Reajuste ganho: %.2f", incremento));
                    System.out.println("Em percentual: " + porcentaje[i] + " %");
                }
            }
        }
    }
}
