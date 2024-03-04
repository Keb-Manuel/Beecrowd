import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] destino = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int[] ddd = {61, 71, 11, 21, 32, 19,27, 31};
        int codigo = teclado.nextInt();
        boolean estado = false;
        for(int i = 0; i < 8; i++){
            if(i<8){
                while(codigo==ddd[i]){
                    System.out.println(destino[i]);
                    estado = true;
                    break;
                }
            }
        }
        if(estado == false){
            System.out.println("DDD nao cadastrado");
        }
    }
}
