package ColLesson02;
import java.util.Scanner;

public class ColLesson02 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		// 例えば、「apple  りんご」と入力されたときはtmp[0]に"apple"、tmp[1]に"りんご"が入る
//		String[] tmp = new String[2];
//		tmp = input.split(" ");
//
//		Word col = new Word(tmp[1],tmp[0]);
//
//		col1.printWord();

		int index = 0;
			while (!input.equals("e")){
				String[] tmp = new String[2];
				tmp = input.split(" ");
				Word col = new Word(tmp[0],tmp[1]);
				words[index] = col;
				index++;
				System.out.println("次の英単語と日本語を入力して下さい。\"e\"で終了します。");
				input = sc.nextLine();
			}

		for(int i = 0; i < index; i++ ){
			System.out.println(words[i]);
		}

		System.out.println(index + "件、登録しました。");
		}
}

