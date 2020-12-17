package com.solutions.s50_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 找出字符串中第一个只出现一次的字符
 */
public class Solution59 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str=br.readLine())!=null) {
            String s = "";
            char[] c = str.toCharArray();
            int num[] = new int[128];
            for(int i = 0;i<str.length();i++){
                num[str.charAt(i)]++;
            }
            for(int i = 0;i<str.length();i++){
                if(num[c[i]]==1){
                    System.out.println(c[i]);
                    break;
                }
                if(i==str.length()-1)
                    System.out.println(-1);
            }

        }
    }
}
