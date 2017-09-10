package ColLesson02;

public class Word{
	private String japanese;
	private String english;

	public Word(String japanese, String english) {
		this.japanese = japanese;
		this.english = english;
	}

	public String toString() {
			return "英単語:" + english + "日本語:" + japanese;
	}

	public String getJapanese() {
		return this.japanese;
	}
	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}
	public String getEnglish() {
		return this.english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}

//	public void printWord() {
//		System.out.println(
//				  this.getJapanese()
//				+ this.getEnglish()
//		);
//	}



}