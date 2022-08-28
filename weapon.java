/*

CODECHEF PROBLEM

Weapon Value
SC31
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class weapon
{
    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 0; j< t; j++){
            int n = sc.nextInt();
            String[] A = new String[n];
            for(int i = 0; i<n; i++){
                A[i] = sc.next();
            }
            int ct = 0;
            for(int i = 0; i<10; i++){
                int w = 0;
                for(int k = 0; k <n; k++){
                    w =w+ A[k].charAt(i);
                }
                if(w%2 != 0){
                    ct += 1;
                }
            }
            System.out.println(ct);
        }
    }
}
