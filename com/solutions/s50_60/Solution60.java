package com.solutions.s50_60;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 查找组成一个偶数最接近的两个素数
 */
public class Solution60 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine())!=null){
            int count = Integer.valueOf(str);
            int left = count / 2;
            int right = count /2;
            while (left > 0 && right < count){
                //                if(left != right){
                if (isNum(left) && isNum(right)) {
                    System.out.println(left );
                    System.out.println(right);
                    break;
                }
//                }
                left--;
                right++;
            }
        }
    }

    public static boolean isNum(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
