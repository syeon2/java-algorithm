import java.util.*;

class Solution {
	public int[] solution(int[] arr) {
		int sum = Arrays.stream(arr).sum();
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];

			while (n-- != 0) {
				queue.add(arr[i]);
			}
		}


		int[] list = new int[sum];

		for (int i = 0; i < list.length; i++) {
			list[i] = queue.remove();
		}

		return list;
	}
}