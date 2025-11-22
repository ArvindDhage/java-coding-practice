//Problem 4:Area of Parallelogram
import java.util.Scanner;
public class P4 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter a base of Parallelogram :");
         double base=sc.nextDouble();
         System.out.print("Enter a hight of parallelogram:");
         double hight=sc.nextDouble();
         double area=base*hight;
         System.out.println("Area of parallelogram is :"+area);

}
}