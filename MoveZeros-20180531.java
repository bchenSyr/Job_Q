/*
*
* Created: May 31, 2018
* Question: Move zeros
*   Given an array nums, write a function to move all 0's to the end of it 
*   while maintaining the relative order of the non-zero elements.
*   You must do this in-place without making a copy of the array.
* Example: given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
*
*/

public class MoveZeros {

  // Time Complexity: O(n ^ 2)
  // Space Complexity: O(1)
  public int[] moveZeroes1(int[] nums) {
    int tail = nums.length - 1;
    int curr = 0;
    while(curr < tail) {      
      if(nums[curr] == 0) {
         for(int j = curr; j < tail; j++) {
        	int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
      	}
        tail--;
      } else {
        curr++;
      }
    }
    return nums;
  }
}
