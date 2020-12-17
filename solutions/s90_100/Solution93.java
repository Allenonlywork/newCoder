package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * int型数组分两组
 * 该数组能否分成两组，
 * 使得两组中各元素加起来的和相等，
 * 并且，所有5的倍数必须在其中一个组中，
 * 所有3的倍数在另一个组中（不包括5的倍数），
 * 能满足以上条件，返回true；不满足时返回false。
 */
public class Solution93 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while(( str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            int[] arr = new int[n];
            int len = 0;
            String[] data = br.readLine().split(" ");
            int five = 0, three = 0;
            for(String i : data){
                int x = Integer.parseInt(i);
                if(x == 0) continue;
                if(x % 5 == 0) five += x;
                else if(x % 3 == 0) three += x;
                else arr[len++] = x;
            }
            if(check(0, five - three, arr, len))System.out.println("true");
            else System.out.println("false");
        }
    }
    public static boolean check(int i, int dif, int[] arr, int len){
        if(i == len){
            return dif == 0;
        }
        return check(i+1, dif - arr[i], arr, len) || check(i+1, dif + arr[i], arr, len);
    }
}
