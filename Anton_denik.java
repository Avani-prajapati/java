import java.util.Scanner;

public class Anton_denik {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),A=0,D=0;
        String str=s.next();
         for(int i=0;i<n;i++){
         if(str.charAt(i)=='A'){
            A++;
          }
         else{
           D++;
         } 
        }
        if(A>D){
        System.out.println("Anton");
        }
        else if(A<D){
        System.out.println("Danik");
        }
        else{
        System.out.println("Friendship");
        }
        s.close();
    }
}
