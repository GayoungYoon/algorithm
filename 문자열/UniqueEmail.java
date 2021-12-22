import java.util.*;

class Solution {
	public int numUniqueEmails(String[] emails) {
	Set set = new HashSet<String>();

    for(String email : emails){
        String[] names = email.split("@");
        String[] localNames = names[0].split("\\\\+");
        String localName = localNames[0].replaceAll("\\\\.","");

        System.out.println(localName);
        String domainName = names[1];
        set.add(localName+"@"+domainName);
    }


    return set.size();
}
