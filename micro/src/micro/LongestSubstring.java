package micro;

import java.util.ArrayList;

public class LongestSubstring {
	
	public static void main(String[] args) {
		LongestSubstring obj = new LongestSubstring();
		int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
		obj.lengthOfLIS(arr);
	}
	public int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int num : nums) { // 10, 9>10
			if (list.size() == 0 || num > list.get(list.size() - 1)) {
				list.add(num);
			} else {
				int i = 0;
				int j = list.size() - 1;

				while (i < j) {
					int mid = (i + j) / 2;
					if (list.get(mid) < num) {
						i = mid + 1;
					} else {
						j = mid;
					}
				}
				list.set(j, num);
			}
		}
		return list.size();
	}
}
