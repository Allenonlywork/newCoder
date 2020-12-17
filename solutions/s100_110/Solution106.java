package com.solutions.s100_110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 字符逆序
 */
public class Solution106 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine().toString();
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
    }
}
