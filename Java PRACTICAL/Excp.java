public class Excp {
    public static void main(String[] args) {
        int a = 10, b = 0, c;
        String str = "gulam";
        try {
             
             c = a / b;
            System.out.println("Result=" + c);
        }
        catch(ArithmeticException e) {
                System.out.println("zero can't divisible");
            }
            
            try{
               int x = Integer.parseInt(str);
                System.out.println(x);
            }
        
        catch(NumberFormatException z) {
            System.out.println(z);
        }

        finally {
            System.out.println("Finaly block always executed");
        }
    }
}
