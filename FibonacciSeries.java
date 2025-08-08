import java.util.Scanner;
public class FibonacciSeries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        int a =0;  //fix numbr 
        int b=1;   //fix number

        System.out.println("Fibonacci Series:");

        for(int i=0;i<num;i++){
            System.out.print(a+ "");

            int next=a+b; // find the next number 
            a=b;          //update a past number 
            b=next;       //currunt number update 


        }
    }
}

            
        

    


