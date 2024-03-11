import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while(teclado.hasNext()){
            try{
                int a = teclado.nextInt();
                int b = teclado.nextInt();
                System.out.println(a^b);
            }
            catch(Exception e){
                System.out.println(0);;
                break;
            }
        }
    }
}
