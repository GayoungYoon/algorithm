class Solution {
    
    public final int MAX_VAL = 987654321;
    public boolean visited[];
    public int answer = MAX_VAL;
    
    public boolean changable(String t, String u){
        int cnt=0;
        for(int i = 0 ; i < t.length() ; i++){
            if(t.charAt(i)==u.charAt(i)) cnt++;
        }
        return cnt==t.length() -1 ? true : false;
    }
    
    public void dfs(String begin, String target, String[] words, int cnt){
        
        if(begin.equals(target) && this.answer > cnt) {
            this.answer = cnt;
            return;
        }
        
        for(int i = 0 ; i < words.length ; i++){
            if(changable(words[i], begin) && !visited[i]){
                visited[i] = true;
                dfs(words[i], target, words, cnt+1);
                visited[i] = false;
            }
        }
        
    }
    
    
    public int solution(String begin, String target, String[] words) {
        this.visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return (this.answer == this.MAX_VAL) ? 0 : this.answer;
    }
}
