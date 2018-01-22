import acm.program.*;
import acm.util.*;
public class classesRandom extends ConsoleProgram {

	
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	
	public void run(){
		while (true){
			println ( "do you want to run another die?");
			int dieN= readInt ("what die do you want to roll (ex:d8)?:");
			println ("the result is: "+ rolldie(dieN));
			println ( "do you want to run another die?");
			if (readBoolean ( "do you want to run another die(Y/N)?: ", "N","Y")){
				break;
			}
		}
		
	}
	
	
	
	private int rolldie (int dieN){
	 int result= rgen.nextInt(1,dieN);
	 return (result);
	}
}
