package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 图片整理
 * 根据ASCll码值排序
 */
public class Solution34 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = br.readLine())!=null)
        {
            char[] chs = line.toCharArray();
            Arrays.sort(chs);
            System.out.println(chs);
        }

    }
}
