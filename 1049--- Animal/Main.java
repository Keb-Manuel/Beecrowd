import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String animal = teclado.nextLine();
        String animal1 = teclado.nextLine();
        String animal2 = teclado.nextLine();
        if(animal.equals("vertebrado")){
            if(animal1.equals("ave")){
                if(animal2.equals("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if (animal2.equals("onivoro")) {
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(animal1.equals("inseto")){
                if(animal2.equals("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if (animal2.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
