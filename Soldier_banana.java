import java.util.Scanner;
public class Soldier_banana {
    public static void main(String[] args) {
      int k,n,w,ans=0;
        Scanner s=new Scanner(System.in);
        k=s.nextInt();
        n=s.nextInt();
        w=s.nextInt();
       for(int i=1;i<=w;i++){
        ans+=k*i;
      }
     if(n>=ans){
        System.out.println("0");
    }
    else{
    ans-=n;
    System.out.println(ans);
    }
     s.close();
    }
}
