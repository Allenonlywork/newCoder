package com.solutions.s10_20;

import java.util.Scanner;

/**
 * 接受一个字符串，然后输出该字符串反转后的字符串
 */
public class Solution12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String[] arr = new String[s.length()];
            for(int i = 0;i<arr.length;i++){
                arr[i] = s.substring(i,i+1);
            }
            for(int i = arr.length-1;i >=0;i--){
                System.out.print(arr[i]);
            }
        }
    }
}
