package com.solutions.s40_50;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 按字节截取字符串，（汉字不能截取半个）
 */
public class Solution46 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string ="";
        String str1 ="";
        String str2 ="";
        while((string =br.readLine())!=null){
            String[] ssString = string.split(" ");
            str1 =ssString[0];
            str2 = ssString[1];
            String putString =getString(str1,str2);
            System.out.println(putString);
        }
    }
    public static String getString(String str1,String str2){
        int num =0;
        int count = Integer.parseInt(str2);
        StringBuilder sb = new StringBuilder();
        for(int i=0;num<count;i++){
            if((str1.charAt(i)>='a'&&str1.charAt(i)<='z')||(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')){
                num++;
            }else{
                if(num==count-1){
                    num +=2;
                    break;
                }else{
                    num+=2;
                }
            }
            sb.append(str1.charAt(i));
        }
        return sb.toString();
    }
}
