class Solution {
	public String solution(String my_string, int s, int e) {
		StringBuilder sb = new StringBuilder();

		String s1 = my_string.substring(0, s);
		String s2 = my_string.substring(s, e + 1);
		String s3 = my_string.substring(e + 1);

		String answer = s1.concat(sb.append(s2).reverse().toString()).concat(s3);

		return answer;
	}
}