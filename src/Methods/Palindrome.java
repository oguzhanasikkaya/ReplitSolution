package Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       // int num = scan.nextInt();
        int num =1001;
        isPalindrome(num);
    }

    public static void isPalindrome(int num){

        //WRITE YOUR CODE HERE
        int originalNum, reversedNum, remainder;

        originalNum=num;
        reversedNum=0;

        while (num != 0)
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
