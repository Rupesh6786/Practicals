class Const{
    String Dept;
    String Course;
    public Const(){
        System.out.println("This is default constructor");
    }
    public Const(String dep,String sub){
        System.out.println("This is Parameter constructor");
        Dept=dep;
        Course=sub;
    }
    public Const(Const c){
        System.out.println("This is Copy constructor");
        Dept=c.Dept;
        Course=c.Course;
    }
    public String toString(){
        return "Deptartment Name="+Dept+" / Course Name="+Course;
    }
    void display(){
        System.out.println("Depertment="+Dept+" Course="+Course);
    }

}

public class Copy {
    public static void main(String[] args) {
        Const c1=new Const("DS","Data Science");
        c1.display();
        c1.Dept="IT";
        c1.Course="Core java";
        Const c2=new Const(c1);
        System.out.println(c2);
    }
    
}
