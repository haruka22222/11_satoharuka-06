package ColLesson04;

public class Word {
	private String english;
	private String japanese;

	public Word(String english, String japanese) {
		this.english = english;
		this.japanese = japanese;
	}

	public String toString() {
		return "英単語:" + english + "日本語:" + japanese;
	}

	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public String getJapanese() {
		return japanese;
	}
	public void setJapanse(String japanese) {
		this.japanese = japanese;
	}

}
