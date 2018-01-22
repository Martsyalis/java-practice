import acm.program.*;



public class factorial2 extends ConsoleProgram {
	
	//private final static double SANTINEL=0.1 ;
	private static final int MAX_NUM = 4;

	public void run (){
		
//		println("this program calculates factorial for any entered integer.");
//		while(true) {
//		int n = readInt ("enter integer:");
//			if(n == SANTINEL){
//				println ("You're Welcome.");
//				break;
//			}
//			if(n>30) {
//				println("the value is too large");
//			
//			}
//			
//			println("the factorial is " + factorial(n));
//		}
	
	println ("this program displayes factorials");
	
	
	for (int i=0; i<MAX_NUM;i++) {
		println (i+"! = " + factorial(i) );
	}
	
	}
		
	
	
	private int factorial(int n) {
		int result = 1;
		
		for (int i= 1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	

}
