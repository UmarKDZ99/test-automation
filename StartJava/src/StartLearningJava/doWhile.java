package StartLearningJava;

public class doWhile {

	public static void main(String[] args) {
		
		//* Same as while loop but logic will execute minimum once
		
		//* do
		//*{
		//* logic
		//*}
		//* while(condition)
		
		
		int ticket = 75;
		
		do {
			
			System.out.println("Current ticket number is"+ticket);
			ticket++;
			
		}
		while (ticket <= 100);
			
		
	}

}
