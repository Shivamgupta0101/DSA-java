import java.util.*;
class Solution {

    public int removeElement(int[] nums, int val) {
      int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {  
                // Place element at 'count' index
                nums[count] = nums[i];
                
                // Increment count
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        // Create object of Solution class
        Solution obj = new Solution();

        // Input array
        int[] nums = {3, 2, 2, 3};

        // Value to remove
        int val = 3;

        // Call function
        int newLength = obj.removeElement(nums, val);

        // Print new length
        System.out.println("New Length: " + newLength);

        // Print updated array (only valid elements)
        System.out.print("Updated Array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
