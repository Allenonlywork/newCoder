package com.solutions.s100_110;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 字符统计
 *
 * 如果统计的个数相同，则按照ASCII码由小到大排序输出 。如果有其他字符，则对这些字符不用进行统计。
 *
 * 实现以下接口：
 * 输入一个字符串，对字符中的各个英文字符，数字，空格进行统计（可反复调用）
 * 按照统计个数由多到少输出统计结果，如果统计的个数相同，则按照ASII码由小到大排序输出
 * 清空目前的统计结果，重新统计
 * 调用者会保证：
 * 输入的字符串以‘\0’结尾。
 */
public class Solution102 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(fun(line));
        }
    }

    private static String fun(String str) {
        char[] chs=str.toCharArray();
        int[] num=new int[200];     //必须大于128
        for (char c : chs) {
            int i=(int)c;
            num[i]++;
        }

        int max=0;
        for(int i=0;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }

        StringBuffer sb=new StringBuffer();

        while(max!=0){
            for(int i=0;i<num.length;i++){
                if(max==num[i]){
                    sb.append((char)i);
                }
            }
            max--;
        }
        return sb.toString();
    }
}
