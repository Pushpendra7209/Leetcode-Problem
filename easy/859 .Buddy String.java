public boolean buddyStrings(String s, String goal) {
        //  int n = s.length();
        if (s.equals(goal)) {
            Set<Character> temp = new HashSet<>();
            for (char c : s.toCharArray()) {
                temp.add(c);
            }
            return temp.size() < goal.length(); 
        }

        int a = 0;
        int b = s.length()-1;
        while(a<s.length() && s.charAt(a)==goal.charAt(a)){
            a++;
        }
        while(b>=0 && s.charAt(b) == goal.charAt(b)){
            b--;
        }
         
        if(a<b){
            char [] p = s.toCharArray();
            char z = p[a];
            p[a] = p[b];
            p[b] = z;
            s = new String(p);
        }
       
        if(s.equals(goal)){
            return true;
        }
      
   
       return false;
    }
