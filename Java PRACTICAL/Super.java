class test{
    int a=10;

}
class B extends test{
    int a=20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class Super{
    public static void main(String[] args) {
         B s=new B();
         s.show();
    }
   
    
}
