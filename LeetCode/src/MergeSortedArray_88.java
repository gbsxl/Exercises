import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n); // expected [1, 2, 2, 3, 5, 6]
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge = IntStream.concat(
                Arrays.stream(nums1, 0, m),
                Arrays.stream(nums2, 0 , n))
                .sorted().toArray();
        System.arraycopy(merge, 0, nums1, 0, merge.length);
    }
}