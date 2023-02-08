class Fruits_into_baskets {
    public int totalFruit(int[] fruits) {
        if(fruits.length <3){
            return fruits.length;
        }
        int max=0;
        for(int i=0; i<fruits.length-1; i++){
           
            int count=0;
            while(fruits[i]==fruits[i+1]){
               
               
               
                 if(i==fruits.length-2){
                    
                    break;
                }
                 count++;
                i++;
            }
          int   a = fruits[i];
           int  b = fruits[i+1];
            for(int j=i; j<fruits.length ; j++){
                if(fruits[j]!=a && fruits[j]!=b){
                   break;
                }
                else{
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}