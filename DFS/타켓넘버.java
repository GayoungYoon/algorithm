class Solution {
    
    public int num=0 , row = 0;
    public void dfs(int[] numbers, int number, int i, int target){
             
        if(i== this.row-1){
            if(number == target) {
                this.num++;
            }
            return;
        }else{
            dfs(numbers, number + numbers[i+1] , i+1 , target);
            dfs(numbers, number - numbers[i+1] , i+1 , target);
        }
        
    }
    
    
    public int solution(int[] numbers, int target) {
        this.row = numbers.length;
        dfs(numbers,numbers[0],0, target);
        dfs(numbers,numbers[0] *-1,0, target);
        return this.num;
    }
}
