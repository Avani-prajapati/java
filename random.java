import java.util.Scanner;
public class random{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = (int)(Math.random()*100);
    int b ;
     do{System.out.println("guess my number...");
       b = sc.nextInt();
       if(b==a){
    System.out.println("correct");
    break;
    }
    else if(b>a)
    System.out.println("number is large as compare to my number");
    else 
    System.out.println("number is small as compare to my number");

 }while(b>=0);

    System.out.println("my number is "+a);
    sc.close();
}
}