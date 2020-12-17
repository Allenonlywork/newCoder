package com.solutions.s20_30;

import java.util.Scanner;

/**
 * 汽水瓶
 */
public class Solution22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.valueOf(sc.nextLine());
            System.out.println(getNum(n));
        }
    }
    public static int getNum(int n){
        if(n < 2){
            return 0;
        }
        //两个空瓶子可以借一个 -->3个空瓶子，换一瓶，喝完之后再还
        if(n == 2){
            return 1;
        }
        int sum = 0;
        //三个空瓶子可以兑换一瓶汽水，m表示可以兑换的汽水瓶数
        int m = n/3;
        //k表示兑换后剩余的空瓶子数量
        int k = n%3;
        sum = m + getNum(m+k);
        return sum;
    }
}
