/*
Author: Mina Awad
Date: January 24 2022
Assignment Number: 1
A program to take a four-digit number from input and print it in reverse order
*/
package question1;

/**
 *
 * @author minaawad this is text
 */
public class Question1 
{

   
    public static void main(String[] args)
    {
        
        int n = 1;
        int primeCheck;
        int counter;

        while (n <= 10000) 
        {
            counter = 0;
            primeCheck = 2;
            
            while (primeCheck <= n / 2) 
            {
                if (n % primeCheck == 0) 
                {
                    counter++;
                    break;
                }
                primeCheck++;
            }
            if (counter == 0) 
            {
                System.out.print(n + " ");
            }
            n++;
        }     
    }
}
