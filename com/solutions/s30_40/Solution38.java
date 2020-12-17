package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 假设一个球从任意高度自由落下，每次落地后反跳回原高度的一半;
 * 再落下, 求它在第5次落地时，共经历多少米?第5次反弹多高？
 *
 * 最后的误差判断是小数点6位
 */
public class Solution38 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            double n = Double.parseDouble(str);
            double sum = n;
            double temp = n / 2;
            for(int i = 1;i < 5;i ++){
                sum += temp * 2;
                temp = temp / 2;
            }
            System.out.println(sum);
            System.out.println(temp);
        }
    }
}
