abstract class Sample{
    public void display(){
        System.out.println("Hello from display method");  
    }
    abstract public void mymethod();
}
public class Abstract extends Sample{
    @Override
    public void mymethod(){
        System.out.println("Abstract method logic definition");
    }
    public static void main(String[] args) {
        Sample a=new Abstract();
        a.mymethod();
        a.display();
    }
    
}
