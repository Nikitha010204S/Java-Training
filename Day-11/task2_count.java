import java.util.Scanner;
public class task2_count {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count_upper=0,count_lower=0,count_digit=0,count_special=0,count_vowel=0,count_space=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                count_upper++;
            }
            else if((int)str.charAt(i)>=97 && (int)str.charAt(i)<=122)
            {
                count_lower++;
            }
            else if((int)str.charAt(i)>=48 && (int)str.charAt(i)<=57)
                {
                    count_digit++;
                }
            else if(Character.isWhitespace(arr[i])){
                count_space++;
            }
            else
              {
                      count_special++;
            }
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' ||
             str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
            {
                count_vowel++;
            }

    }
    System.out.println("Uppercase:"+count_upper);
    System.out.println("Lowercase:"+count_lower);
    System.out.println("Digits:"+count_digit);
    System.out.println("Special character:"+count_special);
    System.out.println("Space:"+count_space);
    System.out.println("Vowels:"+count_vowel);
}
}


