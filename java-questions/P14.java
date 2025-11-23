//Problem 14 : Volume of cone
import java.util.Scanner;
public class P14 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Radius :");
    double r=sc.nextDouble();
    System.out.print("Enter the hight :");
    double h=sc.nextDouble();
    double v=(1.0/3.0)*Math.PI*r*r*h;
    System.out.print("Volum of cone is :"+v);
}
}
