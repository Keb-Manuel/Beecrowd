public class Main {
    public static void main(String[] args) {
        // 1 3 5 7 9
        int ronda = 0;
        double i = 0, j = 1, incremento = 0.2f, incremento2 = 0.2f;
        double epsilon = 0.00001f;
        while(i<2.1){
            if(i==0||Math.abs(i - 1) < epsilon||Math.abs(i - 2) < epsilon){
                System.out.printf("I=%.0f J=%.0f%n", i, j);
            }
            else{
                System.out.printf("I=%.1f J=%.1f%n", i, j);
            }
            j++;
            ronda++;
            if (ronda==3) {
                i += incremento;
                j = 1 + incremento2;
                ronda = 0;
                incremento2+=0.2f;
            }
        }
    }
}
