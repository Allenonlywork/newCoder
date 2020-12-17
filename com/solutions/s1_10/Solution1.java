package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 字符串最后一个单词的长度
 */
public class Solution1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.lastIndexOf(' ');
        if(n == -1){
            System.out.println(str.length());
        }else{
            System.out.println(str.length() -n -1);
        }
        sc.close();
    }
}
