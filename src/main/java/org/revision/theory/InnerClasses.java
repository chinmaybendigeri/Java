package org.revision.theory;


import java.util.ArrayList;
import java.util.Arrays;

class OuterClass{
    int outerVariable;

    class Inner{
        int innerVariable;

        int getInnerVariable(){
            return this.innerVariable;
        }

        void setInnerVariable(int x){
            this.innerVariable = x;
        }

        void printInner(){
            System.out.println ("Inside the inner class");
        }

        int getOuterVariableFromInner(){
            return outerVariable;
        }

        void setOuterVariableFromInner(int x ){
            setOuterVariable (x);
        }
    }

    static class StaticInnerClass{
        static int staticVariable;
        final int finalStaticVariable = 10;

        int getStaticVariable(){
            return staticVariable;
        }

        void setStaticVariable(int x){
            staticVariable = x;
        }

        void printStaticVariable(){
            System.out.println ("Inside the static inner class");
        }


        int getStaticFinalVariable(){
            return finalStaticVariable;
        }
    }

    void setOuterVariable(int x){
        this.outerVariable = x;
    }

    int getOuterVariable(){
        return this.outerVariable;
    }

    void printOuter(){
        System.out.println ("Inside the outer class");
    }

    Inner createInnerClass(){
        int createVariable;
        final int finalCreateVariable;
        Inner newInner = this.new Inner ();
        return newInner;
    }

    StaticInnerClass createStaticInnerClass(){
        int createStaticVariable;
        final int finalStaticCreateVariable = 200;
        StaticInnerClass newStaticInner = new StaticInnerClass ();
        StaticInnerClass.staticVariable = 500;
        System.out.println (newStaticInner.getStaticVariable ());
        return newStaticInner;
    }
}

class NewOuter extends OuterClass{

}

public class InnerClasses {
    public static void main(String args[]){
        OuterClass outerClass = new OuterClass ();

        OuterClass.StaticInnerClass staticInnerClass= new OuterClass.StaticInnerClass(); // static classes should not be instantiated
        staticInnerClass.setStaticVariable (99);
        System.out.println (staticInnerClass.getStaticVariable ());

        System.out.println (staticInnerClass.finalStaticVariable);


        OuterClass.Inner innerClass = outerClass.new Inner (); // Inner classes should be instantiated
        System.out.println (innerClass.getOuterVariableFromInner ());
        innerClass.getOuterVariableFromInner ();

        innerClass.setOuterVariableFromInner(100);
        System.out.println (innerClass.getOuterVariableFromInner ());

        OuterClass.StaticInnerClass newStaticInner = outerClass.createStaticInnerClass ();
        System.out.println (newStaticInner.getStaticVariable ());
        System.out.println (staticInnerClass.getStaticVariable ());

        NewOuter newOuter = new NewOuter ();
        newOuter.outerVariable = 56;


    }
}

