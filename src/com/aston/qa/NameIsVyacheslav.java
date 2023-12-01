package com.aston.qa;

public class NameIsVyacheslav {

	private static final String NO_NAME_MESSAGE = "Нет такого имени";
	private static final String NAME = "Вячеслав";

	public static void main(String[] args) {
		if (args.length < 1) {
			usage();
		}
		String name = args[0];
		if (name.equals(NAME)) {
			System.out.println("Привет, " + NAME);
		} else {
			System.out.println(NO_NAME_MESSAGE);
		}
	}

	private static void usage() {
		System.out.println("Usage: provide one argument - name, a single word string");
		System.exit(0);
	}
}
