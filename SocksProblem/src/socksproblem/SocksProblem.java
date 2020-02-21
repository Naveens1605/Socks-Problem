package socksproblem;
import java.util.Scanner;
public class SocksProblem {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int freq[]= new int[101];
        for(int i=0;i<n;i++){
            int c = in.nextInt();
            freq[c]++;
        }
        int res=0;
        for(int i=0;i<=100;i++){
            res += freq[i]/2;
        }
        System.out.println(res);        
    }
}
