// Problem 2 :Area of Trangle 
 import java.util.Scanner;

public class P2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a base of trangle:");
        float base=sc.nextFloat();
        System.out.println("Enter the hight of trangle :");
        float hight=sc.nextFloat();
        float area = (1f/2f)*base*hight;
        System.out.println("Area of Trangle is :"+area);
        

    }
    
}
