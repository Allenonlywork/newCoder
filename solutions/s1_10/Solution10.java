package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 字符个数统计
 */
public class Solution10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[128];
        //不同的字符总个数
        int sum = 0;
        for(int i =0;i<s.length();i++){
            //在0-127之间的字符
            if(s.charAt(i) -127 < 0 && s.charAt(i) > 0){
                //统计不同的个数
                if(arr[s.charAt(i)] == 0){
                    sum++;
                    arr[s.charAt(i)]++;
                }
            }
        }
        System.out.println(sum);
    }
}
