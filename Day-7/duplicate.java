/*Chimku is studying 8th standard in a school and she want to find whether her friends name contains duplicate character or not.
 Chimku felt it is difficult to find manually, so help him with a java program to find whether her friends name contains duplicate 
 character or not. A name(only lower case letters) should be given as input to the program and you need to print YES if the name contains 
 duplicate character otherwise print NO (if the name does not  contain duplicate character). */
 import java.util.Scanner;
public class duplicate {
    public static boolean isduplicate(String str){
       char[] arr=str.toCharArray();
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                return true;
            }
            
        }
       
       }
       return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next().toLowerCase();
        boolean res=isduplicate(str);
        if(res){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}
