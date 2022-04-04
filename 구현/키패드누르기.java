//https://programmers.co.kr/learn/courses/30/lessons/67256

class Solution {
    
    public final int astar = 10, umul = 12;
    public int Left = astar, Right = umul;
    
    
    public int calc(int num, int hand){
        int cost = 0;
        if(num==0) num = 11; // 0은 11로 변환해서 계산
        if(hand==0) hand =11;
        
        int numRow = (num +2 ) / 3 , handRow = (hand +2 ) / 3; // 세로칸 이동
        cost += Math.abs(numRow - handRow); 
        
        int numCol = (num +2)% 3 , handCol = (hand +2)%3; // 가로칸 이동
        cost += Math.abs(numCol - handCol);
        
        return cost;
    }
    
    
    public String getHand(int num , String hand){
        switch(num){
            case 1:
            case 4:
            case 7:
                Left = num;
                return "L";
            case 3:
            case 6:
            case 9:
                Right = num;
                return "R";
            default:
                int leftCst = calc(num,Left) , rightCst = calc(num,Right);
                if ( leftCst == rightCst){
                    if(hand.equals("right")){
                        Right = num;
                        return "R";
                    }else{
                        Left = num;
                        return "L";
                    }
                }else if( leftCst > rightCst){
                    Right = num;
                    return "R";
                }else{
                    Left = num;
                    return "L";
                }
        }
    }
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        for(int i = 0 ; i < numbers.length ; i++){
            answer += getHand(numbers[i], hand);
        }
        return answer;
    }
}
