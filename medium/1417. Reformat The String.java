class Solution {
    public String reformat(String s) {
        int c1 = 0;
        int c2 = 0;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i) < 60){
                c1++;
                a.append(s.charAt(i));
            }
            else{
                c2++;
                b.append(s.charAt(i));
            }
        }
        if(Math.abs(c1 - c2) > 1){
            return "";
        }
        StringBuilder ans = new StringBuilder();

        boolean flag = a.length() >= b.length() ? true : false;
        int j = 0;
        int k = 0;
        for(int i=0; i<s.length(); i++)
        {
            if(flag){
                ans.append(a.charAt(j));
                j++;
                flag=false;
            }
            else{
                ans.append(b.charAt(k));
                k++;
                flag = true;
            }
        }
        return ans.toString();
    }
}
