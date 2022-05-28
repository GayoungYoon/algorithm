import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> releaseQ = new LinkedList<>();
        
        for(int i = 0 ; i < progresses.length ; i++){
            int restWork = 100 - progresses[i];
            int speed = speeds[i];
            if(restWork%speed==0){
                releaseQ.add(restWork/speed);    
            }else{
                releaseQ.add((restWork/speed) + 1);
            }
            
        }
        
        int releaseCnt = 1;
        int releaseDay = releaseQ.remove();
        while(!releaseQ.isEmpty()){
            int releaseDayOfSubwork = releaseQ.remove();
            if(releaseDay >= releaseDayOfSubwork){ // 다음 작업 같이 배포 가능
                releaseCnt++; // 같이 배포할 프로그램 수 증가
            }else{
                answer.add(releaseCnt);
                releaseCnt=1;
                releaseDay = releaseDayOfSubwork;
            }
            
            if(releaseQ.isEmpty()){ // 마지막작업이면
                answer.add(releaseCnt); // 여태까지 가지고있던 반영프로그랫 갯수 전체 배포
            }
            
        }
        
        
        int[] answer2 = new int[answer.size()];
        for(int i = 0 ; i < answer.size() ; i++){
            answer2[i] = answer.get(i);
        }
        
        return answer2;
    }
}
