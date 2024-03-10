import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cal1, cal2, cal3, cal4, exa, promedio;
        cal1 = teclado.nextFloat();
        cal2 = teclado.nextFloat();
        cal3 = teclado.nextFloat();
        cal4 = teclado.nextFloat();
        promedio = ((cal1 * 2)+(cal2*3)+(cal3*4)+(cal4*1))/10;
        System.out.println(String.format("Media: %.1f", promedio));
        if(promedio >= 7.0f){
            System.out.println("Aluno aprovado.");
        }
        else if(promedio >= 5.0f && promedio <= 6.9f){
            System.out.println("Aluno em exame.");
            exa = teclado.nextFloat();
            System.out.println(String.format("Nota do exame: %.1f", exa));
            System.out.println("Aluno aprovado.");
            System.out.println(String.format("Media final: %.1f", ((promedio + exa)/2)));
        }
        else{
            System.out.println("Aluno reprovado.");
        }
    }
}
