//https://programmers.co.kr/learn/courses/30/lessons/77485


class Solution {
    
    public int[][] map;
    
    public int rotate(int[] cords){
        
        
        int min = 987654321;
        int frmX = cords[0] , frmY = cords[1], toX = cords[2] , toY = cords[3];
        int temp = map[frmX][toY];
        
        // 가로, 오른쪽으로 이동
        for (int y = toY ; y > frmY ; y--){
            map[frmX][y] = map[frmX][y-1];
            if(map[frmX][y] < min) min = map[frmX][y];
        }
        
        // 세로, 위쪽으로 이동
        for (int x = frmX ; x < toX ; x++ ){
            map[x][frmY] = map[x+1][frmY];
            if(map[x][frmY] < min) min = map[x][frmY];
        }
        
        // 가로, 왼쪽으로 이동
        for( int y = frmY ; y < toY ; y++){
            map[toX][y] = map[toX][y+1];
            if(map[toX][y] < min) min = map[toX][y];
        }
        
        // 세로, 아래로 이동
        for ( int x = toX ; x > frmX ; x--){
            map[x][toY] = map[x-1][toY];
            if(map[x][toY] < min) min = map[x][toY];
        }
        
        map[frmX+1][toY] = temp;
        if(temp < min) min = temp;
              
        
        return min;
    }
    
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        this.map = new int[rows+1][columns+1];
        int num = 1;
        
        for(int x = 1 ; x <= rows ; x++ ){
            for(int y = 1 ; y <= columns ; y++){
                this.map[x][y]= num++;
            }
        }

        for(int i = 0 ; i < queries.length ; i++){
            answer[i] = rotate(queries[i]);
        }
        
        return answer;
    }
}


