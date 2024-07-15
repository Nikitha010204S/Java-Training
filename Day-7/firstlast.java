/*Ruba having set of strings and he need to see only the first and last letter in each string. So write a program to help 
her to find first and last character in the string.

Input format:
 First line contains a number N and next N line contains strings.

Output format:
N lines contains first and last character of the given strings.*/

import java.util.Scanner;
class firstlast{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            String str=s.nextLine();
            if(str.length()>3){
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            System.out.println("Result:"+first+""+last);
            }
        }
    }
}