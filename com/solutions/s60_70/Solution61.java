package com.solutions.s60_70;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 放苹果
 */
public class Solution61 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        while ((input = reader.readLine()) != null) {
            String []temps= input.split(" ");
            int apples=Integer.parseInt(temps[0]);
            int pans=Integer.parseInt(temps[1]);
            System.out.println(f(apples,pans));
        }
    }

    public static int f(int apples,int pans){
        if (apples==0||pans==1){
            return  1;
        }
        if (pans>apples){
            return f(apples,apples);
        } else {
            return f(apples, pans-1) + f(apples-pans, pans);
        }
    }
}
