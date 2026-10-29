class Demo{
    String name,Surname;
    Demo(String a,String b){
        name=a;
        Surname=b;
       //System.out.println(a+" " +b);
    }
    Demo(int a,String b){
        System.out.println(a+" " +b);
    }
    void show(){
        System.out.println(name+" "+Surname);
    }
}
public class Parameter {
    public static void main(String[] args) {
        Demo r=new Demo("Gulam", "Khan");
        r.show();
        Demo o=new Demo(22, "gulam");
        o.show();
    }
    
    
}
