class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        
        for(String op : ops){
            switch(op){
                case "+":
                    int x = st.pop();
                    int y = st.pop();
                    st.push(y);
                    st.push(x);
                    st.push(x+y);
                    break;
                case "D":
                    int z = st.peek();
                    st.push(z*2);
                    break;
                case "C":
                    st.pop();
                    break;
                default:
                    st.push(Integer.parseInt(op));
                    break;
            }
        }
        
        int sc = 0 , len = st.size();
        for ( int i = 0 ; i < len ; i++){
            sc += st.pop();
        }
        
        return sc;
    }
}
