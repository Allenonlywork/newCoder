package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 配置文件恢复
 */
public class Solution66 {
    public static void main(String[] args)throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hMap = new HashMap<>();
        hMap.put("reset", "reset what");
        hMap.put("reset board", "board fault");
        hMap.put("board add", "where to add");
        hMap.put("board delet", "no board at all");
        hMap.put("reboot backplane", "impossible");
        hMap.put("backplane abort", "install first");
        String str =br.readLine();
        while(str!=null){

            if(hMap.containsKey(str)){
                System.out.println(hMap.get(str));
            }else{
                System.out.println("unkown command");
            }
            str = br.readLine();
        }
    }
}
