package com.solutions.s10_20;

import java.util.Scanner;
/**
 * int型数据在内存中存储时1的个数。
 */
public class Solution15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        int i = 0;
        while(n > 0){
            if(n%2 == 1){
                i++;
            }
            n = n>>1;
        }
        System.out.println(i);
    }
}
