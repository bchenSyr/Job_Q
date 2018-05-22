// Created Date: May 21, 2018
// Application: Practice Quick Sort

package myMain;

import java.util.Random;

public class QuickSort {
	
	public void quickSort(int[] array) {
		if(array == null || array.length == 0) return;
		quickSort(array, 0, array.length - 1);
	}

	private void quickSort(int[] array, int left, int right) {
		
		if(left >= right) return;
		// define a pivot and use it to partition the array
		int pivotPos = partition(array, left, right);
		
		// do the recursive call on the two partitions
		quickSort(array, left, pivotPos - 1);
		quickSort(array, pivotPos + 1, right);		
	}
	
	private int partition(int[] array, int left, int right) {	
		
		// randomly select a pivot index from the part to be partitioned
		Random rand = new Random();
		int pivotIndex = left + rand.nextInt(right - left + 1); 
		int pivot = array[pivotIndex];
		
		// swap the pivot element to the rightmost element first
		swap(array, pivotIndex, right);
		
		int i = left;
		int j = right - 1;
		
		while(i <= j) {
			if(array[i] <= pivot) {
				i++;
			} else {
				swap(array, i, j);
				j--;
			}
		}
		
		// swap back the pivot element
		swap(array, i, right);	
		
		return i;
	}
	
	
	private void swap(int[] array, int a, int b) {		
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {20, 18, 5, 21, 8, 4, 4};
		QuickSort myQuickSort = new QuickSort();
		myQuickSort.quickSort(array);
		for(int i : array) {
			System.out.print(i + " ");
		}
	}
}
