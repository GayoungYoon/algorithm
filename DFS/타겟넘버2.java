class Solution {
    
    
    public int dfs(int[] numbers, int target, int sum, int idx){
        
        if(idx == numbers.length ){ 
            // idx-1 까지 다 돌고 나서 length와 Idx가 같아졌을 때!
            if(sum==target) return 1; // 리턴해주는 값은 결국 카운팅이니까 1 아니면 0이다.
            else return 0;
        }
        
        return dfs(numbers,target, sum + numbers[idx] , idx+1) +  // 해당값을 더해주거나
                dfs(numbers,target, sum - numbers[idx] , idx+1) ; // 빼주거나
    }
    
    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
}
