package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 迷宫问题
 */
public class Solution43 {
    public static void main(String[] arsg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while ((str = br.readLine()) != null) {
            String[] rowAndColumn = str.split(" ");

            int N = Integer.valueOf(rowAndColumn[0]);//行
            int M = Integer.valueOf(rowAndColumn[1]);//列
            if (N >= 2 && N <= 10 && M >= 2 && M <= 10) {
                int[][] maza = new int[N][M];
                int row = 0;
                while (row < N) {
                    str = br.readLine();
                    String[] inputs = str.split(" ");
                    if (inputs.length == M) {
                        for (int i = 0; i < M; i++) {
                            maza[row][i] = Integer.valueOf(inputs[i]);
                        }
                    }
                    row++;
                }

                findShortestPath(maza);
            }
        }
    }

    public static void findShortestPath(int[][] maza) {
        //不考虑多解情况，迷宫只有一条通道
        //可以横着走或者竖着走
        int i = 0;
        int j = 0;
        while (i < maza.length) {
            while(j < maza[0].length) {
                if (maza[i][j] == 0) {
                    printPath(i, j);
                    j++;//右
                } else {//下
                    j--;
                    i++;
                }
            }
            i++;
            if(j == maza[0].length) j--;//下
        }
    }

    public static void printPath(int i, int j) {
        System.out.println("(" + i + "," + j + ")");
    }
}
