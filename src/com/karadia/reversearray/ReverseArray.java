package com.karadia.reversearray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReverseArray {

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
        char temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
