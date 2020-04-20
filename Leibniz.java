public class Leibniz {
    public static void main(String[] args) {
        double sum = 0;
        double sign = 1.0;
        int precision = 100000;

        for (int i = 1; i <= precision; i += 2) {
            sum += sign / i;
            sign *= -1;
        }

        System.out.println(sum * 4);
    }
}
