class Solution {

    public int row=0, col=0, num;
    public char[][] vst ;

    int[] dx = {-1 , 0 , 1, 0};
    int[] dy = {0 , 1, 0 , -1};

    public boolean isValid(int x, int y){
        return (x>=0 && x< this.row) && (y>=0 && y<this.col) ? true : false;
    }


    public void dfs(char[][] grid, int x, int y){

        for(int i = 0 ; i < 4 ; i++){
            int tx = x + dx[i]; int ty = y + dy[i];
            if(isValid(tx, ty) && grid[tx][ty] =='1' && vst[tx][ty]!='1'){
                vst[tx][ty]='1';
                dfs(grid, tx,ty);
            }
        }
    }


    public int numIslands(char[][] grid) {
        this.row = grid.length;
        this.col = grid[0].length;
        this.vst = new char[this.row][this.col];

        for(int i = 0 ; i < this.row ; i++){
            for(int j=0 ; j < this.col ; j++){
                if(grid[i][j]=='1' && vst[i][j]!='1') {
                    this.num++;
                    dfs(grid, i, j);
                }
            }
        }
        return this.num;
    }


}
