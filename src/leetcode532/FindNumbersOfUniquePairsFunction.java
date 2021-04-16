package leetcode532;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindNumbersOfUniquePairsFunction {
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 0){
            return 0;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            // When k is 0, which mean the pair have to be the same number
            if(k == 0){
                // Counting how many elements in the array that appear more than 2 times since they have to be unique
                if(entry.getValue() >= 2){
                    count++;
                }
            } else {
                if(map.containsKey(entry.getKey() + k)){
                    count++;
                }
            }
        }
        
        // Use two hashset instead.
        return count;
    }
    
    public int findPair2(int[] nums, int k) {
		if (k < 0) {
			return 0;
		}

        Set<Integer> starters = new HashSet<Integer>();
        Set<Integer> uniqs = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqs.contains(nums[i] - k)) starters.add(nums[i] - k);
            if (uniqs.contains(nums[i] + k)) starters.add(nums[i]);
            uniqs.add(nums[i]);
        }

        return starters.size();
    }
}
