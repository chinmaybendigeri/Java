package leetcode.sorting;

import java.util.Arrays;

public class MergeSortTwoArrays {

    public static int[] combineUnsortedArray(int arr1[],int[] arr2){
        int mergeSize = arr1.length + arr2.length;
        int[] mergedArr = new int[mergeSize];
        int i = 0;
        int j = 0;

        for(int k =0; k < mergeSize; k++){
            if (k < arr1.length) {
                mergedArr[k] = arr1[i];
                i++;
            } else{
                mergedArr[k] = arr2[j];
                j++;
            }
        }
        return mergedArr;
    }

    public static void mergeSort(int[] inputArr){
        int arrSize = inputArr.length;
        int pivot = arrSize/2;
        int i = 0;
        int j = 0;
        if(pivot < 1){
            return;
        }

        int[] left = new int[pivot];
        int[] right = new int[arrSize - pivot];

        for(int k = 0; k < arrSize; k++){
            if( k < pivot){
                left[i] = inputArr[k];
                i++;
            } else{
                right[j] = inputArr[k];
                j++;
            }
        }
        mergeSort (left);
        mergeSort (right);
        merge(left,right,inputArr);
    }

    public static void merge(int[] leftArr, int[] rightArr,int[] originalArray){
        int leftSize = leftArr.length;
        int rightSize = rightArr.length;

        int i = 0,j = 0;
        int k = 0;

        while(i < leftSize && j < rightSize){    // left [7] right[5]  mergedArray [5,7]
            if (leftArr[i] < rightArr[j]){
                originalArray[k] = leftArr[i];
                i++;
                k++;
            } else {
                originalArray[k] = rightArr[j];
                j++;
                k++;
            }
        }

        while(i < leftSize){
            originalArray[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightSize){
            originalArray[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args){
       int[] arr1 = {7,5,1,10,9};
       int[] arr2 = {3,8,2,6,4};
       //Merge the two arrays and print the sorted array in ascending

       int[] mergedUnsortedArr = combineUnsortedArray(arr1,arr2);
       System.out.println (Arrays.toString(mergedUnsortedArr));

       mergeSort(mergedUnsortedArr);
       System.out.println (Arrays.toString(mergedUnsortedArr));

    }
}
