/*Single-digit “Reduced Subtracted Form”
Given a number, you are expected to find its single-digit “Reduced Subtracted Form(RSF)”.
The “Reduced Subtracted Form(RSF)” of a number can be found by concatenating the difference between its adjacent digits.
To find the single-digit “Reduced Subtracted Form(RSF)”, we need to continue this process till the resultant RSF is not a single-digit number.
Example:
Input: 6928
Its RSF can be found by concatenating the difference between (6 and 9), (9 and 2) and (2 and 8) as shown below
Difference between 6 and 9 is 
Difference between 9 and 2 is 7
Difference between 2 and 8 is 6
So, the RSF of 6928=376
The result 376 is not a single-digit number, so we must continue finding its RSF.
Difference between 3 and 7 is 4
Difference between 7 and 6 is 1
So, the RSF of 376=41
The result 41 is not a single-digit number, so we must continue finding its RSF.
Difference between 4 and 1 is 3
The resultant RSF(3) is a single-digit number, so we have reached the single-digit RSF.
Therefore, the single-digit RSF of 6928=3
Output:3
Note1: Input will always be >=10

Note2: Note that while concatenating the differences, we are expected to use the absolute values(non-negative)

Note3: The input values for all test cases in this program have been designed such that their single-digit RSF will definitely result in a single-digit number. */
import java.util.Scanner;
public class single_digit {
    public static int issingle(int num)
    {
        int index=0;
        int[] arr=new int[4];
        while(num>0)
        {
            int digit=num%10;
            num=num/10;
            arr[index++]+=digit;
        }
        for(int i=arr.length;i>-0;i--){
         System.out.println(arr[i]);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
    
    }
}
