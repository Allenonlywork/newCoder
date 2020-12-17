package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 输入一个正整数，按照从小到大的顺序输出它的所有质因子
 */
public class Solution6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long l = sc.nextLong();
        if(l<2){
            System.out.println(l+ " ");
        }else{
            getResult(l);
        }

        sc.close();
    }
    public static void getResult(long ulDataInput){
        for(int i =2;i<=ulDataInput;i++) {
            while (ulDataInput % i == 0) {
                ulDataInput = ulDataInput / i;
                System.out.print(i + " ");
            }
        }

    }
}
