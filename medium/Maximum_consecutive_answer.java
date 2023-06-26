public class Maximum_consecutive_answer {
    public int maxConsecutiveAnswers(String s, int k) {
        int ans = 0 , ans2=0;
        int sp =0 ,sp2 =0;
        int ep = 0 , ep2=0;
        int n = s.length();
        int k2=k;
        while(ep < n){
            if(s.charAt(ep) == 'T'){
                ans = Math.max(ans,ep-sp+1);
            }
            else if(s.charAt(ep) == 'F'){

                --k;
                if(k>=0){
                    ans = Math.max(ans,ep-sp+1);
                }
                if(k < 0)
                {
                    while(s.charAt(sp) == 'T'){
                        sp++;
                    }
                    sp++;
                    k++;
                }
            }
            ep++;
        }

        while(ep2 < n){
            if(s.charAt(ep2) == 'F'){
                ans2 = Math.max(ans2,ep2-sp2+1);
            }
            else if(s.charAt(ep2) == 'T'){

                --k2;
                if(k2>=0){
                    ans2 = Math.max(ans2,ep2-sp2+1);
                }
                if(k2 < 0)
                {
                    while(s.charAt(sp2) == 'F'){
                        sp2++;
                    }
                    sp2++;
                    k2++;
                }
            }
            ep2++;
        }
        return Math.max(ans,ans2);
    }
}
