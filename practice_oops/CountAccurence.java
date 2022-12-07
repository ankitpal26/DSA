package practice_oops;

public class CountAccurence {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,5,1,1,2,3};
		int fr[] = new int[arr.length];
		int visit=-1;
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;	
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit) {
				fr[i]=count;
			}
		}
		
      for(int i=0; i<fr.length;i++) {
    	  if(fr[i]!=visit)
    		  System.out.println( arr[i]+" " +"accurence" +" "+ fr[i]);
      }
	}

}
