//2a2b2c
//aabbcc
import java.util.Scanner;
public class task1_expand {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char[] c=str.toCharArray();
        int l=c.length;
        int q=0,q1=0;
        int a[]=new int[c.length];
        String[] b=new String[c.length];
        for(int i=0;i<c.length;i++)
        {
            if(Character.isDigit(c[i])) 
            {
                a[q++]=Character.getNumericValue(c[i]);
            }
            if(!Character.isDigit(c[i])) 
            {
               
                b[q1++]=Character.toString(c[i]);
            }
        }

        for(int i=0;i<l;i++)
        {
            for(int j=0;j<a[i];j++)
            {
                System.out.print(b[i]);
            }
        }
    }
}
