import java.util.*;

class Solution {
	public static int solution(String[][] clothes) {
		int answer = 1;

		Map<String, Set<String>> map = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			String cloth = clothes[i][0];
			String kind = clothes[i][1];

			if (map.get(kind) == null) {
				map.put(kind, new HashSet<String>());
				map.get(kind).add(cloth);
			} else {
				map.get(kind).add(cloth);
			}
		}

		for (String key : map.keySet()) {
			System.out.println(key);
			System.out.println(map.get(key).size());
			answer *= map.get(key).size() + 1;
		}

		return answer - 1;
	}
}