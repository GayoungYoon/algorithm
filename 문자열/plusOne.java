class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        int[] inc = new int[len];
        int[] nwdg = new int[len+1];
        
        if(len==1){
            if(digits[len-1]==9){
                nwdg[0]=1 ; nwdg[1]=0;
                return nwdg;
            }else{
                digits[0]+=1;
                return digits;
            }
        }else{
            if(digits[len-1]==9){
                digits[len-1]=0;
                inc[len-2]=1;
            }else{
                digits[len-1] +=1;
            }
        }
        
        
        
        for(int i = len-2 ; i >= 1 ; i--) {
            int num = digits[i];
            if(num==9 && inc[i]==1){
                inc[i-1]=1;
                digits[i]=0;
            }else if(inc[i]==1){
                digits[i] +=1; 
            }
        }
        
        if(digits[0]==9 && inc[0]==1){
            nwdg[0] = 1;
            nwdg[1] = 0;
            for(int i = 1 ; i < len ; i++){
                nwdg[i+1] = digits[i];
            }
            return nwdg;
        }else if(inc[0]==1){
            digits[0]+=1;
            return digits;
        }else{
            return digits;
        }
        
        
    }
}
