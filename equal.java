import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-- >0){
            int a=in.nextInt();
            int b= in.nextInt();
            a=a-b;
            if (a%2==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
