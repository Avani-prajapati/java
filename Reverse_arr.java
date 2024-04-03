import java.util.*;
class Reverse_arr {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Try programiz.pro");
        int[] a=new int[3];
        System.out.println("enter array element");
for(int i=0;i<2;i++){
          a[i]  =s.nextInt();
        }
        
        int[] d=a;
        System.out.println("real array is ");
for(int i=0;i<3;i++){
            System.out.println(d[i]);
        }
        int[] c= reverce(a);
        System.out.println("reverce array is ");
        for(int i=0;i<3;i++){
            System.out.println(c[i]);
        }
        s.close();
    }
    public static int[] reverce(int a[]){
        int[] b=new int[3];
        for(int i=0, j=(a.length-1);i<3;i++,j--){
            b[i]=a[j];
        }
        return b;
    }
}