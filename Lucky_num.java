import java.util.Scanner;

public class Lucky_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int luck=0;
        long num;
         num=s.nextLong();
         while(num!=0){
          if(num%10==4 || num%10==7){
            luck++;
          }
          num/=10;
        }
        if(luck==4 || luck==7){
        System.out.println("YES");
        }
        else{
        System.out.println("NO");
        }
        s.close();
    }
}
