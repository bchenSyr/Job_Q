/*
 * Created Date: May 18,2018
 * Question - Practice Classical Binary Search:
 * 	Given a target integer T and an integer array A sorted in ascending order, 
 * 	find the index i such that A[i] == T or return -1 if there is no such index.
 * 
 * Updated: June 3, 2018 : review 
 * 
 */

package BinarySearchRelated;

public class ClassicalBinarySearch {
	

	// Time Complexity: O(logn);
	// Space Complexity: O(1);
	public static int binarySearch(int[] array, int target) {		
		if (array == null || array.length == 0) {
			return -1;
		}
		int i = 0;
		int j = array.length - 1;	    	
		while (i <= j) {			
			int mid = i + (j - i) / 2;
			if (array[mid] == target) {
				return array[mid];
			}
			else if (array[mid] > target) {
				j = mid - 1;
			}
			else if (array[mid] < target) {
				i = mid + 1;
			}				
		}	
		return -1;
	  }
	
	public static void main(String[] args) {
		
		int[] array = {1, 2, 4, 4, 4, 5, 7, 8, 10};
		int rst = -2;
		
		rst = binarySearch(array, 4);
		System.out.println(rst);
					
	}
}
