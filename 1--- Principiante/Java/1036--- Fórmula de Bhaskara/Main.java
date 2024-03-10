import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, b, c, raiz, result1, result2;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        //Formula Ecuacion de segundo grado
        double procedimiento = (b*b)-(4*a*c);
        if (a!=0 && procedimiento>0) {
            raiz = Math.sqrt(procedimiento);
            result1 = ((b*(-1))+raiz)/(2*a);
            result2 = ((b*(-1))-raiz)/(2*a);
            System.out.println(String.format("R1 = %.5f", result1));
            System.out.println(String.format("R2 = %.5f", result2));
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}
