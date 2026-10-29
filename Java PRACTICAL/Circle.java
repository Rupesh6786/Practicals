import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a radius:");
        int r=sc.nextInt();
        float area,Peri,pi=3.14f;
        area=pi*(r*r);
        Peri=2*pi*r;
        System.out.println("Area of Circle="+area);
        System.out.println("Perimeter of Circle="+Peri);



    }

    
}
