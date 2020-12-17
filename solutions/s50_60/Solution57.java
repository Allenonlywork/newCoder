package com.solutions.s50_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 高精度整数加法
 */
public class Solution57 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine()) != null){
            BigInteger a = new BigInteger(str.trim());
            BigInteger b = new BigInteger(bf.readLine().trim());
            System.out.println(a.add(b).toString());
        }
        bf.close();
    }
}
