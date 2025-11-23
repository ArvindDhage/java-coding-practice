// Problem 11 : Perimeter of Rectangle
import java.util.Scanner;
public class P11 {
     public static void main(String args[]){
     Scanner sc=new Scanner (System.in);
     System.out.print("Enter a Length of rectangle :");
     double l=sc.nextDouble();
     System.out.print("Enter a Width of the rectangle :");
     double w=sc.nextDouble();
     double p = 2*(l+w);
     System.out.print("perimeter of rectangle is :"+p);
    
}
}
