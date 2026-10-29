
public class PrivateDefault{
    int a; String b;
   private PrivateDefault(){  //private constructor only inside a class invoked
        a=20;
        b="kkkk";
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        PrivateDefault s=n=new PrivateDefault();
       // n.display();
        //System.out.println("a="+a);
    }
    
}
