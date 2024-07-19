//upper-lower(vice verse)
import java.util.Scanner;
public class task1_Upper_to_lower {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)>=65 && (int)str.charAt(i)<=90){
                System.out.print(Character.toLowerCase(arr[i]));
            }
            else{
                System.out.print(Character.toUpperCase(arr[i]));
            }
        }
    }
}
