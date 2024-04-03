import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.next(),b=s.next();
       StringBuffer berland=new StringBuffer(a);
        if(b.equals(berland.reverse().toString())){
          System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
      s.close();
    }
}
