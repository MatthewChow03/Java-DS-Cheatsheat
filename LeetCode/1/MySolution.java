public class MySolution {
        public int[] twoSum(int[] nums, int target) {
        // Create hashmap for the value and index of elements we iterate over
        HashMap<Integer, Integer> map = new HashMap<>();
        // Loop through array
        for (int i = 0; i < nums.length; i++) {
            // Check if the complement of the current value is in the hashmap (7-2 -> complement 5)
            if (map.containsKey(target - nums[i])) {
                int[] ret = {i, map.get(target - nums[i])};  // return the index of the current value and complement
                return ret;
            } else {
                map.put(nums[i], i);    // put the current value and its index in the hashmap
            }
        }
        // example, inline array creation for shortening return
        return new int[]{0,0};  // shouldn't ever return this because input always valid
    }
}
