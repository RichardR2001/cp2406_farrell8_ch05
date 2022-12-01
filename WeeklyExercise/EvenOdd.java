// EvenOdd.java

import java.util.Scanner;

class EvenOdd
{
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            int userNumber;
            System.out.print("Enter an integer: ");
            userNumber = input.nextInt();
            if(checkResult(userNumber))                     // if result is true
                System.out.println(userNumber + " is even");
            else                                            // if result is false
                System.out.println(userNumber + " is odd");
        }
        public static boolean checkResult(int userNumber)
        {
            boolean result;
            if (userNumber % 2 == 1)
                result = false;     // false means the integer when divided by 2 will have a remainder of 1
            else
            {
                result = true;      // true means the integer will have no remainder when divided by 2
            }
            return result;          // return the result back to the main function
        }
}
