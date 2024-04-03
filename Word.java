import java.util.Scanner;

class Word{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String str=s.next();
    int low=0,up=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>=65 && str.charAt(i)<=90){
         up++;
          }
        else {
            low++;
          }
    }
    if(low>=up){
    System.out.println(str.toLowerCase());
       }
    else{
    System.out.println(str.toUpperCase());
       }
       s.close();
 }
}