package com.pranrfl.getwell.LeetCodePractice;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){

        Stack<Character> st = new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='(' || c=='{' || c=='['){
                st.push(c);
            }
            else {
                if (st.empty() || (st.peek()== '(' && c !=')') || (st.peek()== '{'&& c !='}') || (st.peek()== '['&& c !=']')){
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
