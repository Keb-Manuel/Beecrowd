import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario = teclado.nextDouble();
        double impuestos=0;
        if(salario<2000.00){
            System.out.println("Isento");
        }else{
            if(salario>=4500.00){
                impuestos += (salario-4500)*.28;
                salario = 4500;
                
            }
            if(salario>3000.00){
                impuestos += (salario-3000)*.18;
                salario = 3000;
            }
            if(salario>2000.00){
                impuestos += (salario-2000)*.08;
                salario = 2000;
            }
            System.out.println(String.format("R$ %.2f", impuestos));
        }
    }
}
