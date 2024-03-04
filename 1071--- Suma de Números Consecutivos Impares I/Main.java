import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int suma = 0;
        if(num1>=num2){
            for(int i = num1; i < num2; i++){
                if((i%2)==1){
                    suma+=i;
                }
            }
        }
        else{
            for(int i = num2; i < num1; i++){
                int aux = i;
                if((aux%2)==1){
                    suma+=i;
                }
            }
        }
        System.out.println(suma);
    }
}
