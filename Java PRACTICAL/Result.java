import java.util.Scanner;
interface Gross{
    int TA=1200;
    int DA=1500;
    void gross_Sal();
}
class Employee{
    String name;
    double bsal;
    Scanner b=new Scanner(System.in);
    void basic_sal(){
        System.out.println("Enter the employee Name:");
        name=b.nextLine();
        System.out.println("Enter the salary:");
        bsal=b.nextDouble();
    }
}


class Salary extends Employee implements Gross{
    double HRP;
    public void gross_Sal(){
        HRP=bsal+TA+DA;
    }
    void display(){
        System.out.println(name+" has "+HRP+" salary including "+TA+" as TA and "+DA+" as DA");
    }
}
public class Result{
        public static void main(String[] args) {
            Salary s=new Salary();
            s.basic_sal();
            s.gross_Sal();
            s.display();
        }
    }

    


