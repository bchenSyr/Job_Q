// Created Date: May 16, 2018
// Application: Practice Merge Sort using recursion method

package myMain;

public class MergeSort {
	
	static int[] mergeSort(int[] array) {
		if(array == null) return null;
		if(array.length == 0) return array;	
		
		int[] aux = new int[array.length];
		mergeSort(array, aux, 0, array.length - 1);
		return array;		
	}
		
	static int[] mergeSort(int[] array, int[] aux, int lo, int hi) {
						
		if(lo == hi) return array;	
		int mid = lo + (hi - lo)/2;
		
		mergeSort(array, aux, lo, mid);
		mergeSort(array, aux, mid + 1, hi);
		merge(array, aux, lo, mid, hi);
		
		return array;
	}
	
	static void merge(int[] array, int[] aux, int lo, int mid, int hi) {
	
		for(int k = lo; k <= hi; k++) {
			aux[k] = array[k];
		}

		int i = lo;
		int j = mid + 1;
		
		for(int k = lo; k <= hi; k++) {
			if(i > mid) 
        array[k] = aux[j++]; 
			else if(j > hi) 
				array[k] = aux[i++];						
			else if(aux[i] <= aux[j]) 
				array[k] = aux[i++];	
			else 
				array[k] = aux[j++];	
		}
	}
	
	public static void main(String[] args) {
		int[] array = {};

		System.out.print("Original Array: ");
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.print("\n\n");
		
		mergeSort(array);
		
		System.out.print("\nFinal Array: ");
		for(int i: array) {
			System.out.print(i + " ");
		}	
	}
}
