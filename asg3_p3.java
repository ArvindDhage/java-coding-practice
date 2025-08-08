//Area Of Triangle

import java.util.Scanner;
public class asg3_p3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double area;
        System.out.println("Enter a Hight");
        int h=sc.nextInt();
        System.out.println("Enter a base ");
        int b=sc.nextInt();
        area=(h*b)/2;
        System.out.println("Area of Triangle  is "+area);
        
    }
    
}


