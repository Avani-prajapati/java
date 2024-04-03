import java.util.Scanner;
public class Stone {
 public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int x=0;
      String str=s.next();
      s.nextLine();
      for(int i=1;i<n;i++){
       if(str.charAt(i)==str.charAt(i-1) && i<str.length()){
            x++;
          }
      }  
      System.out.println(x);
      s.close();
    }
}
