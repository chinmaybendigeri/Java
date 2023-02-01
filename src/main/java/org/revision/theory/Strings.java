package org.revision.theory;

import java.util.ArrayList;

public class Strings {

    ArrayList<Integer> list = new ArrayList<Integer> ();

    public String toString () {
        System.out.println ("I am here in overridden method");
        return super.toString ();
    }

    public static  void main(String args[]){

        String str1 = "value1"; //Strings are immutable
        String str2 = "value2";
        for(int i = 0; i < 10 ; i++){
            str2 = str1 + str2;
            System.out.println (str2.hashCode ());
        }

        StringBuffer sb1 = new StringBuffer ("Value1"); // StringBuffer is mutable and thread safe whereas StringBuilder are also mutable but non thread safe
        for(int i = 0; i < 10 ; i++){
            sb1.append (str2);
            System.out.println (sb1.hashCode ());
        }
        Strings strings = new Strings ();
        strings.list.add (10);
        strings.toString ();



    }

}
