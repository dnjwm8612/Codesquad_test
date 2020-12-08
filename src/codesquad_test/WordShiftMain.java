package codesquad_test;

import java.util.Scanner;

public class WordShiftMain {

	public static void main(String[] args) {
		WordShift wordShift = new WordShift();
		Scanner scanner = new Scanner(System.in);
		char[] word = new char[100];
		int number;
		StringBuilder direction = new StringBuilder("a");
		word = new char[100];

		while (true) {
			direction.delete(0, direction.length());
			System.out.print("> ");

			word = scanner.next().toCharArray();
			number = scanner.nextInt();
			if (!wordShift.isRange(number)) {
				System.out.println("범위 초과");
				continue;
			}
			direction.append(scanner.next().toLowerCase());

			number = wordShift.isShift(number, direction.toString());

			if (number > 0) {
				wordShift.shiftRight(word, number, word.length);
			} else {
				wordShift.shiftLeft(word, Math.abs(number), word.length);
			}
			System.out.println(String.valueOf(word) + "\n");
		}
		// scan.close();
	}
}
