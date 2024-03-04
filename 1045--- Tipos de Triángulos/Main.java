import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros =new double [3];
        numeros[0] = teclado.nextDouble();
        numeros[1] = teclado.nextDouble();
        numeros[2] = teclado.nextDouble();
        double aux = 0.0;
        for(int i=0; i<numeros.length-1;i++){
            for(int j=0; j < numeros.length-1; j++){
                if(numeros[j]<numeros[j+1]){
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        if(numeros[0]>0&&numeros[1]>0&&numeros[2]>0){
            if(numeros[0]>=(numeros[1]+numeros[2])){
                System.out.println("NAO FORMA TRIANGULO");
            }
            else{
                if((numeros[0]*numeros[0]) == ((numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                    System.out.println("TRIANGULO RETANGULO");
                }
                else if((numeros[0]*numeros[0]) > ((numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                    System.out.println("TRIANGULO OBTUSANGULO");
                }
                else{
                    System.out.println("TRIANGULO ACUTANGULO");
                }
            }
            
            if (numeros[0]==numeros[1]&&numeros[1]==numeros[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            else if (numeros[0]==numeros[1]||numeros[1]==numeros[2]||numeros[2]==numeros[0]) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
