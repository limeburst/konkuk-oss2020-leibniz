public class Ramanujan {
    public static void main(String[] args) {
        int precision = 30;
        double sum = 0;
        for (int i = 0; i <= precision; i++) {
            sum += (factorial(4 * i) * (1103 + 26390 * i))
                    / (Math.pow(factorial(i), 4) * Math.pow(396, 4 * i));
        }
        System.out.println(1 / ((Math.sqrt(8) / 9801) * sum));
    }

    static int factorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
