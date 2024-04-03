class Student{
 String name ;
 int age;
  void printinfo(){
    System.out.println("name and age are :"+name+""+age);
}
 Student(){
}
Student(Student s2){
 this.name=s2.name;
 this.age=s2.age;
}


}

public class copy_object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="avani";
        s1.age=20;
 
        Student s4=new Student(s1);
        // s4.name="avani";
        // s4=s1;
        s1.printinfo();
        s4.printinfo();
        
        System.out.println(s1.equals(s4));
        System.out.println(s1==s4);
       
    }
}
