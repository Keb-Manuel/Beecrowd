import java.util.Scanner;

public class Main {
   public static void main(String []args){
    Scanner teclado = new Scanner(System.in);
    int a,b;
    a = teclado.nextInt();
    b = teclado.nextInt();
    if(b%a==0||a%b==0 ){
        System.out.println("Sao Multiplos");
    }
    else{
        System.out.println("Nao sao Multiplos");
    }
   } 
}
