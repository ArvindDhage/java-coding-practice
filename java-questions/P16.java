import java.util.Scanner;
class Student{
    String name;
    int roll;
    void accept(Scanner in){
        System.out.println("Enter the name of Student");
        name= in.next();
        System.out.println("Enter the Roll no of Student");
        roll= in.nextInt();
    }

}

class Info{
    void display(Student s){
        System.out.println("Enter the name of Student" +s.name);
        System.out.println("Enter the Roll of Student"+s.roll);

    }
} 
public class P16 {
    public static void main(String args[]){
     Scanner in=new Scanner(System.in);
        Student s=new Student();
        Info i=new Info();
        s.accept(in);
        i.display(s);    
}
}
