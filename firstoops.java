class Pen{
  String color;
  String type;

  void work(){
   System.out.println("writting something");
    }
  void printcolor_type(){
     System.out.println("color is : "+this.color);
     System.out.println("type is : "+this.type);
    }  
    Pen(){
     System.out.println("color is : "+this.color);
     System.out.println("type is : "+this.type);
    }  

}


public class firstoops {

    public static void main(String[] args) {
      Pen pen1=new Pen();
      pen1.color="red";
      pen1.type="bollpoint";
      pen1.work();
      pen1.printcolor_type();     
    }
}
