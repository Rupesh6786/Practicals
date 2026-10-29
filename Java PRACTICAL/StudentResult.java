import java.util.*;
interface Sport{
    int sport_wt=11;
    void put_wo();
}
class Student{
    int Roll_no;
    Scanner s=new Scanner(System.in);
    void get_no(){
        System.out.println("Enter the Roll no:");
        Roll_no=s.nextInt();
    }
    int put_no(){
        return Roll_no;
    }
}
class Test extends Student{
    int part1,part2;
    void getmarks(){
        System.out.println("Enter marks for part1:");
        part1=s.nextInt();
        System.out.println("Enter marks for part2:");
        part2=s.nextInt();
    }
    void putmarks(){
        System.out.println("Marks of part1 "+part1+" Marks of part2 "+part2);
    }
}

class Result extends Test implements Sport{
    int total;
    public void put_wo(){
        System.out.println("-----------Students Total Marks--------");
        System.out.println("Roll Number "+put_no());
        putmarks();
        System.out.println("Extra marks for sports are:"+sport_wt);
    }
    void display(){
        total=part1+part2+sport_wt;
        System.out.println("Total Marks="+total);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Result r=new Result();
        r.get_no();
        r.getmarks();
        r.put_wo();
        r.display();
    }
}
