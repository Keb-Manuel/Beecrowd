import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dias = 0, horas = 0, minutos = 0, segundos = 0;
        Scanner teclado = new Scanner(System.in);
        String texto;
        texto = teclado.next();
        int dia = teclado.nextInt();
        int hora = teclado.nextInt();
        texto = teclado.next();
        int minuto = teclado.nextInt();
        texto = teclado.next();
        int segundo = teclado.nextInt();
        texto = teclado.next();
        int dia2 = teclado.nextInt();
        int hora2 = teclado.nextInt();
        texto = teclado.next();
        int minuto2 = teclado.nextInt();
        texto = teclado.next();
        int segundo2 = teclado.nextInt();
        if(hora==hora2&&minuto==minuto2&&segundo==segundo2){
            dias = dia2 - dia;
        }
        else{
            dias = dia2 - dia - 1;
            if(hora > hora2){
                horas = (24-hora) + hora2;
            } else{
                horas = hora2 - hora;
            }
            if(minuto > minuto2){
                minutos = (60-minuto) + minuto2;
            } else{
                minutos = minuto2 - minuto;
            }
            if(segundo > segundo2){
                segundos = (60-segundo) + segundo2;
            } else{
                segundos = segundo2 - segundo;
            }
            while(segundos>60){
                segundos -= 60;
                minutos++;
            }
            while(minutos>60){
                minutos -= 60;
                horas++;
            }
            while(horas>24){
                horas-=24;
                dias++;
            }
        }
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
