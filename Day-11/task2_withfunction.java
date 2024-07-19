import java.util.Scanner;
public class task2_withfunction {
    
    public static int isUpper(String str)
    {
        int count_upper=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                count_upper+=1;
            }
        }
        return count_upper;
    }

    public static int isLower(String str)
    {
        int count_lower=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
            {
                count_lower+=1;
            }
        }
        return count_lower;
    }
    public static int isDigit(String str)
    {
        int count_digit=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
            {
                count_digit+=1;
            }
        }
        return count_digit;
    }
    public static int isSpace(String str)
    {
        int count_space=0;
        for(int i=0;i<str.length();i++){
            if(Character.isWhitespace(i))
            {
                count_space+=1;
            }
        }
        return count_space;
    }
    public static int isVowel(String str)
    {
        int count_vowel=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' ||
            str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                count_vowel+=1;
            }
        }
        return count_vowel;
    }
    
    public static int isSpecial(String str)
    {
        int count_special=0;
        for(int i=0;i<str.length();i++){
            if (!((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122) || 
            (str.charAt(i) >= 48 && str.charAt(i) <= 57) || Character.isWhitespace(str.charAt(i))))
            {
                count_special+=1;
            }
        }
        return count_special;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        int upper=isUpper(str);
        int lower=isLower(str);
        int digit=isDigit(str);
        int Space=isSpace(str);
        int vowel=isVowel(str);
        int special=isSpecial(str);
        System.out.println("Upper:"+upper);
        System.out.println("Lower:"+lower);
        System.out.println("Digit:"+digit);
        System.out.println("Space:"+Space);
        System.out.println("Vowel:"+vowel);
        System.out.println("Special:"+special);
    }
}
       