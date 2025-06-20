class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c == '[' || c == '{' || c == '(') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else if (st.peek() == '(' && c == ')' || st.peek() == '[' && c == ']' || st.peek() == '{' && c == '}') {
                    st.pop();
                }
                else{return false;}
            }
        }

        return (st.size() == 0) ? true : false;
    }
}
