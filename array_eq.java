
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            HashMap<Integer,Integer> map=new HashMap<>();

            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i]))
                    map.put(arr[i],map.get(arr[i])+1);
                else
                    map.put(arr[i],1);
            }


            int max=0;
            for(int k:map.keySet()){
                if(max<map.get(k))
                    max=map.get(k);
            }


            if(max>(n+1)/2)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}