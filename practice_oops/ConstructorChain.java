package practice_oops;

 class ConstructorChain1 
 {
		//default constructor
	 private ConstructorChain1() {
		 
//		this(5);
		System.out.println("constructor string called");
	}
 
	   
//	   Parameterized constructor
//	   ConstructorChain1(int i)
//	   {
//		   this(0,7);
//		   System.out.println("con int");
//		   
//	   }
//	   ConstructorChain1(int i,int j)
//	   {
//		   System.out.println("int,int");
//	   }
	   public static void main(String[] args) {
		ConstructorChain1 a = new ConstructorChain1() ;  
		ConstructorChain1 b = new ConstructorChain1() ;  
		
	}
}
