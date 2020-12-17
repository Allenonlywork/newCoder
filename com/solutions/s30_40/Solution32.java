package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 字符串运用 - 密码截取  取最长有效密码串
 */
public class Solution32 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int max = 1;
            char[] xx = line.toCharArray();
            int len = xx.length;
            if (len == 0) {
                System.out.println(0);
            } else {
                for (int i = 1; i < len - max / 2; i++) {
                    int low = i - 1, high = i;
                    while (low >= 0 && high < len && xx[low] == xx[high]) {
                        low--;
                        high++;
                    }
                    if (high - low - 1 > max) {
                        max = high - low - 1;
                    }

                    low = i - 1;
                    high = i + 1;
                    while (low >= 0 && high < len && xx[low] == xx[high]) {
                        low--;
                        high++;
                    }
                    if (high - low - 1 > max) {
                        max = high - low - 1;
                    }
                }
            }
            System.out.println(max);
        }

    }
}
