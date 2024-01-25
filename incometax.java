package conditionalstatement;

import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("enter income");
        int income=r.nextInt();
        int tax;
        if(income<500000) {
            tax=0;
            System.out.println("income tax is : " + tax);
        }
        else if(income>500000 && income <1000000) {
            tax=(int)(income*0.2);
            System.out.println("income tax is : " + tax);
        }
        else {
            tax=(int)(income*0.3);
            System.out.println("income tax is : " + tax);
        }
        r.close();

    }
}
