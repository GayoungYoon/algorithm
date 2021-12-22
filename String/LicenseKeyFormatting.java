class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-",""); // remove Dash
        System.out.println(s);
        
        s = s.toUpperCase();
        
        StringBuilder sb = new StringBuilder(s); //초기화할 때 s를 넣어줌으로써 String to StringBuilder로 convert
        for(int i=k ; i < s.length() ; i+=k){
            sb.insert(s.length() - i,"-");
        }
        
        return sb.toString();
        
        
        
    }
}
