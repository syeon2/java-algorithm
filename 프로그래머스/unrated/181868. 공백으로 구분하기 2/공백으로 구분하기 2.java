import java.util.*;


class Solution {
	public String[] solution(String my_string) {
		Queue<String> queue = new LinkedList<>();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < my_string.length(); i++) {
			String s = my_string.substring(i, i + 1);

			if (!s.equals(" ")) {
				sb.append(s);
			} else {
				if (!sb.toString().equals("")) {
					queue.add(sb.toString());
				}

				sb = new StringBuilder();
			}
		}

		if (!sb.toString().equals("")) {
			queue.add(sb.toString());
		}

		String[] answer = new String[queue.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = queue.remove();
		}

		return answer;
	}
}