/*Take a input of a salary .If salary if greter then 10000 and bonus as 2000 , Otherwise  add as 100 */
import java .util.Scanner;
public class asg2_p2 {
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your Salary");
    int salary=sc.nextInt();
    if(salary>=10000){
        System.out.println("Your Bonus 2000 your totel salary of this month is "+(salary+2000));
    }
    else{
        System.out.println("Your bonus is 1000 your toatal salary of this month is  "+(salary+1000));
    }
    }

    
}
