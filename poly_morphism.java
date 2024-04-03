// polymorphism //function overloading

class poly{
   public void printinfo(String name){
     System.out.println(name);
  } 
   public void printinfo(){
     System.out.println("no argument");
  } 
   public void printinfo(String name,int age){
     System.out.println(name+" "+age);
  } 
}

public class poly_morphism {
   public static void main(String args []){
    poly p1=new poly();
    p1.printinfo("avani");
    p1.printinfo();
    p1.printinfo("aman", 20);

    poly p2=new poly();
    p2.printinfo("Dhara");
    p2.printinfo();
    p2.printinfo("Ashis", 22);
  }

}
