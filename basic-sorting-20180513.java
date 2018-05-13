// Author: Beier Chen
// Application: practice three basic sorting algorithm
// Date: May 13, 2018

package SelectionSort;

public class SelectionSort {
	
	static void bubbleSort(int[] arr) {
		print(arr);
		for(int i = arr.length - 1; i > 0; i--) {
			
			for(int k = 0; k < i; k++) {
				
				if(arr[k] > arr[k+1]) {
					int temp = arr[k];
					arr[k] = arr[k+1];
					arr[k+1] = temp;
				}			
			}					
		}	
		print(arr);
	}
	
	static void selectionSort(int[] arr) {
		print(arr);
		
		int temp, index;
		
		for(int i = 0; i < arr.length; i++) {
			
			temp = arr[i];
			index = i;
			
			for(int k = i + 1; k < arr.length; k++) {
				if(arr[k] < temp) {
					temp = arr[k];
					index = k;
				}							
			}
			
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		
		print(arr);
	}
	
	static void insertionSort(int[] arr) {
		
		print(arr);
		
		for(int i = 0; i < arr.length; i++) {
			
			int temp = arr[i];
			
			for(int k = 0; k < i; k++) {
				
				if(temp <= arr[k]) {
					
					for(int j = i; j > k; j--) {
						
						arr[j] = arr[j-1];
					}				
					arr[k] = temp;	
					break;
				}				
			}
		}	
		
		print(arr);
	}
	
	public static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
	}
		
	public static void main(String[] args) {
		
		
		int[] arr = new int[]{2,0,1,8,0,5,13,18,27};
		
		bubbleSort(arr);
		
		arr = new int[]{2,0,1,8,0,5,13,19,12};
		selectionSort(arr);
		
		arr = new int[]{2,0,1,8,0,5,13,19,50};
		insertionSort(arr);
	}
}
