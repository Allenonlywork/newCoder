package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 查找输入整数 二进制 1 的个数
 */
public class Solution62 {
    public static int findNumberOf1( int num)
    {
        int count=0;
        while (num!=0) {
            num=num&(num-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) throws Exception  {
        BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        while((str=bfr.readLine())!=null){
            int num =Integer.parseInt(str);
            System.out.println(findNumberOf1(num));
        }



    }
}
