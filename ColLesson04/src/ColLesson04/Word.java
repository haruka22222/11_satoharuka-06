package ColLesson04;

public class Word {
	private String english;
	private String japanese;

	Word() {}

	Word(String english, String japanese) {
		this.english = english;
		this.japanese = japanese;
	}

	public String getEnglish() {
		return this.english;
	}

	public String getJapanese() {
		return this.japanese;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public void setJapanse(String japanese) {
		this.japanese = japanese;
	}

	public String toString() {
		return "英単語:" + this.getEnglish() + " 日本語:" + this.getJapanese();
	}
}
