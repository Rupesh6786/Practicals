class Area{
    int x,y,z;
    double m,n,r;
    float a=3.14f;
    int area(int x){
        return (x*x);
    }
    int area(int x,int y){
        return x*y;
    }
    double area(double m,double n){
        return  (m*n)/2;
    }
    double area(double r){
        return (a*r*r);

    }
}

public class MethodOverload {
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("Area of Square="+a.area(5));
        System.out.println("Area of rectangle="+a.area(5,2));
        System.out.println("Area of Triangle="+a.area(2.2,5));
        System.out.println("Area of Circle="+a.area(3.2));
    }
}
