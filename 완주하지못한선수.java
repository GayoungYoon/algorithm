import java.util.HashMap;

public class Solution {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> participantList = new HashMap<>();
        String answer="";
        for(int i = 0 ; i < participant.length ; i++) participantList.put(participant[i], participantList.getOrDefault(participant[i],0) +1); //##1 getOrDefault
        for(int j = 0 ; j < completion.length ; j++) participantList.put(completion[j], participantList.get(completion[j]) -1);

        for(String key : participantList.keySet()){ // ##2 HashMap의 iterating 문법
            if(participantList.get(key)!=0){
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main (String[] args){
        String[] participant={"mislav", "stanko", "mislav", "ana"};
        String[] completion={"stanko", "ana", "mislav"};
        System.out.println("######start#########");
        System.out.println(solution(participant, completion));

    }

}
