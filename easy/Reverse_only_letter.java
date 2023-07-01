public class Reverse_only_letter {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int n = s.length();
        int a = n-1;
        while(i < n){
            if(Character.isLetter(s.charAt(i))){
                while(!Character.isLetter(s.charAt(a))){
                    a--;
                }
                sb.append(s.charAt(a));
                a--;
            }
            else{
                sb.append(s.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
