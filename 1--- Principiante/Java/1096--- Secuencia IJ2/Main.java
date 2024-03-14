public class Main {
    public static void main(String[] args) {
        // 1 3 5 7 9
        int x = 1, j = 7;
        for (int i = 0; i < 15; i++) {
            if (i == 3 || i == 6 || i == 9 || i == 12) {
                x += 2;
                j = 7;
            }
            System.out.println("I=" + x + " J=" + j);
            j-= 1;
        }
    }
}
