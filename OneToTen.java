package forloops;

import java.util.*;
public class OneToTen{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int from=sc.nextInt();
        int upto=sc.nextInt();
       
        while(from<=upto){
            System.out.println(from);
            from++;
        }
    }
}