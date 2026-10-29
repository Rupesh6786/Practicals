import java.lang.Exception;
class Myexception extends Exception{
    Myexception(String message){
        super(message);
    }
}

public class TestException {
    public static void main(String[] args) {
        int x=5,y=1000;
        try{
            float z=(float)x/(float)y;
            if(z<0.01){
                throw new Myexception("Number is too small");
            }
            else{
                System.out.println("z="+z);
            }
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println( "Error!!! "+e.getMessage());
        }
    }

    
}
