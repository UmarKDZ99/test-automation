package StartLearningJava;

//* Access Specifier static/non-static return-type method-name
//* For Static Method you have to write static, by default its non-static
//* Object has State & Behaviour
//* Umar/Real World Entity
//* State = Name, Phone Number, ID
//* Behaviour =  Coding, Learning, Driving

//* ClassName ObjectName = New Classname();
//* Calculator Calc = new Calculator();

//* Non Static methods will be called through an object using dot (.) operator
//* Static method can be called using class name directly using dot (.) operator


public class ObjectClassJava {
	
	int x = 90;
	int y = 100;

	public static void main(String[] args) {
				
		ObjectClassJava obj = new ObjectClassJava();
		obj.sum();
		
		System.out.println("Value of X is "+obj.x);
		System.out.println("Value of Y is "+obj.y);
		
		ObjectClassJava obj1 = new ObjectClassJava();
		obj1.sum();
		
	}

     public void sum()	
     {
    	 
    	int a = 90; 
    	int b = 80;
    	int c = b+a;
    	
    	System.out.println("Sum of Two Numbers Are " +c);
    	 
    	 
    	 
     }
	
}
