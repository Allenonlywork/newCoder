package com.solutions.s30_40;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = null;
        String line2 = null;
        while ((line1 = br.readLine()) != null && (line2 = br.readLine()) != null) {
            String[] IP1 = line1.split("\\.");
            long IP2 = Long.parseLong(line2);

            System.out.println(Long.parseLong(IP1[0]) << 24 | Long.parseLong(IP1[1]) << 16 |
                    Long.parseLong(IP1[2]) << 8 | Long.parseLong(IP1[3]));
            //167773121

            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf((IP2 >> 24) & 255)).append(".").append(String.valueOf((IP2 >> 16) & 255))
                    .append(".").append(String.valueOf((IP2 >> 8) & 255)).append(".").append(String.valueOf(IP2 & 255));
            System.out.println(sb.toString());

        }

    }
}
