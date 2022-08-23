import java.util.Scanner;

public class CANDYDIST {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        while (t-- >0) {
            int n = in.nextInt();
            int m = in.nextInt();
            if (n%m==0){
                n=n/m;
                if (n%2==0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
