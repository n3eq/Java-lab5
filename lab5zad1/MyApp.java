package lab5zad1;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Wpisz swój tekst: ");
		String text = input.nextLine();

		MyApp myApp = new MyApp();

		System.out.println("Twój tekst:");
		System.out.println(text);

		System.out.println("Twój tekst po dodaniu spacji:");
		String textWithWhiteSpace = myApp.addWhitespace(text);
		System.out.println(textWithWhiteSpace);

		System.out.println("Twój tekst po odjęciu podwójnych spacji:");
		String textWithoutDoubleWhiteSpace = myApp.subtractDoubleWhitespace(textWithWhiteSpace);
		System.out.println(textWithoutDoubleWhiteSpace);

		System.out.println("Liczba słów w tekście:" + " '" + text + "' ");
		System.out.println(myApp.calculateAmountOfWords(text));

		System.out.println("Tekst:" + " '" + text + "' " + "po zamianie liter.");
		String textAfterChanges = myApp.changeLetters(text);
		System.out.println(textAfterChanges);

		System.out.println("Tekst:" + " '" + text + "' " + "po usunieciu literek 'a'.");
		String textAfterSubtract = myApp.subtractLetter(text);
		System.out.println(textAfterSubtract);

		System.out.println("Tekst:" + " '" + text + "' " + "po zastąpieniu spacji gwiazdkami.");
		String textWithStars = myApp.changeWhitespace(text);
		System.out.println(textWithStars);
	}

	public String addWhitespace(String text) {

		char[] arrayOfChars = new char[text.length() * 2];

		int j = 0;
		for (int i = 0; i < text.length(); i++) {

			arrayOfChars[i + j] = text.charAt(i);

			if (arrayOfChars[i + j] == ' ' && arrayOfChars[i + j - 1] == ' ')
				continue;

			j++;
			arrayOfChars[i + j] = ' ';
		}

		return new String(arrayOfChars);
	}

	public String subtractDoubleWhitespace(String text) {

		char[] arrayOfChars = new char[text.length()];

		int j = 0;
		for (int i = 0; i < text.length() - 1; i++) {

			arrayOfChars[j] = text.charAt(i);
			j++;

			if (text.charAt(i) == ' ' && text.charAt(i + 1) == ' ') {
				i++;
			}
		}

		return new String(arrayOfChars);
	}

	public int calculateAmountOfWords(String text) {

		int result = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == ' ')
				result++;
		}

		return result + 1;
	}

	public String changeLetters(String text) {

		char[] arrayOfChars = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {

			arrayOfChars[i] = text.charAt(i);

			if (arrayOfChars[i] >= 65 && arrayOfChars[i] <= 90) {

				arrayOfChars[i] = (char) (arrayOfChars[i] + 32);
			} else if (arrayOfChars[i] >= 97 && arrayOfChars[i] <= 122) {
				arrayOfChars[i] = (char) (arrayOfChars[i] - 32);
			}

		}

		return new String(arrayOfChars);
	}

	public String subtractLetter(String text) {

		char[] arrayOfChars = new char[text.length()];

		int j = 0;
		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				continue;
			}

			arrayOfChars[j] = text.charAt(i);
			j++;

		}

		return new String(arrayOfChars);
	}

	public String changeWhitespace(String text) {

		char[] arrayOfChars = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ') {
				arrayOfChars[i] = '*';
				continue;
			}

			arrayOfChars[i] = text.charAt(i);

		}

		return new String(arrayOfChars);
	}
}
