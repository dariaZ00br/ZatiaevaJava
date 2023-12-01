package com.aston.qa;

public class GreaterSeven {

	public static void main(String[] args) {
		if(args.length < 1) {
			usage();
		}
		try {
			int number = Integer.parseInt(args[0]);
			if(number > 7) {
				System.out.println("Привет");
			}
		} catch (NumberFormatException e) {
			System.err.println("NumberFormatException: " + e.getLocalizedMessage());
			usage();
		}
	}

	private static void usage() {
		System.out.println("Usage: provide one argument - integer number");
		System.exit(0);
	}
}
