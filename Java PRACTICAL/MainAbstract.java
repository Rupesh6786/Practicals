abstract class Programming{
    Programming(){
        System.out.println("Best Programming language Java ");
    }
    public abstract void Developer();
    public abstract void Best();
}
 abstract class Java1 extends Programming{
    public void Developer(){
        System.out.println("James Gosling..!!");
    }

}
class Java extends Java1 {
    public void Best(){
        System.out.println("java is beat");
    }
}
public class MainAbstract {
    public static void main(String[] args) {
        Java j=new Java();
        j.Developer();
        j.Best();
    }
    
}
