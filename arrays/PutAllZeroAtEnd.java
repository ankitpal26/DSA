package arrays;

public class PutAllZeroAtEnd {
	public static void pushZerosAtEnd(int[] arr) {
		int nonzero=0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[nonzero];
				arr[nonzero] = temp;
				nonzero++;
			}
		}
	}

	public static void main(String[] args) {
		 int[] array = {2,1,0,3,0,6,7,0,8,9,0,0};
		 pushZerosAtEnd(array);
		 for(int i = 0; i < array.length; i++) {
			 System.out.print(array[i]+" ");
		 }
		
      
	}

}
