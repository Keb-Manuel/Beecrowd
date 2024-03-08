import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner teclado =  new Scanner(System.in);
        int num = teclado.nextInt();
        for(int i=1; i<11;i++){
            System.out.println(i +" x " + num + " = " + (i*num));
        }
    }
}
