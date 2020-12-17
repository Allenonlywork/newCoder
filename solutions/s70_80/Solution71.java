package com.solutions.s70_80;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 字符串通配符
 */
public class Solution71 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            String s1 = br.readLine();
            System.out.println(help(s1,str));
        }
    }

    private static boolean help(String s, String p) {
        int ss = 0;
        int pp = 0;
        int star = -1;
        int match = 0;
        while (ss < s.length()) {
            //先匹配
            if (pp < p.length() && (s.charAt(ss) == p.charAt(pp) || p.charAt(pp) == '?')) {
                pp++;
                ss++;
            } else if (pp < p.length() && p.charAt(pp) == '*') {
                star = pp;
                match = ss;
                pp++;
            } else if (star != -1) {
                pp = star + 1;
                ss = ++match;
            } else {
                return false;
            }
        }
        while (pp < p.length() && p.charAt(pp) == '*') {
            pp++;
        }
        return pp == p.length();
    }
}
