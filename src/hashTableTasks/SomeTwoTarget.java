package hashTableTasks;

import java.util.*;

public class SomeTwoTarget {



        public static void main(String[] args) {

            int [] num={3,4,2,3};
            System.out.println(Arrays.toString(twoSum(num,6)));





        }

        public static  int[] twoSum(int[] nums, int target) { //{3,4,2},  6

            Map<Integer,Integer> myMap = new HashMap<>();




            for (int i = 0; i < nums.length; i++) {

                int complement = target-nums[i];

                if(myMap.containsKey(complement)){

                    return new int[] {myMap.get(complement),i};
                }
                myMap.put(complement,i);
            }
            return new int []{};
            }


        }

