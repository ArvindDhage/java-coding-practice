
//Question 1
//Write a program to sum three numbers in Java.
/*public class Chapter_1_Practice_Set {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
}*/

//Question 2
//Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
/*import java.util.Scanner;
public class Chapter_1_Practice_Set {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter his/her name:");
        String name=sc.nextLine();
        System.out.println("Enter the greets:");
        String s11=sc.nextLine();
        System.out.println(s11+" "+name+",have a good day");
    }
}*/



//Question 3
//Write a Java program to convert Kilometers to miles.
/*import java.util.Scanner;
public class Chapter_1_Practice_Set {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the kilometers :");
        int kil=sc.nextInt();
        float miles=kil*0.621371f;
        System.out.println(kil+"Kilometers are convert into a miles is :"+miles);
    }
}*/

//Question 4

//Write a Java program to detect whether a number entered by the user is an integer or not.
import java.util.Scanner;
public class Chapter_1_Practice_Set {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        boolean result=sc.hasNextInt();
        System.out.println(result);
    }
}





