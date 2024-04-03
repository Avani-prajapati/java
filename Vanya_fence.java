import java.util.Scanner;

public class Vanya_fence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),h=s.nextInt(),res=0;
        int[] Friend=new int[n];
        for(int i=0;i<n;i++){
        Friend[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
        if(Friend[i]>h){
        res+=2;
         }
         else{
        res+=1;
        }
        }
        System.out.println(res);
     s.close();
    }
}
