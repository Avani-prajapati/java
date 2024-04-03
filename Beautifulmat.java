import java.util.Scanner;

public class Beautifulmat {
    public static void main(String[] args) {
        int[][] arr=new int[5][5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
             arr[i][j]=s.nextInt();
          }
        }
       
        for(int i=0;i<5;i++){
           for(int j=0;j<5;j++){
            if(arr[i][j]!=0){
              // System.out.println(i+j);
              if((i==0 || i==4) && (j==0 || j==4)){
                System.out.println("4");
                }
                else if(((i+j)%2!=0) && i==2 || ((i+j)%2 !=0 )&& j==2 ){
                System.out.println("1");
                }
                else if((i+j)%2 !=0){
                    System.out.println("3");
                }
                else if(i==2 &&j==2){
                System.out.println("0");
                }
                else if((i+j)%2==0 && (i+j)!=0){
                System.out.println("2");
                }
              
               System.exit(0); 
            }
          }
        }   
        s.close();
    }
}
