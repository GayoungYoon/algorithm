class Solution {
    public String solution(String S) {
        String new_id="";

        //STEP 1 : 대문자를 소문자로 치환한다.
        new_id = S.toLowerCase();
        //STEP 2 : 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]","");
        //STEP 3 : 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        new_id = new_id.replaceAll("\\.{2,}",".");
        //STEP 4 : 마침표가 처음이나 끝에 위치하면 제거한다.
        new_id = new_id.replaceAll("^\\.|\\.$","");
        //STEP 5 : id가 빈값이면 new_id = "a"
        new_id = new_id == null || "".equals(new_id) ? "a" : new_id;
        //STEP 6 : id가 16자 이상이면 15개의 문자를 제외한 나머지 문자 제거
        new_id = new_id.length()>=16 ? new_id.substring(0,15) : new_id;
        new_id = new_id.replaceAll("\\.$","");
        //STEP 7 : id가 2자 이하라면 마지막 문자를 new_id의 길이가 3이 될 때 까지 반복
        if(new_id.length()<=2){
            while(new_id.length()!=3){
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
}
