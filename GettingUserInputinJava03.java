
import java.util.Scanner;
public class GettingUserInputinJava03 {
    public static void main(String[] args){
        System.out.println("Taking the input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the number 1:");
        int a=sc.nextInt();
        System.out.println("Enter the number 2 :");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Sum of two number is "+c);


    }
}
