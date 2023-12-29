package core_java_programs_logic_boost;

import java.util.Arrays;

public class CheckIfStringIsAnagram {
	public static void main(String[] args) {
		String str1="Listen";
		String str2="Silent";
		if (isAnagram(str1,str2)) {
			System.out.println("String is anagram");
		}else {
			System.out.println("String is not an Anagram");
		}
	}
	
	public static boolean isAnagram(String str1,String str2) {
		if (str1.length()!=str2.length()) {
			return false;
		}

		
		str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

		char[] str1Char=str1.toCharArray();
		char[] str2Char=str2.toCharArray();
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		 
		return Arrays.equals(str1Char, str2Char);
	}

}
