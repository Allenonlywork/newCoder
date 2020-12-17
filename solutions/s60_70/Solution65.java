package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 查找两个字符串中的最长公共字串
 */
public class Solution65 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = reader.readLine()) != null) {
            String line2 = reader.readLine();
            if (line.length() >= line2.length()) {
                System.out.println(fun1(line, line2));
            } else {
                System.out.println(fun1(line2, line));
            }
        }
    }
    private static String fun1(String s1, String s2) {
        String str = null;
        int len = 0;
        for (int i = 0; i < s2.length(); i++) {
            for (int j = i + len; j < s2.length(); j++) {
                if(s1.contains(s2.substring(i, j + 1)) ){
                    len = j - i  + 1;
                    str = s2.substring(i, j + 1);
                }else
                    break;
            }
        }
        return str;
    }
}
