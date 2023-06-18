package org.example;

import java.util.*;

public class Check {

    public void Bracket(String s) {
        Stack<Character> arr = new Stack<>();
        int n = s.length();
        int f = 1;
        char p;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (IsLeftBracket(ch))
                arr.push(ch);
            else if (IsRightBracket(ch)) {
                if (arr.isEmpty()) {
                    f = 0;
                    break;
                }
                p = arr.pop();
                if (!(IsMatch(ch, p)))
                    f = 0;
            }
        }
        if (!(arr.isEmpty()) || f == 0)
            System.out.println("UnBalanced expression");
        else
            System.out.println("balanced Expression");
    }

    public boolean IsRightBracket(char ch) {
        if (ch == ')' || ch == '>' || ch == ']' || ch == '}')
            return true;
        else
            return false;
    }

    public boolean IsLeftBracket(char ch) {
        if (ch == ')' || ch == '>' || ch == ']' || ch == '}')
            return true;
        else
            return false;
    }

    public boolean IsMatch(char l, char r) {

        if (l == '}' && r != '{' ||
                l == ')' && r != '(' ||
                l == '>' && r != '<' ||
                l == ']' && r != '[')
            return true;
        else
            return false;
    }

}



public class Main {
    public static void main(String[] args) {
        Check obj = new Check();
        String s = "[1+<5>/(2*3)]";
        obj.Bracket(s);
    }
}
