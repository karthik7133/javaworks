package cat_2;

import java.util.*;
class wtsubstring{
    static int wtsubstring(String s1,String s2,int k,int n){
        
        HashSet<String> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            int sum = 0;//wt of each substring 
            String s = "";//storing all substrings 
            for(int j=i;j<n;j++){
                int pos = s1.charAt(j)-'a';
                int wt = s2.charAt(pos) - '0';
                sum = sum + wt;//add the wt of substring 
                s=s+s1.charAt(j);//add the substring
                if(sum<=k) hs.add(s);
                else break;
            }
        }
        return hs.size();
    }
    public static void main(String ar[]){
        Scanner sw = new Scanner(System.in);
        String s1 = sw.next();
        String s2 = sw.next();
        sw.nextLine();
        int k = sw.nextInt();
        int n = s1.length();
        System.out.print(wtsubstring(s1,s2,k,n));
    }
}
