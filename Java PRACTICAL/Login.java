import java.util.Scanner;
class AuthenticationException extends Exception {
    AuthenticationException(String m) {
        super(m);
    }
}

public class Login {
    public static void main(String[] args) {
        
    try
    {  String us1, us = "Tcsc";
       String ps1, ps = "7991317";
       Scanner s = new Scanner(System.in);
        System.out.println("Enter the Username:");
        us1 = s.nextLine();
        System.out.println("Enter the pass:");
        ps1 = s.nextLine();
        if (us1.equalsIgnoreCase(us) && ps1.equals(ps)) {
            System.out.println("Access Granted");
        } else {
            throw new AuthenticationException("AcccessDenied\nPlease enter valid username or password");
        }
    }catch(AuthenticationException e)
    {
        System.out.println(e);
    }
}
}

