public class Q1 {
    public static void main(String[] args) {
        
        double num1 = 7;
        double num2 = 3;
        char operator = '+';
        String again = "y"; 
        
         while (again.equals("y")){
            double result = 0; 
            boolean performed = true;
            
            if (operator == '+') {
                
                result = num1 + num2;
                
            }     
            else if (operator == '-') {
                result = num1 - num2;
            } 
            else if (operator == '*') {
                result = num1 * num2;
            } 
            else if (operator == '/') {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    performed = false;      
                } else {
                    result = num1 / num2;
                }
            }
            if (performed) {
                System.out.println("Result: " + result);
            }
            again = "n";
        }

        System.out.println("Thank you for using the calculator.");
        
    }
}
