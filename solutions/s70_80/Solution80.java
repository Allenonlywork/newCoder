package com.solutions.s70_80;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 整形数组合并
 */
public class Solution80 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int numa = in.nextInt();
            int[] a = new int[numa];
            for (int i = 0; i < numa; i++) {
                a[i] = in.nextInt();
            }
            int numb = in.nextInt();
            int[] b = new int[numb];
            for (int i = 0; i < numb; i++) {
                b[i] = in.nextInt();
            }
            System.out.print(combineBySort(a, b));
        }
        in.close();
    }
    public static String combineBySort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        Arrays.sort(a);
        Arrays.sort(b);

        int aindex = 0;
        int bindex = 0;
        int cindex = 0;

        while (aindex < a.length && bindex < b.length) {
            if (a[aindex] < b[bindex]) {
                c[cindex] = a[aindex];
                aindex++;
            }
            else if (a[aindex] > b[bindex]) {
                c[cindex] = b[bindex];
                bindex++;
            }
            else {
                c[cindex] = a[aindex];
                aindex++;
                bindex++;
            }
            cindex++;
        }

        for (int i = aindex; i < a.length; i++) {
            if (a[i] != c[cindex - 1]) {
                c[cindex] = a[i];
                cindex++;
            }
        }

        for (int i = bindex; i < b.length; i++) {
            if (b[i] != c[cindex - 1]) {
                c[cindex] = b[i];
                cindex++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < cindex; i++) {
            builder.append(c[i]);
        }
        return builder.toString();
    }
}
