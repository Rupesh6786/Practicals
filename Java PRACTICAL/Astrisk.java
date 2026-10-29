public class Astrisk {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        while(i<=num){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
