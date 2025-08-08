import java.util.Scanner;
public class Exercise_1_CBSEBoardPercentageCalculator {
           public static void main(String[] args){
               Scanner sc=new Scanner(System.in);
               System.out.println("Sunject 1 :");
               int s1=sc.nextInt();
               System.out.println("Subject 2:");
               int s2=sc.nextInt();
               System.out.println("Subject 3 :");
               int s3=sc.nextInt();
               System.out.println("Subject 4:");
               int s4=sc.nextInt();
               System.out.println("Subject 5:");
               int s5=sc.nextInt();
               int sum=s1+s2+s3+s4+s5;
               float persantage =(sum/500f)*100f;
               System.out.println("Sum of all subject mark is :"+sum);
               System.out.println("Persantage of CBSC Board :"+persantage);
           }
}
