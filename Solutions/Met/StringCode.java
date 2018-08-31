package com.test;

public class StringCode {
    public int findStringCode(String input1){
        String input1ToLower = input1.toLowerCase();
        String arr[] = input1ToLower.split(" ");
        String code = "";
        for(String a : arr){
            System.out.println(a);
            int len = a.length();
            boolean isEven = false;
            int sum=0;
            if(len%2==0) {
                isEven = true;
            }
            for (int i = 0; i < len / 2; i++) {
                int left = (int)a.charAt(i) - 96;
                int right = a.charAt(len - (i + 1)) - 96;
                int diff = Math.abs(left - right);
                sum = sum + diff;
                System.out.println(diff);
            }
            if(!isEven){
                sum = sum + (a.charAt(len/2)-96);
            }
            System.out.println(sum);
            code = code + sum;
        }
        return Integer.parseInt(code);
    }
    public static void main(String args[]){
        StringCode s = new StringCode();
        System.out.println(s.findStringCode("Hello World a is king"));
    }
}