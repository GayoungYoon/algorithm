class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count=0;
        char[] cstones = stones.toCharArray();        
        
        // bad sol
        // for(int i=0 ; i < cstones.length ; i++){
        //     if(jewels.contains(cstones[i]){ // char cannot be dereferenced error
        //         count++;
        //     }
        // }
        
        
        Set<Character> set = new HashSet<>();
        char[] cjewels= jewels.toCharArray();
        //  바로 스톤배열의 char와 보석배열(String)을 contain함수를 적용할수 없으니
        //  contain을 사용할 수 있는 set ds에 넣어주는 과정을 거친다.
        for(int i=0; i < cjewels.length ; i++){
            set.add(cjewels[i]);
        }
        
        for(int i=0 ; i < cstones.length ; i++){
            if(set.contains(cstones[i])){
                count++;
            }
        }
        
        
        
        return count;
    }   
}
