import java.util.*;

class Solution {
    
    public int num=0 , row=0;
    public int[] vstCom;
    
    public void bfs(int n, int[][] computers){
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int comnum = 0 ; comnum < this.row ; comnum++){
            if(vstCom[comnum]==0){
                q.add(comnum);
                this.num++;
                while(!q.isEmpty()){
                    int tcmnm = q.remove();
                    for(int y = 0 ; y < this.row ; y++){
                        if(vstCom[y]!=1 && computers[tcmnm][y]==1){
                            q.add(y);
                            vstCom[y]=1;
                        }
                    }
                }
            }
        }
        
    }
    
    public int solution(int n, int[][] computers) { // 2차원 배열을 입력 받지만 양방향 그래프이므로 bfs를 돌릴 때 1차원 Array로 체크를 하였다.
        this.row = n;
        vstCom = new int[this.row];
        Arrays.fill(vstCom,0);
        bfs(n, computers);
        return this.num;
    }
}
