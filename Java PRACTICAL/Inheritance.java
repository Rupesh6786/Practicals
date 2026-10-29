class Self{
    void display(){
        System.out.println("This is Base class");
    }
public class Inheritance extends Self 
{
void display(){
    System.out.println("This is Derive class");
}
    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        obj.display();
       // Self n=new Self();
        //n.display();
    }
}