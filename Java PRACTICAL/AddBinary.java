import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a 1st Binary num:");
        String num1=s.nextLine();
        System.out.println("Enter a 2nd Binary num:");
        String num2=s.nextLine();
        int num3=Integer.parseInt(num1,2);
        int num4=Integer.parseInt(num2,2);
        int sum=num3+num4;
        System.out.println("Addition of Binary number:"+Integer.toBinaryString(sum));
    }
    
}
