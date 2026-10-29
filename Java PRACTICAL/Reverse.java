import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        //System.out.println("Reverse="+rev);
        if(str.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}
