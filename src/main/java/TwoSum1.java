import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		System.out.println(twoSum(nums, 6)[0]);

	}

	public static int[] twoSum(int[] nums, int target) {

		Map hm = new HashMap();
		hm.containsKey("");
		for (int i = 0; i < nums.length; i++) {

			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] {nums[i], nums[j]};
				}
			}
		}

	    throw new IllegalArgumentException("No two sum solution");
	}
	
}
