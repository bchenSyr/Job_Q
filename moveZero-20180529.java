// Created Date: May 29,2018
// Question: Move 0s To The End I (easy)
//  Given an array of integers, move all the 0s to the right end of the array.
//  The relative order of the elements in the original array does not need to be maintained.

public class Solution {
  public int[] moveZero(int[] array) {
    // Write your solution here
    if(array == null) return array;
    int i = 0;
    int j = array.length - 1;
    while(i < j) {
      if(array[i] == 0) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        j--;
      } else {
        i++;
      }
    }
    return array;
  }
}
