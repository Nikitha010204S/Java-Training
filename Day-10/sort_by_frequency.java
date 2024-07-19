/*Sort Elements by Frequency
You are given an array. You have to sort the array elements in decreasing order of their frequency. Here frequency refers the number of occurrences of each number.
Input :
2 3 4 2 8 1 1 2
Output :
2 2 2 1 1 3 4 8 */



////BALANCE
import java.util.Scanner;
public class sort_by_frequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
            {
                int frequency=0;
                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j])
                    {
                            frequency+=1;
                            visited[j]=true;
                    }
                    
                }
                System.out.println(arr[i] + ":" + frequency);
               
            }


           
        }
        

        
    }
}
