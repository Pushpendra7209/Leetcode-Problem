class Solution {
    public boolean repeatedSubstringPattern(String sp) {
        if(sp.length() < 2){
            return false;
        }
    StringBuffer s = new StringBuffer(sp);
    //  s.append(sp);
     StringBuffer str = new StringBuffer();
     
     int n = s.length() / 2 ;
     int i = 0;
     while(i < n){
        str.append(s.charAt(i));
       StringBuffer p = new StringBuffer(str);
        while(p.length() <= s.length())
        {
            int c = 0;
            if(p.toString().equals(s.substring(0, p.length()).toString())){
                if(p.length() == s.length() ){
                    return true;
                }
                p.append(str);
            }
            else{
                break;
            }
        }
        i++;
     }  
     return false;
    }
}
