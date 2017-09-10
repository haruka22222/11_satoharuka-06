package ColLesson04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColLesson04 {

	public static void main(String[] args) {
		List<Word> words = new ArrayList<>();

		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int index = 0;
		try {
			while (!input.equals("e")){
				String[] tmp = new String[2];
				tmp = input.split(" ");
				Word wd = new Word(tmp[0], tmp[1]);
				words.add(wd);
				index++;
				System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");
				input = sc.nextLine();
			}
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
	}

	for (Word wd : words){
		System.out.println(wd);
	}
	System.out.println(index + "件、登録しました。");
	}
}



	//	Scanner scan = new Scanner(System.in);
//
//	String eng = scan.next();
//	String jpn = scan.next();
//
//	Word word = new Word(eng, jpn);
//	words.add(word);
//
//	int i = 1;
//	for(;;i++) {
//		System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");
//
//		eng = scan.next();
//		if(eng.equals("e")) {
//			break;
//		}
//
//		jpn = scan.next();
//
//		if(i >= size) {
//			System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
//			break;
//		}
//
//		word = new Word(eng, jpn);
//		words.add(word);
//	}
//
//		scan.close();
//		display(words, i);
//		System.out.println(i + "件、登録しました。");
//
//}
//
//	private static void display(ArrayList<Word> words, int length) {
//		for(int i=0;i<length;i++) {
//			Word word = words.get(i);
//			System.out.println(word.toString());
//		}
//	}
//}
