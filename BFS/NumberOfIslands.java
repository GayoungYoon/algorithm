class Solution {
    
    public int row , col, num;
    public char[][] map ;

    int dx[] = { -1 , 0 , 1 , 0};
    int dy[] = { 0 , 1, 0 , -1} ;

    class Cord {
        public int x;
        public int y;

        public Cord(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX() { return this.x ; }
        public int getY() { return this.y ; }
    }

    public boolean isValid(int x, int y){
        boolean ret = false;
        ret = (  x >= 0 && x < this.row ) && (y >=0 && y < this.col) ? true : false;
        return ret;
    }

    public void bfs(char[][] grid){
        Queue<Cord> q = new LinkedList<>();

        for(int i=0 ; i < row ; i++){
            for(int j=0 ; j < col ; j++){

                if(grid[i][j]=='1' && map[i][j] !='1') {
                    q.add(new Cord(i,j));
                    this.map[i][j] ='1';
                    this.num++;
                    while(!q.isEmpty()){
                        Cord tpC = q.remove();
                        for ( int k = 0 ; k < 4 ; k++){
                            int tx = tpC.getX() + dx[k];
                            int ty = tpC.getY() + dy[k];
                            if(isValid(tx,ty) && grid[tx][ty]=='1' && map[tx][ty]!='1') {
                                q.add(new Cord(tx,ty));
                                this.map[tx][ty] = '1';
                            }
                        }
                    }

                }

            }
        }
    }
    

    public int numIslands(char[][] grid) {
        this.row = grid.length;
        this.col = grid[0].length;
        map = new char[this.row][this.col];
        for(int i = 0 ; i < this.row ; i++) Arrays.fill(map[i],'0');


        bfs(grid);
        return this.num;
    }
}
