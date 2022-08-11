import java.util.Scanner;
import java.lang.*;
public class broken_telephone {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int y = 0; y < t; y++) {
            int n = in.nextInt();
            int c = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (i > 0 && arr[i] != arr[i - 1]) {
                    c++;
                }
                else if (i < n - 1 && arr[i] != arr[i + 1]){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
