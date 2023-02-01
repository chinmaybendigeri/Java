package leetcode.stacks;

import java.util.Stack;

public class BalancedExpression {

    public static boolean findBalancedExpression(String expr){
        Stack<Character> myStack = new Stack<> ();
        char[] inputCharArr =expr.toCharArray ();
        for(char c: inputCharArr) {
            if(c == '{' ||  c == '[' || c == '('){
                myStack.push (c);
            } else {
                if(c == '}'){
                  if(myStack.pop () != '{') return false;
                }
                if(c == ')'){
                    if(myStack.pop () != '(') return false;
                }
                if(c == ']'){
                    if(myStack.pop () != '[') return false;
                }
            }
        }
        return myStack.isEmpty ();
    }

    public static void main(String[] args){
        String expr = "[()]{[}()()";

        System.out.println (findBalancedExpression(expr));
    }
}
