//Created Date: May 18,2018
//Application: Practice Binary Search

package myMain;

public class BinarySearch {
	
	//Classical Binary Search
	//Question: Given a target integer T and an integer array A sorted in ascending order, 
	// find the index i such that A[i] == T or return -1 if there is no such index.
	//Time Complexity: O(logn);
	//Space Complexity: O(1);
	public static int binarySearch(int[] array, int target) {
		
		if(array == null || array.length == 0) return -1;
		int i = 0;
		int j = array.length - 1;
	    	
		while(i <= j) {			
			int mid = i + (j - i) / 2;
			if(array[mid] == target) {
				return array[mid];
			}
			else if(array[mid] > target) {
				j = mid - 1;
			}
			else if(array[mid] < target) {

				i = mid + 1;
			}				
		}	
		return -1;
	}
	
	//Question: ... find the index of the first occurrence of T in A ...
	//Time Complexity: O(logn);
	//Space Complexity: O(1);
	public static int binarySearch1stOcur(int[] array, int target) {
		
		if(array == null || array.length == 0) return -1;
		int i = 0;
		int j = array.length - 1;
		
		while(j > i + 1) {
			int mid = i + (j - i) / 2;
			if(array[mid] >= target) {
				j = mid;
			}
			else if(array[mid] < target) {
				i = mid;
			}			
		}		
		if(array[i] == target) return i; 
		else if(array[j] == target) return j;
		else return -1;		
	}
	
	//Question: ... find the index of the last occurrence of T in A ...
	//Time Complexity: O(logn);
	//Space Complexity: O(1);
	public static int binarySearchLastOcur(int[] array, int target) {
		
		if(array == null || array.length == 0) return -1;
		int i = 0;
		int j = array.length - 1;
		
		while(j > i + 1) {
			int mid = i + (j - i) / 2;
			if(array[mid] > target) { //!!! different than binarySearch1stOcur
				j = mid;
			}
			else if(array[mid] <= target) { //!!! 
				i = mid;
			}			
		}		
		if(array[j] == target) return j; //!!! 
		else if(array[i] == target) return i; //!!!
		else return -1;		
	}

	public static void main(String[] args) {
		
		int[] array = {1, 2, 4, 4, 4, 5, 7, 8, 10};
		int rst = -2;
		
		rst = binarySearch(array, 4);
		System.out.println(rst);
		
		rst = binarySearch1stOcur(array, 4);		
		System.out.println(rst);
		
		rst = binarySearchLastOcur(array, 4);		
		System.out.println(rst);
		
		int[] array1 = {7, 7, 7};
		rst = binarySearchLastOcur(array1, 7);		
		System.out.println(rst);				
	}
}
