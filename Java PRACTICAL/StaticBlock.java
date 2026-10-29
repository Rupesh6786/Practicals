public class StaticBlock {
   static int a=10;int b=20;
    StaticBlock(){
        System.out.println("Please");  //Constructor
    }
    {
        System.out.println("help");  //Instance block use a object
        System.out.println(a+" "+b); //instance block both are access variable
    }
    static{  //bina object ke bina direct call hota h
        System.out.println("PLesae help"); 
        System.out.println(a); //only static varivale access
         //1st Static block call than Instance block
    }
    public static void main(String[] args) {
        StaticBlock r=new StaticBlock();
    }
    
}
