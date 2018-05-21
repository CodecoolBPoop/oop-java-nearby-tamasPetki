import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ready = true;

        do {
            System.out.println("Please give the first number:");
            int x = in.nextInt();

            System.out.println("Please give the second number:");
            int y = in.nextInt();

            System.out.println("Please give the second number:");
            int range = in.nextInt();

            Nearby nearby = new Nearby();

            try {
                for (int i : nearby.nearby(x, y, range)) {
                    System.out.println(i);
                };
                ready = true;
            }
            catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("Sorry, the numbers are out of the arrays");
                ready = false;
            }
        } while (!ready);
    }
}

