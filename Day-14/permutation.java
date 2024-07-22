import java.util.Scanner;
public class permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        getpermutation(str,"");
        }

        public static void getpermutation(String str,String prefix)
        {
      if(str.length()==0){
        System.out.println(prefix);
      }
      else{
        for(int i=0;i<str.length();i++){
            String rem=str.substring(0,i)+str.substring(i+1);
            getpermutation(rem, prefix+str.charAt(i));
        }
      }
        }
    }

