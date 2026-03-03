package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboard {

	private static BufferedReader Keyboard = new BufferedReader(
			new InputStreamReader(System.in));

	public static String readText(String text) {
		try {
			System.out.println(text);
			return Keyboard.readLine();
		} catch (IOException e) {
			return null;
		}
	}

	public static int readInt(String text) {
		return Integer.parseInt(readText(text));
	}

	public static double readDouble(String text) {
		return Double.parseDouble(readText(text));
	}
}
