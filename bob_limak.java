import java.util.Scanner;
public class bob_limak {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int bob,limak,year=0;
        bob=s.nextInt();
        limak=s.nextInt();
        while(bob<=limak){
          year++; 
          bob=bob*3;
          limak=limak*2;
          }
          System.out.println(year);
       s.close();
    }
}
