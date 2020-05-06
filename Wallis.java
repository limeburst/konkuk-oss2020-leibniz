public class Wallis {
    public static void main(String[] args) {
        double product = 1;
        int precision = 100000;

        for (double i = 2; i <= precision; i += 2) {
            product *= ((i - 1) / i) * ((i + 1) / i);
        }

        System.out.println(2 / product);
    }
}
