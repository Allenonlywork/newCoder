package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 矩阵乘法
 */
public class Solution69 {
    public static void main(String[] args) throws Exception {
        BufferedReader bd = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bd.readLine()) != null) {
            Integer xROW = Integer.valueOf(line);
            Integer xCOL = Integer.valueOf(bd.readLine());
            Integer yROW = xCOL;
            Integer yCOL = Integer.valueOf(bd.readLine());
            int[][] X = new int[xROW][xCOL];
            int[][] Y = new int[yROW][yCOL];
            List<String[]> items1 = new ArrayList<>();
            List<String[]> items2 = new ArrayList<>();
            while (xROW > 0) {
                items1.add(bd.readLine().split(" "));
                xROW--;
            }
            while (yROW > 0) {
                items2.add(bd.readLine().split(" "));
                yROW--;
            }
            for (int i = 0; i < items1.size(); i++) {
                String[] item = items1.get(i);
                for (int j = 0; j < item.length; j++) {
                    X[i][j] = Integer.valueOf(item[j]);
                }
            }
            for (int i = 0; i < items2.size(); i++) {
                String[] item = items2.get(i);
                for (int j = 0; j < item.length; j++) {
                    Y[i][j] = Integer.valueOf(item[j]);
                }
            }
            multMatrix(X, Y);
        }
        bd.close();
    }

    public static int[][] multMatrix(int[][] X, int[][] Y) {
        int xROW = X.length;
        int xCOL = X[0].length;
        int yROW = Y.length;
        int yCOL = Y[0].length;
        int[][] resp = new int[xROW][yCOL];
        for (int i = 0; i < xROW; i++) {
            for (int j = 0; j < yCOL; j++) {
                resp[i][j] = calcTwoVal(X, Y, i, j);
            }
        }
        for (int[] items : resp) {
            StringBuffer sb = new StringBuffer();
            for (int item : items) {
                sb.append(item).append(" ");
            }
            System.out.println(sb.toString());
        }
        return resp;
    }

    public static int calcTwoVal(int[][] X, int[][] Y, int i, int j) {
        int xROW = X.length;
        int xCOL = X[0].length;
        int yROW = Y.length;
        int yCOL = Y[0].length;
        int[] mult1Arr = new int[xCOL];
        int[] mult2Arr = new int[yROW];
        int result = 0;
        for (int k = 0; k < xCOL; k++) {
            mult1Arr[k] = X[i][k];
            mult2Arr[k] = Y[k][j];
            result = result + mult1Arr[k] * mult2Arr[k];
        }
        return result;
    }


    public static void get(int N) {

        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for (int i = 2; i <= N / 2; i++) {
            if (!isPrime(i) || !isPrime(N - i)) {
                continue;
            }
            int tmp = Math.abs(N - i - i);
            if (tmp < min) {
                min = tmp;
                a = i;
                b = N - i;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
