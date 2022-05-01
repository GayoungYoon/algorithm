import java.util.*;

class Solution {
    
    
    List<String> list = new ArrayList<>();
    HashMap<String, String> uIdToUName = new HashMap<>();
    
    
    public String getStringWithUid(String action , String uid, String uName){
           
        
        String rtStmt="";
        
        switch(action){
            case "Enter" :
                uIdToUName.put(uid,uName);
                rtStmt= uid+"님이 들어왔습니다.";
                break;
            case "Leave" :
                rtStmt= uid+"님이 나갔습니다.";
                break;
            case "Change" :
                uIdToUName.put(uid,uName);
                break;
        }
        
        return rtStmt;
    }
    
    
    public String[] solution(String[] record) {
        
        
        for(int i = 0 ; i < record.length ; i++){
            String[] str = record[i].split(" ");
            String strWithUid="";
            if(str.length == 2 ){
                strWithUid=getStringWithUid(str[0] , str[1], "");
            }else{
                strWithUid=getStringWithUid(str[0] , str[1], str[2]);
            }
            
            if(!"".equals(strWithUid)) list.add(strWithUid);
        }
        
        String[] answer = new String[this.list.size()];
        
        for(int i = 0 ; i < this.list.size() ; i++){
            String str = this.list.get(i);
            int idx = str.indexOf("님");
            String uid = str.substring(0,idx);
            answer[i] = uIdToUName.get(uid) + str.substring(idx, str.length());
        }
        
        return answer;
    }
}
