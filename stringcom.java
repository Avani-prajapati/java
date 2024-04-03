import java.util.Scanner;
public class stringcom {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.next().compareToIgnoreCase(s.next());
           if(a==0){
             System.out.println("0");
           }
           else if(a>0){
             System.out.println("1");
           }
           else {
             System.out.println("-1");
           }
        s.close();
    }
}
