import acm.program.ConsoleProgram;

public class useCaunter extends ConsoleProgram {
	
	public void run(){
		counter count1= new counter(1000);
		counter count2 = new counter();
		
		println("count1 5 times");
		countFive(count1);
		
		println("count2 5 times");
		countFive(count2);
		
		println("count1 5 more times");
		countFive(count1);
	}
	
	
	private void countFive(counter m){
		for (int i=0;i<5;i++){
			println (m.nextValue());
		}
		
	}
	
	
	
}
