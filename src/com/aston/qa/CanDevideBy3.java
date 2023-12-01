package com.aston.qa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CanDevideBy3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) {
				try {
					int number = Integer.valueOf(scanner.next());
					if (number % 3 == 0) {
						list.add(number);
					}
				} catch (NumberFormatException e) {
					System.err.println("NumberFormatException: " + e.getMessage());
				}
			}
		}
		list.forEach(i -> System.out.print(i + " "));
	}

}
