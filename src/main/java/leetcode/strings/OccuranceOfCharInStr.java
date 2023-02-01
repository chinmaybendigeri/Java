package leetcode.strings;

import java.util.HashMap;

public class OccuranceOfCharInStr {

    public static void findOccurance(String input){
        char[] inputChar = input.toCharArray();
        HashMap<Character,Integer> hMap = new HashMap<> ();

        for(char c : inputChar){
            if(hMap.containsKey (c)){
                int count = hMap.get(c);
                count++;
                hMap.put (c,count);
            }else {
                hMap.put (c,1);
            }
        }
       System.out.println (hMap);
    }

    public static void main(String[] args){
        String name = "Chinmay Bendigeri";

        findOccurance(name);
    }

}
