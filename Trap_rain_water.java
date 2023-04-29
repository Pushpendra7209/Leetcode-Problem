import java.util.Arrays;

public class Trap_rain_water {
    public static int rainwater(int arr[], int n) {
        int left[] = new int[n];
        int right[] = new int[n];
        int max1=0;
        for(int i=0; i<n; i++){
            left[i] = Math.max(max1,arr[i]);
            max1=left[i];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(arr));
        int max2=0;
        for(int i=n-1; i>=0; i--){
            right[i]  = Math.max(max2,arr[i]);
            max2=right[i];
        }
        System.out.println(Arrays.toString(right));
        int sum=0;
        for(int i=0; i<n; i++){
            int watercontain = Math.min(left[i],right[i]) - arr[i];
            sum += watercontain;
        }
        return sum;

    }
    public static void main(String[] args) {
        int arr[]={7,4,0,9};
        System.out.println(rainwater(arr,arr.length));
    }
}
