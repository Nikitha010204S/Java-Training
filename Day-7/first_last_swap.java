/*	
 Given a string, return a new string where the first and last chars have been exchanged.
TEST CASES:
INPUT1: Java
OUTPUT1: aavJ */
import java.util.Scanner;
public class first_last_swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch=str.charAt(0);
        char ch1=str.charAt(str.length()-1);
        System.out.println(ch1+""+str.substring(1,str.length()-1)+""+ch);

    }
}
