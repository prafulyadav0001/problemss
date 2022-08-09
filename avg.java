import java.util.Arrays;
import java.util.Scanner;

public class avg{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int T = input.nextInt();
        for (int i=0;i<T;i++){
            int n= input.nextInt();
            int k=input.nextInt();
            int v= input.nextInt();
            int[] list = new int[n];
            for (int j = 0; j < n; j++)
                list[j] = input.nextInt();
            int org_sum = (n + k) * v;
            int sum = Arrays.stream(list).sum();
            int c=org_sum-sum;
         if (c<0)
             System.out.println(-1);

        else if (c%k==0)
             System.out.println(c/k);

         else
             System.out.println(-1);
        }
    }
}