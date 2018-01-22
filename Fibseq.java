import acm.program.*;
public class Fibseq extends ConsoleProgram {

	private static final int MAX_NUM = 10000; 
	public void run(){
		println ("this program lists the Fibonacci squence up to " +MAX_NUM);
		runFibonacci(MAX_NUM);
	}
	
	
	
	private void runFibonacci(int x) {
		int f1= 0;
		int f2= 1;
		println (f1);
		println(f2);
		while((f1+f2)<x) {
			int f3=f1+f2;
			println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
