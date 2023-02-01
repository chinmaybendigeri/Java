package org.revision.theory;


public class VarArgs {

    int sum(int x,int... numbers){ // vargs paramter must be last in the paramater list
        int sum = 0;
        for(int n : numbers){
            sum = sum + n;
        }
        return sum;
    }

    public static void main(String[] args){
        VarArgs varArgs = new VarArgs ();
        System.out.println (varArgs.sum (1,2,3,5)); // we can integers list to varargs method

        int[] arrayOfIntegers = new int[5];
        arrayOfIntegers[0] = 5;
        arrayOfIntegers[1] = 10;
        arrayOfIntegers[1] = 20;

        System.out.println (varArgs.sum (5,arrayOfIntegers)); // we can pass integer array to varargs method
                                                                 // we can also pass custom objects to varargs method

    }
}
