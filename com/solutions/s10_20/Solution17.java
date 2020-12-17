package com.solutions.s10_20;

import java.util.Scanner;

/**
 * 坐标移动
 */
public class Solution17 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        while(scan.hasNextLine()){
            int x=0;
            int y=0;
            String[]tokens=scan.nextLine().split(";");
            for(int i=0;i<tokens.length;i++){
                try{
                    int b=Integer.parseInt(tokens[i].substring(1,tokens[i].length()));
                    if(tokens[i].charAt(0)=='A'){
                        x-=b;
                    }
                    if(tokens[i].charAt(0)=='W'){
                        y+=b;
                    }
                    if(tokens[i].charAt(0)=='S'){
                        y-=b;
                    }
                    if(tokens[i].charAt(0)=='D'){
                        x+=b;
                    }


                }catch(Exception e){
                    continue;
                }
            }
            System.out.println(x+","+y);

        }
    }
}
