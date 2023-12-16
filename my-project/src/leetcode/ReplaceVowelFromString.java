package leetcode;

public class ReplaceVowelFromString {

	public static void main(String[] args) {
		String str = "dfisdosdcsasdcesvu";
		
		String res = str.replaceAll("[aeiou]", "");
		
		System.out.println(res);

	}

}
