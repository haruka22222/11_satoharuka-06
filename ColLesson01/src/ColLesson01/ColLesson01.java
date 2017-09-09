package ColLesson01;
import java.util.Scanner;

public class ColLesson01 {
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

		int i = 0;
		try{
			while (!input.equals("e")){
				String[] tmp = new String[2];
				tmp = input.split(" ");

				Word col = new Word(tmp[1],tmp[0]);
				words[i] = col;
				i++;
				System.out.println("次の単語を入力して下さい。\"e\"で終了します。");
				input = sc.nextLine();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("用意した配列を容量をオーバーしました。");
		}
		for(int j = 0; j < words.length;j++){
			words[j].printWord();
		}

		System.out.println("\"j\"件、登録しました。");
	}
}

