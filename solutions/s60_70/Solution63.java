package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * DNA序列
 */
public class Solution63 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            int maxRadio = 0;
            int index = 0;
            int n = Integer.parseInt(br.readLine());
            for(int i = 0;i <= str.length() - n;i++){
                int temp = getMaxRadio(str.substring(i,i+n));
                if(temp > maxRadio){
                    maxRadio = temp;
                    index = i;
                }
            }
            System.out.println(str.substring(index,index + n));
        }
    }

    public static int getMaxRadio(String str){
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if('G' == str.charAt(i) || 'C' == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
