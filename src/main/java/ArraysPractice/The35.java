package ArraysPractice;

import java.util.Arrays;

public class The35 {
    public int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);


        int left = 0;
        int right = nums.length-1;
        int middle=0;
        if (target>nums[right]) return right+1;
        if (target<nums[left]) return 0;
        while (left<right){
            middle = (left+right)/2;
            if (nums[middle] == target) return middle;
            else if (nums[middle]<target) left = middle+1;
            else right = middle-1;
        }

        return right+1;
    }

    public static void main(String[] args) {
        int [] test = {1,3,5,6};
        The35 t = new The35();
        System.out.println(t.searchInsert(test,2));

    }
}
