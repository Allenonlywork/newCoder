package com.solutions.s100_110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 记负均正
 * 从输入任意个整型数，统计其中的负数个数并求所有非负数的平均值
 */
public class Solution105 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine()) != null){
            int count  = 0;
            int count1 = 0;
            double sum = 0;
            String[] ss = line.split(" ");
            for(String s:ss){
                int n = Integer.valueOf(s);
                if(n < 0){
                    count++;
                }else if(n > 0){
                    sum += n;
                    count1++;
                }
            }
            System.out.println(count);
            sum = sum / count1;
            String[] str = (sum + "").split("\\.");
            if(str[1].length() >= 2 && (str[1].charAt(1) - '0') >= 5){
                System.out.println(str[0] + "." + (1 + (str[1].charAt(0) - '0')));
            }else{
                System.out.println(str[0] + "." + str[1].substring(0,1));
            }
        }
    }
}
