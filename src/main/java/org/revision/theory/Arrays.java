package org.revision.theory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arrays {

    public static void main (String[] args) {

        OuterClass.Inner[] innerArray = new OuterClass.Inner[5]; // Allocate an reference variable of size where each can point to an object of type OuterClass.Inner

        for (int i = 0; i < innerArray.length; i++) {
            innerArray[i] = new OuterClass ().new Inner ();
        }

        for (OuterClass.Inner inner : innerArray) {
            inner.printInner ();
        }

        List<OuterClass.Inner> innerArrayList = new ArrayList<OuterClass.Inner> ();
        innerArrayList.add (new OuterClass ().new Inner ()); // just added one object to an array list of OuterClass.Inner
        innerArrayList.forEach (inner -> inner.printInner ());

        int[][] _2darray = new int[2][3]; // 2 dimensional arrays
        _2darray[0][0] = 10;
        _2darray[0][1] = 20;
        _2darray[0][2] = 30;
        _2darray[1][1] = 40;

        for (int[] i : _2darray) {
            System.out.println (java.util.Arrays.toString (i)); // print contents of individual arrays
        }

        System.out.println (java.util.Arrays.deepToString (_2darray));

        List<Integer> list2 = new ArrayList<> ();
        list2.add (1);


    }
}
