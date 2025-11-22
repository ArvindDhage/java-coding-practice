//Problem 1:Area of circle in java programming 

import java.util.Scanner;

public class P1 {

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radious of circele");
        float r=sc.nextFloat();
        float area;
        float pi=3.14f;
        area=pi*r*r;
        System.out.println("Area of circe is "+area);

        

        
    }
}

