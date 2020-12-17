package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * n * m 棋盘有多少种走法
 */
public class Solution91 {
    public static int getCount(int n,int m) {
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++) {
            for(int j=0;j<m+1;j++) {
                if(i==0||j==0) dp[i][j]=1;
                else dp[i][j]=dp[i][j-1]+dp[i-1][j];
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args)throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=bReader.readLine())!=null) {
            int n=Integer.valueOf(line.substring(0,line.indexOf(" ")));
            int m=Integer.valueOf(line.substring(line.indexOf(" ")+1));
            System.out.println(getCount(n, m));
        }
    }
}
