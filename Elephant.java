import java.util.Scanner;

class Elephant {
    public static void main(String[] args) {
        int destination, count = 0;
        Scanner s = new Scanner(System.in);
        destination = s.nextInt();
        if (destination == 1) {
            System.out.println(destination);
            System.exit(0);
        }
        while (destination > 0) {
            if (destination >= 5) {
                count += (destination / 5);
                destination %= 5;
            } else if (destination >= 4) {
                count += (destination / 4);
                destination %= 4;
            } else if (destination >= 3) {
                count += (destination / 3);
                destination %= 3;
            } else if (destination >= 2) {
                count += (destination / 2);
                destination %= 2;
            }
            if (destination == 1) {
                count++;
                break;
            }
        }
        System.out.println(count);
   s.close();
    }
}