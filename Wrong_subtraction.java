import java.util.Scanner;

public class Wrong_subtraction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,k;
         n=s.nextInt();
         k=s.nextInt();
         for(int i=1;i<=k;i++){
          if(n%10==0){
             n/=10;
          } 
          else{
            n-=1;
          }
        }
        System.out.println(n);
        s.close();
    }
}
