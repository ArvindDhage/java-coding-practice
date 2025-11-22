//Problem 8: Perametr of circle 
import java.util.Scanner;
public class P8 {
  public static void main(String args[]){
     Scanner sc=new Scanner (System.in);
     final float pi=3.14f;
     System.out.print("Enter the radius of circle");
     double r=sc.nextDouble();
     double parameter=2*pi*r;
     System.out.println("Perametr of circle is :"+parameter);
}
    
}
