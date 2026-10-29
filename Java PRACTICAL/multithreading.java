// Multithreading Demo-Creating Threads By extending Thread Class
class Multithreading extends Thread{  

    public void run(){  
        System.out.println("My thread is in running state.");  //This is the Running State
    }   

    public static void main(String args[]){  
        Multithreading obj=new Multithreading(); //Thread Created  -->  Goes to New State
        obj.start();  //start will invoke run method - Runnable state
        obj.run();
    }  
}