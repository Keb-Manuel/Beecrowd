import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        int cont = teclado.nextInt();
        if(cont == 2002){
            System.out.println("Acesso Permitido");
        }
        else{
            while (cont!=2002) {
                System.out.println("Senha Invalida");
                cont = teclado.nextInt();
            }
            System.out.println("Acesso Permitido");
        }
    }
}
