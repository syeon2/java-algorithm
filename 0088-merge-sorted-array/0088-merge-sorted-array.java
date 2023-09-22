class Solution {
    // Destination
    /*
    1. nums1, nums2 배열과 각 배열에서 유효한 값이 있는 개수 m, n이 주어진다.
    2. nums1, nums2는 오름차순으로 정렬되어 있으며 두 배열을 오름차순으로 합병해야한다.
    3. 단, nums1에 합병하여야 한다.
     */

     // Abstraction
     /*
     1. 투포인터를 사용하여 새로운 배열에 먼저 캐싱한 이후 nums1에 옮기는 방법도 있을 것이다.
     2. 배열에서 차례대로 요소를 새로운 배열에 넣을 수 있도록 각 배열의 인덱스를 트래킹할 수 있는 변수가 필요하다.
     */

     // Implementation
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] answer = new int[nums1.length];

        int index = 0;
        int i1 = 0;
        int i2 = 0;

        while (index != m + n) {
            if (i1 < m && i2 < n) {
                if (nums1[i1] < nums2[i2]) answer[index++] = nums1[i1++];
                else answer[index++] = nums2[i2++];
            } else {
                break;
            }
        }

        while (i1 < m) {
            answer[index++] = nums1[i1++];
        }

        while (i2 < n) {
            answer[index++] = nums2[i2++];
        }

        for (int i = 0 ; i < nums1.length; i++) {
            nums1[i] = answer[i];
        }
    }
}