public class BubbleSort {
	
	static void bubbleSort(int n,int[] arr) {
		for(int i=n-1;i>=0;i--) {
			int didSwap = 0;
			for(int j=0;j<=i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {43,53,9,12,4};
		int n = arr.length;
		bubbleSort(n,arr);
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
}
