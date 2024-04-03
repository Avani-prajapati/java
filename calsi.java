import java.util.*;

public class calsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("1.sum\n2.subtraction\n3.multiplication\n4.divition");
        do {
            System.out.print("enter choise from above : ");
            int choise = sc.nextInt();
            if (choise > 4 || choise < 1) {
                System.out.println("invalid choise of operation ! ");
                break;
            }
            int ans;
            System.out.print("enter fisrt number : ");
            int a = sc.nextInt();
            System.out.print("enter fisrt number : ");
            int b = sc.nextInt();
            switch (choise) {
                case 1:
                    ans = a + b;
                    System.out.println("sumation is =" + ans);
                    break;
                case 2:
                    ans = a - b;
                    System.out.println("subtraction is =" + ans);
                    break;
                case 3:
                    ans = a * b;
                    System.out.println("multiplication is =" + ans);
                    break;
                case 4:
                    ans = a / b;
                    System.out.println("division is =" + ans);
                    break;
            }
            System.out.println("you want to try another operation(y/n)");

            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        System.out.println("thanks!");
        sc.close();
    }
}
