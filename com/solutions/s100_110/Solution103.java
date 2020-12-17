package com.solutions.s100_110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Redraiment的走法
 *
 * 6个点的高度各为 2 5 1 5 4 5
 * 如从第1格开始走,最多为3步, 2 4 5
 * 从第2格开始走,最多只有1步,5
 * 而从第3格开始走最多有3步,1 4 5
 * 从第5格开始走最多有2步,4 5
 *
 * 所以这个结果是3。
 */
public class Solution103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            String[] data = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < data.length; i++) {
                arr[i] = Integer.parseInt(data[i]);
            }

            int[] brr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                brr[i] = 1;
                for (int j = 0; j < i; j++) {
                    if (arr[j] < arr[i]) {
                        brr[i] = Math.max(brr[i], brr[j] + 1);
                    }
                }
            }

            int max = 0;
            for (int aBrr : brr) {
                if (max < aBrr) {
                    max = aBrr;
                }
            }

            System.out.println(max);
        }
    }
}
