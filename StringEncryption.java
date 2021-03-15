import java.util.Scanner;

public class StringEncryption extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the word:");
		String word = scanner.nextLine();

		String result = encrypt(word);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String encrypt(String word) {

		String result = "";

		for (int i = 0; i < word.length(); i++) {

			if (i % 2 == 0) {
				if (word.charAt(i) >= 'a' && word.charAt(i) <= 'y')
					result += (char) (word.charAt(i) + 1);
				else if (word.charAt(i) == 'z')
					result += 'a';
			} else
				result += word.charAt(i);

		}

		return result;

	}
}