class Multiples {

    public static void main(String[] args) {
        int i = 1;
        while (i < 1000) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {

                System.out.println(i);
                i++;

            } else if (divisibleBy3) {

                System.out.println(i);
                i++;

            } else if (divisibleBy5) {

                System.out.println(i);
                i++;

            } else {

                i++;

            }
        }
    }

}