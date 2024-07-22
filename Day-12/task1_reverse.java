//aabbcc
//2a2b2c


import java.util.Scanner;
public class task1_reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] c=str.toCharArray();
        int n=c.length;
        int count=1;
        char ch=str.charAt(0);
        String result="";
        for(int i=1;i<n;i++){
            if(str.charAt(i)==ch)
            {
                count++;
            }
            else{
                result+=count+""+ch;
                count=1;
                ch=str.charAt(i);
            }
        }
        result+=count+""+ch;
        System.out.println(result);
    }
}
