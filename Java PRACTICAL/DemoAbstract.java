abstract class Animal{
    Animal(){
        System.out.println("All Animals..!!");
    }
   /*  void show(){
        System.out.println("Animals...!!");
    }*/
    public abstract void sound();
}
class Dog extends Animal{
    Dog(){
        super();  //abstract class default constructor call
    }
    public void sound(){
        System.out.println("Dog is Barking");
    }
}
class Lion extends Animal{
    public void sound(){
        System.out.println("Lion is Roar");
    }
}
public class DemoAbstract {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        Lion l=new Lion();
        l.sound();
        
    }
    
}
