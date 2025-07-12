public class SelectionSort {
	
	static void selectionSort(int n, int[] arr) {
		for(int i=0;i<n-1;i++) {
			int min = i;
			
			for(int j=i;j<n;j++) {
				if(arr[j]< arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {43,53,9,12,4};
		int n = arr.length;
		selectionSort(n,arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}	
}
