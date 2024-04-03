public class cheakArrAssi {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int d[]=a;
        int c[]=new int[3];
        for(int i=0;i<3;i++){
           c[i]=a[i];
        }
        System.out.println("before changing element of a");
        System.out.print("a : ");
        display(a);
        System.out.print("d : ");
        display(d);
        System.out.print("c : ");
         display(c);
        
        a[1]=3;a[2]=4;a[0]=9;
        System.out.println("after changing element of a");
        System.out.print("a : ");
        display(a);
        System.out.print("d : ");
        display(d);
        System.out.print("c : ");
         display(c);
    
    }
    public static void display(int []a){
      for(int i=0;i<3;i++){
        System.out.print(a[i]+" ");
     }
     System.out.println();

    }
}
