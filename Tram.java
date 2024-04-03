import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] res=new int[n];
        for(int i=0;i<n;i++){
          a[i]=s.nextInt();
          b[i]=s.nextInt();
        }
        res[0]=b[0];
        for(int i=1;i<n;i++){
        res[i]=res[i-1]-a[i]+b[i];
        }
        int max=res[0];
       for(int i=0;i<n;i++){
        if(max<res[i]){
        max=res[i];
        }
     }
     System.out.println(max);
     s.close();
    }
}
