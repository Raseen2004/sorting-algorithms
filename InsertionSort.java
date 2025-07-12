public class InsertionSort {
	
	static void insertionSort(int n, int[] arr) {
		for(int i=0;i<n;i++) {
			int j =i;
			while(j>0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j]  = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {43,53,9,12,4};
		int n = arr.length;
		insertionSort(n,arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
}
