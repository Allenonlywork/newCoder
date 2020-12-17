package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 16进制转换为10进制
 */
public class Solution5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String str = s.substring(2);
            System.out.println(Long.parseLong(str,16));
        }
        sc.close();
    }
}
