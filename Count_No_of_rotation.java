package d;

public class Count_No_of_rotation {

	public static void main(String[] args) {
		int arr[] = {4,5,6,8,1,2,3};
		System.out.println("no of rotation : " + rotationCount(arr));
	}

	public static int rotationCount(int arr[]) {
		int pivot=findpivot(arr);

		return pivot+1;
	}
	public static int findpivot(int arr[]) {
		int s=0;
		int e=arr.length-1;
		while(s<=e) {
			int mid = s + (e - s)/2;
			if(mid < e && arr[mid] > arr[mid + 1]) {
				return mid;

			}
			if(mid > s && arr[mid] < arr [mid -1]) {
				return mid-1;
			}
			if(arr[s]>=arr[mid]) {
				e = mid - 1;
			}
			else {
				s = mid + 1;
			}
		}
		return -1;
	}
}
