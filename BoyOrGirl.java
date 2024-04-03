import java.util.Scanner;
 
public class BoyOrGirl {
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        String str=new String();
        str = s.next();
        int count=str.length();
        char[] chat=str.toCharArray();
        for(int i=0;i<str.length();i++){
            int x=0;
            for(int k=i-1;k>=0;k--){
            if(chat[k]==chat[i]){
            x++;
           
            }
            }
          if(x>0)
           continue;
           for(int j=i+1;j<str.length();j++){
            
            if(chat[i]==chat[j]){
              count--;
             }
             
           }
        }
    //    System.out.println(cozcinitufxoldnokacdvtmdohsfdjepyfioyvclhmujiqwunt);
       if(count%2==0){
      System.out.println("CHAT WITH HER!");
      }
        
       else{
      System.out.println("IGNORE HIM!");
      }
      s.close();
    }
}
