import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a, b, c;
        // para que se considere un triangulo con las medidas proporsionadas la sumas de dos datos, tiene que ser mayor al del que no se sumo
        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();

        if((a+b)>c&&(a+c)>b&&(b+c)>a){
            float perimetro = a+b+c;
            System.out.println("Perimetro = " + perimetro);
        }
        else{
            float area = ((a + b)/2)*c;
            System.out.println("Area = " + area);
        }
    }
}
