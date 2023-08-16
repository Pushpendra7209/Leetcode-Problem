class Solution {
    public String convertToTitle(int columnNumber) {
     
        StringBuffer s = new StringBuffer();
      
        while(columnNumber-- > 0){
          int a = (columnNumber % 26);

            char add = (char)(a + 'A');
            
            s.append(add);
            
           
            columnNumber /=  26;
           
        }
        return s.reverse().toString();
    }
}
