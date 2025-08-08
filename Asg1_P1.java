//Write a program to print Whether a number is even or odd ,also take input from user .
import java.util.Scanner;
public class Asg1_P1 {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+ "is Even Number");
        }
        else{
            System.out.println(num+ "is Odd Number");
        }

        sc.close();

    }
    
}
