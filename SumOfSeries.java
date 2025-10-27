package forloops;

import java.util.*;
public class SumOfSeries{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int i=1;

        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        
    }
}