class Demo{
    int x;String y;
    Demo(){
        x=10;
        y="Learncoding";
        System.out.println(x+" "+y);
    }
    Demo(Demo obj){
      x=obj.x;
      y=obj.y;
      System.out.println(x+" "+y);
    }

}
public class Constcopy {
    public static void main(String[] args) {
        Demo r=new Demo();
        Demo r1=new Demo(r);
        System.out.println(r1);
    }
    
}
