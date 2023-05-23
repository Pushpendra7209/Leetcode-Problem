public class Find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int arr[] = new int[gain.length];
        int sum = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            arr[i] = sum;

        }
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }
        }
        return a;
    }
}
