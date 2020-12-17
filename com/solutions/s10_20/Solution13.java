package com.solutions.s10_20;

import java.util.Scanner;

/**
 * 句子逆序
 */
public class Solution13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            while(s.lastIndexOf(' ')!= -1){
                System.out.print(s.substring(s.lastIndexOf(' ')+1,s.length()));
                System.out.print(" ");
                s= s.substring(0,s.lastIndexOf(' '));
            }
            System.out.print(s);
        }

    }
}
