 class A{
    A(int a){
        System.out.println("hello Eyeryone:"+a);

    }
    
}
class B extends A{
    B(){
        super(10);
        System.out.println("Good Morning");
    }
}

class TestSuper{
    public static void main(String[] args) {
        B n=new B();
    }
}
