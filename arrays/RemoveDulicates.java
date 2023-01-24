package arrays;

public class RemoveDulicates {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }  
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[n-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

	public static void main(String[] args) {
		int arr[]= {10,10,20,20,30,30,40,40,50,50};
		int arr1[]= {10,10,11,11,12,12};
		int length=arr.length;
		length = removeDuplicateElements(arr, length);
		length = removeDuplicateElements(arr1, length);
		for(int i=0;i<length; i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<length; i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
