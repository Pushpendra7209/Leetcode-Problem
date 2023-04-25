import java.util.*;
public class Interval_List_intersection {
    public int[][] intervalIntersection(int[][] ft, int[][] st) {
        List<List<Integer>> lst = new ArrayList<>();
        if(ft.length == 0 || st.length== 0){
            int a[][]={};
            return a;
        }
        List<int[]> res = new LinkedList<>();
        int Aptr =0;
        int Bptr = 0;

        while(Aptr<ft.length && Bptr<st.length){
            int s1 = ft[Aptr][0] , e1 = ft[Aptr][1];
            int s2 = st[Bptr][0] , e2 = st[Bptr][1];

            if(s1 <= e2 && s2 <= e1){
                int start = Math.max(s1,s2);
                int end = Math.min(e1,e2);
                res.add(new int[]{start, end});
            }
            if(e1< e2){
                Aptr++;
            }
            else{
                Bptr++;
            }
        }
        return res.toArray(new int[][]{});
    }
}
