package patterns;

public class A {

	public static void main(String[] args) {
         int n=5;
         int i=1;
         int count=1;
         while(i<=n) {
        	 int j=1;
        	 while(j<=i) {	
        		 
        		 System.out.print(count++ + " ");
        		 j++;
        	 }
        	 System.out.println();
        	 i++;
         }

	}

}
