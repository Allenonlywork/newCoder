package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 名字的漂亮度
 */
public class Solution45 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = bf.readLine()) != null) {
            int n = Integer.parseInt(str);
            for (int i = 0; i < n; i++) {
                String s = bf.readLine();
                int count[] = new int[26];
                for (char c : s.toCharArray()) {
                    count[c - 'a']++;
                }
                Arrays.sort(count);
                int k = 26;
                int sum = 0;
                for (int j = count.length - 1; j >= 0; j--) {
                    if (count[j] == 0) {
                        break;
                    }
                    sum += (k--) * count[j];
                }
                System.out.println(sum);
            }
        }
    }
}
