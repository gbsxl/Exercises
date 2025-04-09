import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("k:"+removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length-1; i++) {
            for (int j = 1; j < nums.length-1; j++) {
                if (nums[i] == nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[j] = aux;
                }
            }
        }
        System.out.println("nums: " + Arrays.toString(nums));
        return k;
    }
}
