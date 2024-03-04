import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        for(int i = 0; i<=num; i++){
            if((i%2)==0&&i!=0){
                System.out.println(i + "^2 = "+(i*i));
            }
        }
    }
}