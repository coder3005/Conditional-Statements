package conditionalstatement;

import java.util.*;

public class switchcalculator {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter a : ");
        int a=r.nextInt();
        System.out.println("enter b : ");
        int b=r.nextInt();
        System.out.println("enter operator : ");
        char operator=r.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default : System.out.println(a%b);
        }
        r.close();
    }
}
