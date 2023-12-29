package core_java_programs_logic_boost;

public class ReverseWordsInSentence {
	public static void main(String[] args) {
		String sentence= "Hello !! My Name is Sagar Gonjare ";
		String reverse=reverseWords(sentence);
		System.out.println(reverse);
	}
	
	
	public static String reverseWords(String sentence) {
		String words []= sentence.split("\\s+");
		// reverse order of words
		StringBuilder reverseString = new StringBuilder();
		for (int i = words.length-1;i>=0;i--) {
			reverseString.append(words[i]).append(" ");
			
		}
		return reverseString.toString().trim();
	}

}
