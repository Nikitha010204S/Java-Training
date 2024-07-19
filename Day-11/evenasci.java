//print even asci value character in the sentence
import java.util.Scanner;
public class evenasci {
    public static void iseven(String str){
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if((int)str.charAt(i)%2==0)
            {
                System.out.print(arr[i]);
            }
        }
        
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        iseven(str);
    }
}
