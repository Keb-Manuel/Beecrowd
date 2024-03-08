import java.util.Scanner;

public class Main {
   public static void main(String args[]){
    double radio, area;
    double pi = 3.14159;
    Scanner teclado = new Scanner(System.in);
    radio = teclado.nextDouble();
    area = pi * (radio * radio);
    System.out.println(String.format("A=%.4f", area));
   } 
}
