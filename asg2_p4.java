/* Take a two number from the user  as a input  and find the HCF and LCM  */
import java .util.Scanner;
public class asg2_p4 {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a two number :");
        int a=in.nextInt();
        int b=in.nextInt();

         int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
         // Step 3: Find LCM using formula
        int lcm = (a * b) / hcf;

        // Step 4: Display results
        System.out.println("HCF of " + a + " and " + b + " is: " + hcf);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}

    
    

