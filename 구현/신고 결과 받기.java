//https://programmers.co.kr/learn/courses/30/lessons/92334

import java.util.*;

class Solution {

    List<User> userList;
    int[] answer;

    class User {
        public String id ;
        public HashSet<String> reportedId = new HashSet<>();
        public int mailCnt=0;

        public User (String id){
            this.id = id;
        }

        public void setReportedId (HashSet<String> reportedId){
            this.reportedId = reportedId;
        }

        public String getId () { return this.id;}
        public void setReportedId(String id){
            this.reportedId.add(id);
        }

        public HashSet<String> getReportedId() {return this.reportedId;}
        public int getReportedIdCnt () { return this.reportedId.size();}

        public int getMailCnt() {
            return this.mailCnt;
        }

        public void setMailCnt(int cnt){
            this.mailCnt = cnt;
        }

    }

    public void reporting (String reportId, String reportedId){

        for(int i = 0 ; i < this.userList.size() ; i++){
            if(userList.get(i).getId().equals(reportedId)){
                User tpUser = userList.get(i);
                HashSet<String> temp = userList.get(i).getReportedId();
                temp.add(reportId);
                tpUser.setMailCnt(temp.size());
                tpUser.setReportedId(temp);
                userList.set(i, tpUser);
                break;
            }
        }

    }

    public int[] solution(String[] id_list, String[] report, int k) {
        answer = new int[id_list.length];
        this.userList= new ArrayList<>();
        HashMap<String, Integer> mailCnt = new HashMap<>();

        for(int i = 0 ; i < id_list.length ; i++){
            userList.add(new User(id_list[i]));
            mailCnt.put(id_list[i], 0);
        }
        for(int i = 0 ; i < report.length ; i++){
            String[] ids = report[i].split(" ");
            reporting(ids[0], ids[1]);
        }

        for(int i = 0 ; i < userList.size() ; i++){
            HashSet<String> temp = userList.get(i).getReportedId();
            if(temp.size() >=k){
                Iterator<String> it = temp.iterator();
                while(it.hasNext()){
                    String tp = it.next();
                    mailCnt.put(tp, mailCnt.get(tp) +1);
                }
            }
        }

        for(int i = 0 ; i < mailCnt.size(); i++){
            answer[i] = mailCnt.get(id_list[i]);
        }
        return answer;
    }
}
