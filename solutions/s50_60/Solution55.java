package com.solutions.s50_60;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 输出7有关数字的个数，包括7的倍数，还有包含7的数字（如17，27，37...70，71，72，73...）的个数
 *
 * 输入描述:
 * 一个正整数N。(N不大于30000)
 *
 * 输出描述:
 * 不大于N的与7有关的数字个数，例如输入20，与7有关的数字包括7,14,17.
 */
public class Solution55 {
    public static void main(String[] args)throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while((str=br.readLine())!=null){
            int N = Integer.parseInt(str);
            int count = 0;
            for(int i = 7; i <= N; i++){
                if(i % 7 == 0)
                    count++;
                else if(hasSeven(i))
                    count++;
            }
            System.out.println(count);
        }
    }
    static boolean hasSeven(int i){
        if(i % 10 == 7)
            return true;
        else if(i/10 >= 7)
            return hasSeven(i/10);
        else return false;
    }
}
