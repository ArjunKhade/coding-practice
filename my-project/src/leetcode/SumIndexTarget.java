package leetcode;

public class SumIndexTarget {
	public int[] twoSum(int[] numbers, int target) {
		int si = 0;
		int ei = numbers.length - 1;

		while (si <= ei) {
			int sum = numbers[si] + numbers[ei];

			if (sum > target) {
				ei--;

			} else if (sum < target) {
				si++;
			} else {
				return new int[] { si + 1, ei + 1 };
			}
		}
		return new int[] { si + 1, ei + 1 };

	}
}
