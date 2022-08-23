import java.util.*;
import java.lang.*;
import java.io.*;
class easy_perm
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            for(int i=n;i>0;i--){
                System.out.print(i+" ");
            }
        }
    }
}