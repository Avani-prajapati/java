 class person{
   public void sayhello(){
   System.out.println("hello ");
   }
}

public class cheak_equal {
 public static void main(String[] args) {
    person s1=new person();
    person s2=new person();
    s1.sayhello();
   //  s2.info();
    System.out.println(s1.equals(s2));
    System.out.println(s1==s2);
  
    
 }   
}
