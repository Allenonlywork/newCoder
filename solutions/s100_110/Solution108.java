package com.solutions.s100_110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 求最小公倍数
 */
public class Solution108 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bf.readLine()) != null){
            String[] stra = str.split(" ");
            int A = Integer.parseInt(stra[0]);
            int B = Integer.parseInt(stra[1]);
            int tmp = 1;
            int min = A<B?A:B;
            for(int i=2; i <= min; i++) {
                if(A%i==0 && B%i==0) {
                    tmp *= i;
                    A /= i;
                    B /=i;
                }
            }
            int ABS=A*B*tmp;
            System.out.println(ABS);
        }
        bf.close();
    }
}
