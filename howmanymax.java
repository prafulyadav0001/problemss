import java.util.Scanner;
import java.lang.*;
import java.util.*;
import java.io.*;
public class howmanymax{
    public static void main(String[] args)throws java.lang.Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int number=in.nextInt();
            String string=in.next();
            int counter=0;
            for (int i=0; i<number-2;i++){
                if (string.charAt(i)=='1' && string.charAt(i+1)=='0')
                    counter++;
                }
                counter++;
                System.out.println(counter);

        }
    }
}