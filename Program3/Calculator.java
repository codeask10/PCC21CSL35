import java.util.Scanner;
public class Calculator {
        public static void main(String[] args) {
                char operator;
                Double number1, number2, result;
                // create an object of Scanner class
                Scanner sc = new Scanner(System.in);
                // ask users to enter numbers
                System.out.println("Enter first number");
                        number1 = sc.nextDouble();
                System.out.println("Enter second number");
                number2 = sc.nextDouble();
                // ask users to enter operator
                System.out.println("Enter + for addition\n- for subtraction\n* for multiplication\n/ for Divison\n ");
                operator = sc.next().charAt(0);
                switch (operator) {
                        // performs addition between numbers
                        case '+':result = number1 + number2;
                                System.out.println("Addition of two numbers are: " +result);
                                break;
                        // performs subtraction between numbers
                        case '-': result = number1 - number2;
                                  System.out.println("subtraction of two numbers are: " +result);
                                  break;
                        // performs multiplication between numbers
                        case '*': result = number1 * number2;
                                  System.out.println("Multiplication of two numbers are: " +result);
                                  break;
                        // performs division between numbers
                        case '/': if(number2==0){
                                        System.out.println("Number cannot be divide by zero");
                                  }
                                  else{
                                        result = number1 / number2;
                                        System.out.format("Divisons of two numbers are:  %.2f",result);
                                  }
                                break;
                        default: System.out.println("Invalid operator!");
                                 break;
                }
        }
}
/*
Output 
Enter first number
45
Enter second number
34
Enter + for addition
- for subtraction
* for multiplication
/ for Divison
 
+
Addition of two numbers 79.0

Enter first number
30
Enter second number
20
Enter + for addition
- for subtraction
* for multiplication
/ for Divison
 
-
subtraction of two numbers are: 10.0

Enter first number
15
Enter second number
3
Enter + for addition
- for subtraction
* for multiplication
/ for Divison
 
*
Multiplication of two numbers are: 45.0

Enter first number
113
Enter second number
4
Enter + for addition
- for subtraction
* for multiplication
/ for Divison
 
/
Divisons of two numbers are:  28.25


Enter first number
19
Enter second number
0
Enter + for addition
- for subtraction
* for multiplication
/ for Divison
 
/
Number cannot be divide by zero*/


