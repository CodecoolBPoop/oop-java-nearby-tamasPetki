import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ready;

        do {
            Nearby nearby = new Nearby();

            System.out.println("Please give the first number:");
            int x = in.nextInt();

            System.out.println("Please give the second number:");
            int y = in.nextInt();

            System.out.println("Please give the range:");
            int range = in.nextInt();

            try {

                for (int i : nearby.nearby(x, y, range)) {
                    System.out.println(i);
                }
                ready = true;
            }
            catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException exception) {
                System.out.println("Sorry, the numbers are out of the arrays");
                ready = false;
            }
        } while (!ready);
    }
}

