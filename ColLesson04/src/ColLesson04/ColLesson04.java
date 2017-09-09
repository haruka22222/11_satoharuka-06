package ColLesson04;

import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson04 {
public static void main(String args[]) {
	ArrayList<Word> words = new ArrayList<Word>();
	int size = 5; // size of ArrayList

	System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
	Scanner scan = new Scanner(System.in);

	String eng = scan.next();
	String jpn = scan.next();

	Word word = new Word(eng, jpn);
	words.add(word);

	int i = 1;
	for(;;i++) {
		System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");

		eng = scan.next();
		if(eng.equals("e")) {
			break;
		}

		jpn = scan.next();

		if(i >= size) {
			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
			break;
		}

		word = new Word(eng, jpn);
		words.add(word);
	}

		scan.close();
		display(words, i);
		System.out.println(i + "件、登録しました。");

}

	private static void display(ArrayList<Word> words, int length) {
		for(int i=0;i<length;i++) {
			Word word = words.get(i);
			System.out.println(word.toString());
		}
	}
}
