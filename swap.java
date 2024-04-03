import java.util.*;
public class swap{
public static void Swap(int a,int b)
{ a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("a="+a+" b="+b);  
}    
public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.print("enter value of a:");
    int a=sc.nextInt();
    System.out.print("enter value of b:");
    int b=sc.nextInt();
 System.out.println("befor swaping a="+a+" b="+b);
 System.out.print("after swaping ");
 
 Swap(a,b);
 sc.close();
}
}