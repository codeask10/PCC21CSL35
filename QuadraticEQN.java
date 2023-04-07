//1. Write a Java program that prints all real solutions to the quadratic equation ax2 +bx+c = 0. Read in a, b, c and use the quadratic formula.
import java.util.*;
import java.io.*;
public class QuadraticEQN{
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // value a, b, and c
                System.out.print("Enter the value of a: ");  
                double a = sc.nextDouble();  
                System.out.print("Enter the value of b: ");  
                double b = sc.nextDouble();  
                System.out.print("Enter the value of c: "); 
                double c = sc.nextDouble();
                double root1, root2;
                // calculate the determinant (b2 - 4ac)
                double determinant = b * b - 4 * a * c;
                // check if determinant is greater than 0
                if (determinant > 0) {
                // two real and distinct roots
                        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                        System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
                }
                // check if determinant is equal to 0
                else if (determinant == 0) {
                        // two real and equal roots
                        // determinant is equal to 0
                        // so -b + 0 == -b
                        root1 = root2 = -b / (2 * a);
                        System.out.format("root1 = root2 = %.2f", root1);
                }
                // if determinant is less than zero
                else {
                        // roots are complex number and distinct
                        double real = -b / (2 * a);
                        double imaginary = Math.sqrt(-determinant) / (2 * a);
                        System.out.format("root1 = %.2f+%.2fi", real, imaginary);
                        System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
                }
        }
}
/*
Output1
Enter the value of a: 1
Enter the value of b: 5
Enter the value of c: 2
root1 = -0.44 and root2 = -4.56

Output 2
Enter the value of a: 7
Enter the value of b: 7
Enter the value of c: 7
root1 = -0.50+0.87i
root2 = -0.50-0.87i

Output 3
Enter the value of a: 5
Enter the value of b: 10
Enter the value of c: 5
root1 = root2 = -1.00 **/

