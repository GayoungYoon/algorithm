import java.util.*;

class Solution {
    
    public boolean visited[];
    public int row;
    public void dfs(int[][] computers, int x){
        
        for(int y = 0 ; y < this.row ; y++){
            if(computers[x][y]==1 && !visited[y]){
                visited[y]= true; // 탐색이 끝난 지점에서 dfs를 호출해야함을 잊지 말자
                dfs(computers, y);
            }
        }
        
    }
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        this.row = n;
        int answer = 0 ;
        for(int x = 0 ; x < n ; x++) {
            if(!visited[x] && computers[x][x]!=0) {
                visited[x]= true;
                answer++;
                dfs(computers,x);
            }
        }
        return answer;
    }
}
