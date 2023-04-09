//3 (A). Write a program to check prime number.

import java.util.Scanner;
public class PrimeNumber {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();
        int flag=0;
        // 0 and 1 are not prime numbers
        // change flag to 1 for non-prime number
        if (n == 0 || n == 1){
          flag = 1;
        }
        for (int i = 2; i <= n / 2; ++i) {
                // if n is divisible by i, then n is not prime
                // change flag to 1 for non-prime number
                if (n % i == 0) {
                        flag = 1;
                        break;
                }
        }
        // flag is 0 for prime numbers
        if (flag == 0)
                System.out.println(n+ " is a prime number.");
        else
                System.out.println(n+ " is not a prime number.");
        }
}
/*
Output
enter the number 
1
1 is not a prime number.

enter the number 
29
29 is a prime number.

enter the number 
33
33 is not a prime number.*/

