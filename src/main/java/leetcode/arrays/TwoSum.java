package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] inputArray,int target){
        HashMap<Integer, List<Integer>> hMap = new HashMap<> (); // created a list of Integers to hold multiple index of same value in an array

        for (int i=0; i < inputArray.length; i++){ // O(n) algorithm
            if(hMap.containsKey(inputArray[i])){
                List<Integer> duplicateKeys =  hMap.get(inputArray[i]);
                duplicateKeys.add(i);
            }else {
                List<Integer> nonDuplicateKeys = new ArrayList<> ();
                nonDuplicateKeys.add(i);
                hMap.put (inputArray[i],nonDuplicateKeys);
            }
        }
        System.out.println (hMap);

        for (int j=0; j < inputArray.length; j++){
            int rem = target - inputArray[j];
            if (hMap.containsKey(rem)) {
               List<Integer> indexList = hMap.get(rem);  // O(1) constant time algorithm and O(N) algorithm
               if(indexList.size() == 1) continue;    // edge case what if the target is 4, and you have element 2 present in the array..in that case need to avoid returning [0,0] index
               else {
                   int currentIndex = j;
                   List<Integer> list = indexList.stream().filter(x -> x!= currentIndex).toList ();
                  return new int[]{j, list.get(0)};
               }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){

        int[]  input = {2,1,3,2,1,8};
        int target = 4;

        int [] result = twoSum(input,target);
        System.out.println (Arrays.toString(result));

    }
}
