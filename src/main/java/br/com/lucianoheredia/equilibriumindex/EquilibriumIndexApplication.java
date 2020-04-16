package br.com.lucianoheredia.equilibriumindex;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EquilibriumIndexApplication {

	public static void main(String[] args) {
		int[] nums = {-7, 1, 5, 2, -4, 3, 0};

		System.out.println(findEqIndexOfAnArray(nums));
	}

	public static Integer findEqIndexOfAnArray(int nums[]) {
		int sum = 0, leftSum = 0;
		for (int num : nums ) sum += num;

		for (int i = 0 ; i < nums.length; i++) {
			if (leftSum == sum - nums[i] - leftSum) return i;
			leftSum+= nums[i];
		}
		return -1;
	}


}
