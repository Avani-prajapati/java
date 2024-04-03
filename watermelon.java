import java.util.*;

class watermelon{
    public static void main(String args[]){
        int part;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of part");
        part=sc.nextInt();
        if(part%2==0 && part!=2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
            
        }
       sc.close(); 
    }
    
}
