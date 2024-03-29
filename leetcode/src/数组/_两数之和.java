package 数组;

import java.util.HashMap;

/**
 * @author Laurus
 * @Description
 * @ClassName 数组._两数之和
 * @date 2023-05-10 21:39
 */
public class _两数之和 {

    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if(map.containsKey(target-nums[i])){
//                return new int[]{target - nums[i],i};
//            }else {
//                map.put(nums[i],i);
//            }
//        }
//        return new int[]{};

        //两数之和
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
              }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

