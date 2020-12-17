package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 自守数
 *
 * 指一个数的平方的尾数等于该数自身的自然数。
 * 例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出n以内的自守数的个数
 */
public class Solution99 {
    public static int CalcAutomorphicNumbers( int n)
    {
        long ans=0;
        int count=0;
        for(int i=1; i<=n;i++){
            if(i%10==1||i%10==5||i%10==6){
                ans=i*i;
                int  fnum=i;
                int  wnum=0;
                long temp=0;
                while(fnum!=0){
                    fnum/=10;
                    wnum++;
                }
                temp=ans%(long)Math.pow(10,wnum);
                if(temp == i){
                    count++;
                }
            }
        }
        count++;
        return count;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bre=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=bre.readLine())!=null){
            int num1=Integer.parseInt(str);
            System.out.println( CalcAutomorphicNumbers(num1));
        }
    }

}
