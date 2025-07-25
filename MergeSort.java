import java.util.ArrayList;

public class MergeSort {
	
	private static void merge(int[] arr, int low, int mid, int high) {
		
		ArrayList<Integer> temp = new ArrayList<Integer>();

		int left = low;
		int right = mid+1;
		while(left <= mid && right <= high) {
			if(arr[left]<= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp.get(i-low);
		}
	}
	
	private static void mergeSort(int[] arr, int low, int high) {
		if(low == high) {
			return;
		}
		
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	

	public static void main(String[] args) {
		int[] arr = {27, 3, 45, 19, 8, 12, 33, 5, 17};
		int n = arr.length;
		mergeSort(arr, 0,n-1);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}
