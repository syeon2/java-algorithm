class Solution {
	public String solution(String my_string, int[] indices) {
		char[] cList = my_string.toCharArray();

		for (int i = 0; i < indices.length; i++) {
			int idx = indices[i];

			cList[idx] = ' ';
		}

		String str = String.valueOf(cList);
		str = str.replaceAll(" ", "");

		return str;
	}
}