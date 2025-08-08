// Write a program to input Principle,time ,rate (PTR) from user and find Simple intrest .
import java .util.Scanner;
public class Asg1_P3 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Principal:");
        int p=sc.nextInt();
        System.out.print("Enter the time ");
        float t=sc.nextFloat();
        System.out.print("Enter the Rate :");
        float r=sc.nextFloat();
        float sp= (p*t*r)/100;
        System.out.println("Simple Intrest is "+sp);



    }
    
}
