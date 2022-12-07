package dsa_Practice;

public class SpiralPrint {
     public static void printSpiral(int input [][]) {
    	 int row=input.length;
    	 if(row==0) {
    		 return;
    	 }
    	 int col=input[0].length;
    	 int rowStart=0;
    	 int colStart=0;
    	 int numElement=row*col; int count=0;
    	  
    	 while(count<numElement) {
    	 for(int i=colStart; count<col && i<numElement; i++) {
    		 System.out.println(input[rowStart][i]+" ");
    		 count++;
    	 }
    	 rowStart++;
    	 for(int i= rowStart; count < numElement && i<row;i++) {
    		System.out.println(input[i][col-1]+" ");
    		count++;
    	 }
    	 col--;
    	 for(int i=col-1; count < numElement && i>=colStart; i--) {
    		 System.out.println(input[row-1][i]+" ");
    		 count++;
    	 }
    	 row--;
    	 for(int i =row-1; count <numElement && i >=rowStart; i--) {
    		 System.out.println(input[i][colStart]+" ");
    		 count++;
    	 }
    	 colStart++;
     }
     }

     public static void main(String[] args) {
		int input[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	    
	
		
     }
}
