package searchingAndsorting;

public class SelectionSort {
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}

	public static void main(String[] args) {
		
		int[] arr= {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = arr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest = 0;
			
			for(int i=1; i<=lastUnsortedIndex; i++) {
				if(arr[i] > arr[largest]) {
					largest = i;
				}
			}
 			swap(arr, largest, lastUnsortedIndex);
			
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
