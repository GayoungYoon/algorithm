
class Solution {
    
    Map<Character, Character> pair = new HashMap<>();

    
    public boolean isValid(String s) {
        
        this.pair.put('{','}');
        this.pair.put('(',')');
        this.pair.put('[',']');
        
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(Character c : ch){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.size()==0) return false;
                else if (this.pair.get(st.peek()) != c) return false;
                else st.pop();
            }
        }
        
        if(st.size()==0) return true;
        else return false;
        
    }
}
