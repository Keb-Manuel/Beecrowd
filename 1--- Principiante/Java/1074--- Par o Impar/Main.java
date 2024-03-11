import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numTotal = teclado.nextInt();
        int[] nums = new int[numTotal];
        int i = 0;
        while(numTotal > i){
            nums[i] = teclado.nextInt();
            i++;
        }
        for(i = 0; i < numTotal; i++){
            if(nums[i]==0){
                System.out.println("NULL");
            }
            else if((nums[i]%2)==0){
                if(nums[i]>0){
                    System.out.println("EVEN POSITIVE");
                }
                else{
                    System.out.println("EVEN NEGATIVE");
                }
            }
            else{
                if(nums[i]>0){
                    System.out.println("ODD POSITIVE");
                }
                else{
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
