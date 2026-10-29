public class This {
    int a;
     This(){
        this(100); //parameter constructor call
        System.out.println("Coding");
     }
     This(int a){
        //this();  //Default Constructor call
        System.out.println(a);
     }
    /* This(int a){
        this.a=a;  //instance and local variable same use this keyword
        System.out.println(a);
    }
    void show(){
        System.out.println(this);  //this current object refer use in method and constructor
        System.out.println(a);
    }*/
    public static void main(String[] args) {
        This r1=new This();  //call parameter
        //This r=new This(10); //call default
       // System.out.println(r); //this and obj same reference id
       // r.show();
    }
}
