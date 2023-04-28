import java.util.ArrayList;
import java.util.List;
public class Permutation_II {
    public static void main(String[] args) {
        int arr [] ={1,2,1};
        List<List<Integer>> res = permutaion( arr);
        System.out.println(res);
    }

    public static List<List<Integer>>  permutaion(int arr[])
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, arr, 0);
        return res;
    }
    public static void backtrack(List<List<Integer>> list, int arr[] , int s)
    {
        if(s == arr.length){
            if(!list.contains(tolist(arr))){
                list.add(tolist(arr));
            }
        }
        for(int i=s ; i<arr.length; i++){
            swap(i,s, arr);
            backtrack(list, arr, s+1);
            swap(i, s, arr);
        }
    }
    public static void swap(int i, int j, int arr[]){
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }

    public static List<Integer> tolist(int arr[]){
        List<Integer> res = new ArrayList<>();
        for(int i =0; i<arr.length; i++)
        {
            res.add(arr[i]);
        }
        return res;
    }
}
