/*Process Two Words
You are provided a string of words and a 2-digit number. The two digits of the number represent the two words that are to be processed.
For example, If the string is "Today is a Nice Day" and the 2-digt number is 41, then you are expected to process the 4th word("Nice") 
and the 1st word("Today").
The processing of each word is to be done as follows-
Extract the Middle-to-Begin part: Starting from the middle of the word, extract the characters till the beginning of the word.
Extract the Middle-to-End part: Starting from the middle of the word, extract the characters till the end of the word.
If the word to be processed is "Nice"
Its middle to begin part will be "iN"
Its middle to end part will be "ce"
So, merged together these two parts would form "iNce"
Similarly, if the word to be processes is "Today"
Its middle to begin part will be "doT"
Its middle to end part will be "day"
So, merged together these two parts would form "doTday"
Note: Note that the middle letter ‘d’ is part of both the extracted parts. So, for words whose length is odd, the middle letter should be
 included in both the extracted parts.
Expected output: The expected output is a string containing both the processed words separated by a space "iNce doTday"
Example1:
Input:
Today is a Nice Day 
41
Output
iNce doTday
Note:

1. The input string will contain only alphabets and a single space character separating each word in the string
2. The input string will NOT contain any other special character
3. The input number will always be a 2 digit number (>=11 and <=99). One of its digits will never be 0. Both the digits of the number
 will always point to a valid word in the input string.
TestCase 1
Command Line Input
Runtime Line Input
Today is a Nice Day
41
Output
iNce doTday 

Fruits like Mango and Apple are common but Grapes are rare
39
Output
naMngo arGpes*/
import java.util.Scanner;
public class process_two_words {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String num=s.nextLine();
        String[] str_arr=str.split(" ");
        int first=Character.getNumericValue(num.charAt(0));
        int last=Character.getNumericValue(num.charAt(1));
      
        for(int i=0;i<=str_arr.length;i++){
            if(i==(first-1)){
               isprocess(str_arr[i]);
            }

            if(i==(last-1)){
                isprocess(str_arr[i]);
            }
        }
    }
    public static void isprocess(String word) {
        int middle = word.length() / 2;
        for (int i = middle-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        for (int i = middle; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.print(" ");
    }
}