public class Euler {
    public static void main(String[] args) {
        double sum = 0;
        int precision = 10000;

        for (int i = 1; i <= precision; i++) {
            sum += 1 / Math.pow(i, 2);
        }

        System.out.println(Math.sqrt(sum * 6));
    }
}
