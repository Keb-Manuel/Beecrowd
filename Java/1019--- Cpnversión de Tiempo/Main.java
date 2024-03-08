import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int segundos, minutos, horas, horas1=0, minutos1=0;
        horas = 3600;
        minutos = 60;
        segundos = teclado.nextInt();
        while(horas<segundos){
            segundos = segundos -horas;
            horas1++;
        }
        while(minutos<segundos){
            segundos = segundos -minutos;
            minutos1++;
        }
        System.out.println(horas1 + ":" + minutos1 + ":"+ segundos);
    }   
}
