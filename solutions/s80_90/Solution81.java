package com.solutions.s80_90;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符串匹配
 */
public class Solution81 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            String str2 = br.readLine();
            int i;
            for (i = 0; i < str.length(); i++) {
                if (str2.indexOf(str.charAt(i)) == -1) {
                    System.out.println("false");
                    i--;
                    break;
                }
            }
            if (i == str.length()) {
                System.out.println(true);
            }
        }
        br.close();
    }
}
