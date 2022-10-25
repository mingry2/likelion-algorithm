package class1021;

import java.util.Stack;

public class SolveBracket {

    public boolean solution1(String s){
        while (s.indexOf("()") >= 0) {
            s = s.replaceAll("\\(\\)", "");
        }

        return s.length() == 0;

    }
    public boolean solution2(String s){
        while (s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);
        }

        return s.length() == 0;
    }

    public boolean solution (String s) {
        Stack<String> st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if ('(' == s.charAt(i)) {
                st.push(s.valueOf(i));
            } else if (')' == s.charAt(i)) {
                // 첫번째 push가 ')' 이라 push가 아니라 pop을 해야하는데 스택이 비어있어서 pop을 못함 -> error 발생
                if(st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
}
