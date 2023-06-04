public class Lexicographically_smallest_palindrome {
    public String makeSmallestPalindrome(String s) {
        int n = s.length();
        int i, j;
        if(n % 2 == 0){
            i = n/2 -1;
            j = n/2;
        }
        else{
            i = n/2;
            j = n/2;
        }
        char arr[] = s.toCharArray();
        while(i>=0 && j<n)
        {
            if(arr[i] == arr[j]){
                i--;
                j++;
                continue;
            }
            else if(arr[i] > arr[j])
            {
                arr[i] = arr[j];
            }
            else{
                arr[j] = arr[i];
            }
            i--;
            j++;
        }
        return  String.valueOf(arr);
    }
}
