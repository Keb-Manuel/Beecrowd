import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numExp = teclado.nextInt();
        int[] exp = new int[numExp];
        char[] animal = new char[numExp];
        int suma = 0;
        for(int i = 0; i < numExp; i++){
            exp[i] = teclado.nextInt();
            animal[i] = teclado.next().charAt(0);
            suma += exp[i];
        }
        int[] cantAnimal = new int[3];
        for(int i = 0; i < numExp; i++){
            if(animal[i]=='C'){
                cantAnimal[0]+=exp[i];
            }
            else if(animal[i]=='R'){
                cantAnimal[1]+=exp[i];
            }
            else if(animal[i]=='S'){
                cantAnimal[2]+=exp[i];
            }
        } 
        double[] porcAnimal = new double[3];
        for(int i = 0; i < 3; i++){
            porcAnimal[i] = ((double)cantAnimal[i]/suma)*100;
        }
        System.out.println("Total: " + suma + " cobaias");
        System.out.println("Total de coelhos: " + cantAnimal[0]);
        System.out.println("Total de ratos: " + cantAnimal[1]);
        System.out.println("Total de sapos: " + cantAnimal[2]);
        System.out.println(String.format("Percentual de coelhos: %.2f", porcAnimal[0])+ " %");
        System.out.println(String.format("Percentual de ratos: %.2f", porcAnimal[1])+ " %");
        System.out.println(String.format("Percentual de sapos: %.2f", porcAnimal[2])+ " %");
    }
}