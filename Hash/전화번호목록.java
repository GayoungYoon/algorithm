import java.util.*;

class Solution {

    public HashSet<String> heads = new HashSet<>();

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i = 0 ; i < phone_book.length ; i++){
            heads.add(phone_book[i]);
        }

        for(int i = 0 ; i < phone_book.length ; i++){
            for(int j = 0 ; j < phone_book[i].length() ; j++){
                if(heads.contains(phone_book[i].substring(0,j))){
                    answer= false;
                    break;
                }
            }
        }

        // 효율성 실패 코드
        // for(int i = 0 ; i < phone_book.length ; i++){
        //     String phone_num = phone_book[i];
        //     for(int j = 0 ; j < phone_book.length ; j++){
        //         String num = phone_book[j];
        //         if(i!=j){
        //               if((num.length() >= phone_num.length())) {
        //                 if (num.substring(0,phone_num.length()).equals(phone_num)) {
        //                 answer = false;
        //                 break;
        //                 }
        //             }
        //         }
        //     }
        // }

        return answer;
    }
}
