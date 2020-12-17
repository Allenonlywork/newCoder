package com.solutions.s10_20;

import java.util.Scanner;

/**
 * 数字颠倒
 */
public class Solution11 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(reverse(n));

    }
    private static String reverse(int n){
        String str = String.valueOf(n);
        StringBuffer sb = new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
