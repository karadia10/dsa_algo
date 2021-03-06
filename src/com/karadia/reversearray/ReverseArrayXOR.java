package com.karadia.reversearray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArrayXOR {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {
            StringBuilder stringBuilder = new StringBuilder();
            int t = Integer.parseInt(bufferedReader.readLine());
            while (t-- > 0) {
                char[] arr = bufferedReader.readLine().toCharArray();
                stringBuilder.append(reverseString(arr, 0, arr.length - 1));
                stringBuilder.append("\n");
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
        }
    }

    private static char[] reverseString(char[] arr, int start, int end) {
        if (start < end){
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            reverseString(arr, ++start, --end);
        }
        return arr;
    }
}
