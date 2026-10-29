class Student{        //super class
    int roll,marks;
    String name;
    void input(){
        System.out.println("Enter Details");
    }
}

public class Simple extends Student{ //sub class
    
    void disp(){
    roll=143;
    name="khan";
    marks=89;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Simple s=new Simple();
        s.input();
        s.disp();
    }

    
}
