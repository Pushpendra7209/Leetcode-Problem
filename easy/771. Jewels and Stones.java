class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i=0; i<jewels.length(); i++)
        {
            list.add(jewels.charAt(i));
        }
        int c = 0;
        for(int i=0; i<stones.length(); i++)
        {
            if(list.contains(stones.charAt(i))){
                c++;
            }
        }
        return c;
    }
}
