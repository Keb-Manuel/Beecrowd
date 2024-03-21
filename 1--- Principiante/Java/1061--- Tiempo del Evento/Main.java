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

        if (hora == hora2 && minuto == minuto2 && segundo == segundo2) {
            dias = dia2 - dia;
            if(dias < 0){
                dia = 0;
            }
            segundos = 0;
            minutos = 0;
        }
        // se calcula el tiempo de todo
        else {
            dias = dia2 - dia;
            dias--;
            if(dias < 0){
                dia = 1;
            } else {
                dia = 0;
            }
        }
        if (segundo <= segundo2) {
            segundos = segundo2 - segundo;
        } else {
            segundos = segundo - segundo2;
        }
        if (minuto <= minuto2) {
            minutos = minuto2 - minuto;
        } else {
            minutos = (60 - minuto) + minuto2;
            if (minutos > 60) {
                while (minutos > 60) {
                    minutos -= 60;
                    horas++;
                }
            }
        }
        if (hora <= hora2) {
            horas = hora2 - hora;
        } else {
            horas = (24 - hora) + hora2;
        }
        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");
    }
}
