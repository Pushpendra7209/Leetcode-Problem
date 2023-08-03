class Solution {
   public  List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if(digits.length() == 0){
            return ans;
        }
        HashMap<Character,String> hm = new HashMap<>();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");

        backtrack(digits,0,new StringBuilder(),ans, hm);
        return ans;
    }
    public static void backtrack(String s, int i, StringBuilder p, ArrayList<String> list, HashMap<Character,String> hm)
    {
        if(i == s.length()){
            list.add(p.toString());
            return;
        }
        String curr = hm.get(s.charAt(i));
        for(int j=0; j<curr.length(); j++){
            p.append(curr.charAt(j));
            backtrack(s, i+1, p, list, hm);
            p.deleteCharAt(p.length()-1);

        }
    }
}
