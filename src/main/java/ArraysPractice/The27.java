package ArraysPractice;

public class The27 {
    public int removeElement(int[] nums, int val) {
        int newIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=val) {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }
            return newIndex;

    }
    public static void main(String[] args) {
//        int [] nums = {0,1,2,2,3,0,4,2};
        int [] nums = {3,2,2,3};

        The27 test = new The27();
        test.removeElement(nums,3);

    }
}
