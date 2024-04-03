import java.util.Scanner;

public class bit1 {
public static void main(String[] args) {

    int x=0,n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    String sr=new String() ;
    for(int i=0;i<n;i++){
        sr=s.next();
        if(sr.contains("++")){
          x++;
        }
        else if(sr.contains("--")){
        x--;
        }
        else{
        System.exit(0);
        }
     }
  System.out.println(x);
  s.close();
 }
}
  

