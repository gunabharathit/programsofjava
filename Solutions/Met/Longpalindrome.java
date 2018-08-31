package com.trainings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Longpalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String Word = scan.next();
		Word = Word.toLowerCase();
		char charWord[] = Word.toCharArray();
		int len = charWord.length;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < len; i++) {
			if (map.containsKey(charWord[i])) {

				map.put(charWord[i], map.get(charWord[i]) + 1);
			} else {
				map.put(charWord[i], 1);
			}
		}
		int count = map.size();
		int choice = 0;
		// System.out.println("count size"+count);
		if (len == count) {
			choice = -1;
		}
		int sum = 0;
		int test = 0;
		for (int a : map.values()) {
			if (a % 2 == 0)
				sum = sum + a;
			else if (a > test)
				test = a;
		}
		int result = sum + test;
		if (choice == -1) {
			System.out.println(-1);
		} else {
			System.out.println("longest palindrome" + result);
		}
		// System.out.println("sum is "+sum);
		// System.out.println("Big odd"+test);

		// System.out.println(map);
		// System.out.println(count);
	}
}
