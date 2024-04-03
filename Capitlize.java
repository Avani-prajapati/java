import java.util.Scanner;

public class Capitlize {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
        s.close();
    }
}
