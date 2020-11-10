package leetcode532;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,1,4,1,5};
		
		int k = 2;
		
		System.out.println("Nums: " + Arrays.toString(nums) + " k: " + k);
		
		FindNumbersOfUniquePairsFunction solution = new FindNumbersOfUniquePairsFunction();
		
		System.out.println("Solution: " + solution.findPairs(nums, k));
	}
}
