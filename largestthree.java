package conditionalstatement;

public class largestthree {
    public static void main(String[] args) {
        int a=50,b=1,c=42;
        if(a>b) {
            if(a>c) {
                System.out.println("a is largest");
            }
            else {
                System.out.println("c is largest");
            }
        }
        else if(b>c) {
            if(b>a) {
                System.out.println("b is largest");
            }
            else {
                System.out.println("a is largest");
            }
        }
        else {
            System.out.println("c is largest");
        }
    }
}
