import java.util.*;

class Solution {
    public int n;

    public String[] solution(String[] strings, int n) {

        this.n = n;
        Arrays.sort(strings, new Comparator<String>(

        ) {
             @Override
            public int compare(String o1, String o2) {
                String o1c = Character.toString(o1.charAt(n)); //##1
                String o2c = Character.toString(o2.charAt(n));

                if(o1c.equals(o2c)){ //##2
                    return o1.compareTo(o2); // ##3
                }else{
                    return Character.toString(o1.charAt(n)).compareTo(Character.toString(o2.charAt(n)));
                }


            }
        });

        return strings;
    }
}
