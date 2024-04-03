import java.util.*;
public class problemsolve {
    public static void main(String[] args) {
        int petya,vesya,tonya,n;
        int  sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        petya=s.nextInt();
        vesya=s.nextInt();
        tonya=s.nextInt();
        if(petya!=0 && petya!=1){
         System.exit(0);
        }
        if(vesya!=0 && vesya!=1){
         System.exit(0);
        }
        if(tonya!=0 && tonya!=1){
         System.exit(0);
        }
        if(petya==1&&vesya==1 || vesya==1&& tonya==1 || petya==1&&tonya==1){
           arr[i]=1;
          }
        }
        
        for(int i=0;i<n;i++){
          sum=sum+arr[i];
        }
        System.out.println(sum);
      s.close();
    }
}
