public class Excep {
    public static void main(String[] args) {
        int a=10,b=5,c=5,x;
        float y;
        try{
            x=a/(b-c);
            System.out.println("Result x="+x);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divisiable by zero");
            System.out.println(e);
        }
        y=a/(b+c);
        System.out.println("Result y="+y);
    }
    
}
