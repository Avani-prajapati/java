import java.util.Arrays;
import java.util.Scanner;
public class Mathcal {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        String str=new String();
        str=s.next();
        char[] st=str.toCharArray();
        char[] sort=new char[str.length()/2+1];
        for(int j=0,i=0;i<str.length();i=i+2,j++){
          sort[j]=st[i];
        } 
        Arrays.sort(sort);
        
        for(int j=0,i=0;i<str.length();i=i+2,j++){
            st[i]=sort[j];
          }
        System.out.println(st);
       s.close();
    }
}
