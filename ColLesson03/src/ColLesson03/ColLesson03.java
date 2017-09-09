package ColLesson03;


import java.util.Scanner;

public class ColLesson03 {
	public static void main(String args[]) {
	Word[] words = new Word[5];

	System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
	Scanner scan = new Scanner(System.in);

	String eng = scan.next();
	String jpn = scan.next();

	words[0] = new Word(eng, jpn);


	int i = 1;
	for(;;i++) {
		System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");

		eng = scan.next();
		if(eng.equals("e")) {
		break;
		}

		jpn = scan.next();

		if(i >= words.length) {
			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
			break;
		}

		words[i] = new Word(eng, jpn);
		}

		scan.close();
		display(words, i);
		System.out.println(i + "件、登録しました。");
	}

	private static void display(Word[] words, int length) {
		for(int i=0;i<length;i++) {
			Word word = words[i];
			System.out.println(word.toString());
		}
	}
}
