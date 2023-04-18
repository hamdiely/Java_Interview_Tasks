package hashTableTasks;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        System.out.println(subArraySum(arr,9));

    }
    public static int subArraySum(int [] nums, int target){ //{2, 3, 4, 5}  target 9


        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Initialize the map with sum=0 and count=1
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];//2,5,9,14
            if (map.containsKey(sum - target)) {//5
                {
                    count += map.get(sum - target); // Add the count of subarrays that have sum = k count=2
                    //=9-9=1,14-9=5,1

                }
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return count;
    }}

