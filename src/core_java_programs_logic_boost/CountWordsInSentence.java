package core_java_programs_logic_boost;

public class CountWordsInSentence {
	
	
	public static void main(String[] args) {
		String sentence= "Hello !! My Name is Sagar Gonjare ";
		int count=wordscount(sentence);
		System.out.println(count);
	}
	
	public static int wordscount (String sentence) {
		String words[]=sentence.split("[\\s.,;!?]+");
		return words.length;
	}

}
