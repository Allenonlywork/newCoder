package com.solutions.s80_90;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 合法IP
 */
public class Solution90 {
    public static void main(String[] args)throws Exception{
        String s="";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while((s=in.readLine())!=null){
            System.out.println(DD(s));
        }
    }

    public static String DD(String s){
        if(s.indexOf(" ")!=-1) return "NO";
        String[] str = s.split("\\.");
        for(int i=0; i<str.length; i++){
            if (Integer.parseInt(str[i])>=0 &&Integer.parseInt(str[i])<=255){
                continue;
            }else{
                return "NO";
            }
        }
        return "YES";
    }
}
