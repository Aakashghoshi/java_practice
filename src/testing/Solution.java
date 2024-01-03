package testing;


 public   class Solution {


     public static void main(String[] args) {
         int [] num = {3,2,6,4};
         int trg = 10;
         int[] result = twoSum(num,trg);
         for (int i : result)
             System.out.println(i);


     }

     public static int[] twoSum(int[] nums, int target) {
            int[] ans = new int[2];
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] == target- nums[i]) {
                        ans[0] = i;
                        ans[1] = j;
                        return ans;
                    }
                }
            }
            return ans;
        }


    }

