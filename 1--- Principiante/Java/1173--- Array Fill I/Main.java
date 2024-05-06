import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        int[] numeros = new int[10];
        int num = 0;
        try{
            num = Integer.parseInt(lector.readLine());
        }
        catch(IOException nfe){
            System.out.println();
        }
        int cont = 0;
        while(cont < 10){
            numeros[cont] = num;
            num *= 2;
            cont++;
        }
        cont = 0;
        while(cont<10){
            System.out.println("N[" + cont + "] = " + numeros[cont]);
            cont++;
        }
    }    
}
