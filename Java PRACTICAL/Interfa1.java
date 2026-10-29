import java.util.Scanner;
interface client
{
void input();   //by default
void output();  //public + abstract
}
class Raju implements client{
    String name; double salary;
    @Override
    public void input(){
        Scanner r=new Scanner(System.in);
        System.out.println("Enter Username");
        name=r.nextLine();
        System.out.println("Enter user Salary");
        salary=r.nextDouble();
    }
    @Override
    public void output(){
        System.out.println(name+" "+salary);
    }


}
public class Interfa1 {
    public static void main(String[] args) {
        Raju s=new Raju();
        s.input();
        s.output();
    }
    
}
