package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 计算字符个数
 */
public class Solution2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int n = 0;
        for(int i = 0;i<c1.length;i++){
            if(c1[i] == c2[0]){
                n+=1;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
