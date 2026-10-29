import java.util.Scanner;
public class Binary {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Binary digit:");
        String num;
        num=sc.nextLine();
        System.out.println("Binary to Decimal:="+Integer.parseInt(num,2));
        System.out.println("Enter a Decimal number:");
        int num1=sc.nextInt();
        System.out.println("Decimal to Binary:="+Integer.toBinaryString(num1));
    }
    
}
