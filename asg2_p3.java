/*Input a number and print Wheather it is prime or not */
import java.util.Scanner;
public class asg2_p3 {
    public static void main(String[] args){
        Scanner in=new Scanner (System.in);
        int c=2;
        System.out.println("Enter a number : ");
        int num=in.nextInt();
        if(c<=num){
              if (num%2==0){
                System.out.println(num+"Given number is not prime ");
              }
        }
        else{
            System.out.println(num+"Given number is Prime ");
        }
    }
    
}
