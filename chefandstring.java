import java.util.Scanner;

public class chefandstring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t= in.nextInt();
        for (int i=0;i<t;i++){
            String s=in.next();
            if (s.length() ==1 || s.length() ==2){
                System.out.println("YES");
            }
            else { if (left(s).equals(right(s))){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            }
        }
    }
    public static String left(String str){
        return str.substring(1)+str.charAt(0);
    }
    public static String right(String str){
        int n=str.length();
        return str.charAt(n-1)+str.substring(0,n-1);
    }
}
