package StartLearningJava;

public class globalVariable {

	static int myglobalvariable = 12345;
	
	public static void main(String[] args) {

		boolean status;

		status = true;
		
		boolean newstatus = false;
		
		System.out.println("My old status was "+status);
		System.out.println("My old status was "+newstatus);
		
		System.out.println("my global variable is "+myglobalvariable);

	}

}
