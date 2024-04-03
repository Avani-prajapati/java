import java.util.ArrayList;
import java.util.Scanner;

public class way_to_long_string{
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    ArrayList <String> a=new ArrayList<String>();
    int word=s.nextInt();
    if(word<=0 || word>100){
      System.exit(0);
    }
    s.nextLine();
    for(int i=1;i<=word;i++){
        String ai =new String();
        ai=s.nextLine();
        if(ai.length()>10){
        ai=ai.charAt(0)+Integer.toString(ai.length()-2)+ai.charAt(ai.length()-1);
        }
        a.add(ai);
    }
     for(String w:a){
    System.out.println(w);
    }
    s.close();
  }

}
