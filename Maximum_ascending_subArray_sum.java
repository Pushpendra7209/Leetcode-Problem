public class Maximum_ascending_subArray_sum {
    public int maxAscendingSum(int[] arr) {
        int max = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                sum += arr[i];
            } else if (sum > max) {
                max = sum;
                sum = arr[i];
            } else {
                sum = arr[i];
            }
        }
        if (sum > max)
            max = sum;
        return max;
    }
}