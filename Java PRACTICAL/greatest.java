import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A value");
        int a=sc.nextInt();
         System.out.println("Enter the B value");
          int b=sc.nextInt();
          System.out.println("Enter the C value");
           int c=sc.nextInt();
           if(a>b&&a>c){
            System.out.println("A is greater");
           }
           else if(b>c&&b>a){
            System.out.println("B is grater");
           }
           //else if(a==b&&a==c)
           else{
            System.out.println("C is greater");
           }

        
    }
    
}
