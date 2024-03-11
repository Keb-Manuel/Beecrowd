import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int[] nums = new int[100];
        int i = 0;
        while(i < 100){
            nums[i] = teclado.nextInt();
            i++;
        }
        int pos = 0;
        int cant = nums[0];
        for(i=1; i<100; i++){
           if(nums[i]>=cant){
                pos = i;
                cant = nums[i];
           }
        }
        System.out.println(cant);
        System.out.println(pos+1);
    }
}
