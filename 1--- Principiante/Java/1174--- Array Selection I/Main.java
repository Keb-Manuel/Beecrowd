import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        float[] arreglo = new float[100];
        float num = 0;
        int cont = 0;
        boolean t = true;
        while(cont < 100){
            while(t == true){
                try{
                    num = Float.valueOf(lector.readLine());
                }
                catch(IOException io){
                    System.out.println();
                }
                if(num <= 10){
                    t = false;
                }
            }
            arreglo[cont] = num;
            cont++;
        }
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length-1; j++){
                float elemActual = arreglo[j];
                float elemSiguiente = arreglo[j+1];
                if(elemActual > elemSiguiente){
                    arreglo[j] = elemSiguiente;
                    arreglo[j+1] = elemActual;
                }
            }
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("A[" + i + String.format("] = %.1f", arreglo[i]));
        }
    }
}
