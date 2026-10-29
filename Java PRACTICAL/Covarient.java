 
 // Co-varient return type
 
 class A {
    A show(){  //return type class A
        System.out.println("Hello");
        return this;  //this--> new A()
    }
    
}
class B extends A{
    @Override     ////we can change  the return type of overriden method
    B show(){
        super.show();
        System.out.println("Good Afternoon");
        return this;  // this--> new B()
    }
}

public class Covarient{    
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }

}
