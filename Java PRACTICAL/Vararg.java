//Var-arg method

class A {
     void add(int ... a){  //a is array variable (this is var-arg method)
        int sum=0;
        for(int x:a){
            sum=sum+x;
        }
        System.out.println("Sum of Numbers:"+sum);
     }
}
public class Vararg {
    public static void main(String[] args){
        A b = new A();
        b.add();
        b.add(10);
        b.add(10,20);
        b.add(10,20,30);
        b.add(10,20,30,40);
    }
    
}
