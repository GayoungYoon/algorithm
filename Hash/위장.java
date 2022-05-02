import java.util.*;

class Solution {

    public int answer = 1;
    public HashMap<String, ArrayList<String>> items = new HashMap<>();

    public int solution(String[][] clothes) {

        for(int i = 0 ; i < clothes.length ; i++){
            String clthsTyp = clothes[i][1];
            String clthsNm = clothes[i][0];
            ArrayList<String> tpList = new ArrayList<>();
            if(items.get(clthsTyp)==null){
                tpList.add(clthsNm);
                items.put(clthsTyp, tpList);
            }else{
                tpList = items.get(clthsTyp);
                tpList.add(clthsNm);
                items.put(clthsTyp ,tpList);
            }
        }
        
        for(String key: this.items.keySet()){
            int size = this.items.get(key).size();
            this.answer *= size +1;
        }


        return this.answer -1;
    }
}
