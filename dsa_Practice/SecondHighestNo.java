package dsa_Practice;

public class SecondHighestNo {
	public static  int secondHighest(int arr[]) {
		int temp;int n=arr.length;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++)
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		return arr[n-2];
	}
public static void main(String[] args) {
	int arr[]= {12,33,34,14,56};
	System.out.println(secondHighest(arr));
}

}
