//Area Of Circle Java Program
import java.util.Scanner;
public class asg3_p1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        double pi=3.14 , area;
        System.out.print("Enter a  radius : ");
        int r=sc.nextInt();
        area=pi * r * r;
        System.out.println("Area of circle is "+area);

    }
    
}
