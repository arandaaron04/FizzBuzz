public class Reduce {
    public static void main(String[] args) {

        int n = 100;
        while (n != 0) {

            if (n % 2 == 0) {

                System.out.println(n);
                n = n / 2;

            } else {

                System.out.println(n);
                n = n - 1;
            }

        }
    }

}
