import java.util.Scanner;

public class Next_round {
    public static void main(String[] args) {
        int  n,k,sum=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int[] arr=new int[n];
        k=s.nextInt();
        for(int i=0;i<n;i++){
          arr[i]=s.nextInt();
           if(arr[i]>=arr[k-1] && arr[i]>0){
            sum++;
          }
        }
        System.out.println(sum);
        s.close();
    }
}
