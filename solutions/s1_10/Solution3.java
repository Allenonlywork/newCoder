package com.solutions.s1_10;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 明明的随机数
 */
public class Solution3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();

            TreeSet<Integer> set = new TreeSet<Integer>();
            for(int i =0;i < n;i++){
                int m = sc.nextInt();
                set.add(m);
            }
            for(Integer i : set){
                System.out.println(i);
            }

        }
        sc.close();
    }
}
