package leetcode.arrays;

import java.util.Arrays;

public class ArrayManipulation {

    //insert the given element in a correct position in an sorted array

    public static int[] insertToArray(int[] input,int x){
        int[] newArray = new int[input.length+1];

        int index =0;
        for(int i =0; i < input.length; i++){
            if(input[i] > x){
               index = i;
               break;
            } else {
                newArray[i] = input[i];
            }
        }
        newArray[index] = x; // [3,6,7]
        while(index < input.length){
            newArray[index+1] = input[index];
            index++;
        }
        return newArray;
    }

    public static void main(String[] args){
        int[] inputArr = {3,6,8,12,15};
        int target = 10;

        System.out.println (Arrays.toString(insertToArray(inputArr,target)));

    }

}
