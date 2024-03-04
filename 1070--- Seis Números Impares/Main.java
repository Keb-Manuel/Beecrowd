import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        int[] impares = new int[num];
        for(int i = 0; i < 6; i++){
            if((num%2)==1){
                impares[i]=num;
            }
            else{
                num+=1;
                impares[i]=num;
            }
            System.out.println(impares[i]);
            num+=2;
        }
    }
}
