package searchingAndsorting;

public class BinarySearch {
	public static int binarySearch(int arr[], int x) {
		int start=0;
		int end= arr.length-1;
		while(start<=end){
			 int mid=(start+end)/2;
			if(x == arr[mid]) {
				return 1;
			}else if(x > arr[mid])
			      {
					start = mid+1;
				    }else {
					  end = mid-1;
				 }
				
		   }
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int index = binarySearch(arr,7);
		int index1=binarySearch(arr,11);
		System.out.println(index);
		System.out.println(index1);
		

	}

}
