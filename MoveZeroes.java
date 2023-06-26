import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int left = 0; // Pointer for non-zero elements

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // If the current element is non-zero, swap it with the left pointer
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        // Print the modified array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
