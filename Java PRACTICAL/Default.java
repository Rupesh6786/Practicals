class Constructor {
    int price; String name;
    /*default constructot intialize value and statement
    */

    public Constructor(){  
        price=200;          
        name="chicken";
        System.out.println("Hello Constructor");
    }
    void display(){
        System.out.println("Display: "+price+"kg "+name);
    }
}
public class Default {
    public static void main(String[] args){
        Constructor c=new Constructor(); //Automaticaly constructor invoked
        c.display();
    }
}
