class Solution {
	public static int solution(int s) {
		String changed = Integer.toString(s, 3);
		changed = new StringBuilder().append(changed).reverse().toString();

		return  Integer.parseInt(changed, 3);
	}
}