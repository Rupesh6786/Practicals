interface A {
    int a=4;  // public + static + final 
    void add(); // public + abstract
}
interface B extends A{
    void sub();   
}
class C implements B{
    int b=8;
    // a=5; can't be change because final value of interface
    @Override
    public void add(){
        System.out.println("Addition="+(a+b));
    }
    public void sub(){
        System.out.println("Subtraction="+(b-a));

    }


}
public class Interfra2 {
    public static void main(String[] args) {
        B c=new C();
        c.add();
        c.sub();
        A a=new C();
        a.add();
        System.out.println("a="+A.a); //static value a
       
    }
    
}
