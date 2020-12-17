package com.solutions.s90_100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 将一个字符中所有出现的数字前后加上符号“*”，其他字符保持不变
 */
public class Solution96 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()) != null){
            System.out.println(MarkNum(str));
        }
    }

    private static String MarkNum(String pinStr){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < pinStr.length(); i++) {
            if(pinStr.charAt(i) >= '0' && pinStr.charAt(i) <= '9'){
                if(i == 0){//判断第一位
                    if((pinStr.charAt(i+1) >='a' && pinStr.charAt(i+1) <='z') ||(pinStr.charAt(i+1) >='A' && pinStr.charAt(i+1) <='Z')){
                        sb.append("*");
                        sb.append(pinStr.charAt(i));
                        sb.append("*");
                    }else {
                        sb.append("*");
                        sb.append(pinStr.charAt(i));
                    }
                }else if(i == pinStr.length()-1){//判断最后一位
                    if((pinStr.charAt(i-1) >='a' && pinStr.charAt(i-1) <='z') ||(pinStr.charAt(i-1) >='A' && pinStr.charAt(i-1) <='Z')){
                        sb.append("*");
                        sb.append(pinStr.charAt(i));
                        sb.append("*");
                    }else {
                        sb.append(pinStr.charAt(i));
                        sb.append("*");
                    }
                } else if(i == pinStr.length()-1){
                    sb.append(pinStr.charAt(i));
                    sb.append("*");
                }else if(((pinStr.charAt(i-1) >='a' && pinStr.charAt(i-1) <='z') ||(pinStr.charAt(i-1) >='A' && pinStr.charAt(i-1) <='Z')) && (pinStr.charAt(i+1) >='0' && pinStr.charAt(i+1) <='9')){
                    sb.append("*");
                    sb.append(pinStr.charAt(i));
                }else if((pinStr.charAt(i-1) >='0' && pinStr.charAt(i-1) <='9') && ((pinStr.charAt(i+1) >='a' && pinStr.charAt(i+1) <='z') ||(pinStr.charAt(i+1) >='A' && pinStr.charAt(i+1) <='Z'))){
                    sb.append(pinStr.charAt(i));
                    sb.append("*");
                }else if(((pinStr.charAt(i-1) >='a' && pinStr.charAt(i-1) <='z') ||(pinStr.charAt(i-1) >='A' && pinStr.charAt(i-1) <='Z')) && ((pinStr.charAt(i+1) >='a' && pinStr.charAt(i+1) <='z') ||(pinStr.charAt(i+1) >='A' && pinStr.charAt(i+1) <='Z'))){
                    sb.append("*");
                    sb.append(pinStr.charAt(i));
                    sb.append("*");
                }else {
                    sb.append(pinStr.charAt(i));
                }
            }else {
                sb.append(pinStr.charAt(i));
            }
        }
        return sb.toString();
    }
}
