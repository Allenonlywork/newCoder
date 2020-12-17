package com.solutions.s1_10;

import java.util.Scanner;

/**
 * 合并表记录
 * 数据表记录包含表索引和数值（int范围的整数），
 * 请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算
 * ，输出按照key值升序进行输出。
 */
public class Solution8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        //strs数组用于接收键值对
        String[] strs = new String[n];
        for(int i = 0;i<n;i++){
            String s = sc.nextLine();
            strs[i] = s;
        }

        //索引index用于找出最大的索引值
        int[] indexs = new int[n];
        for(int i =0;i<n;i++){
            indexs[i] = Integer.valueOf(strs[i].substring(0,strs[i].indexOf(' ')));
        }
        //找出最大的索引值
        int max = indexs[0];
        for(int i = 0;i<n;i++){
            if(indexs[i]>max){
                max = indexs[i];
            }
        }
        //arrs用于存储合并后的键值对
        int[] arrs = new int[max+1];
        for(int i = 0;i<n;i++){
            int index = Integer.valueOf(strs[i].substring(0,strs[i].indexOf(' ')));
            int value = Integer.valueOf(strs[i].substring(strs[i].indexOf(' ')+1));
            arrs[index] += value;
        }

        //打印结果
        for(int i = 0;i<arrs.length;i++){
            if(arrs[i] != 0){
                System.out.println(i+ " " + arrs[i]);
            }
        }
    }
}
