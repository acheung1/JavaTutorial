import Phone.Phone;
import Phone.SmartPhone;

public class Main {

	// object 
	// .class instanceof
	public static void main(String[] args) {
		
		// Creating an instance(object) of class Phone
		Phone phoneA = new Phone(911, "Police Department");
		
		// Creating a object that is the child class of Phone
		SmartPhone phoneB = new SmartPhone(911, "Police Department 1"); 
		
		// proving that SmartPhone is child class of Phone
		System.out.println(phoneB instanceof Phone);
		
		// Every class is a child of the Object class
		System.out.println(phoneB instanceof Object);
		
		
		System.out.println(phoneA.call());

		// overidding of call()
		System.out.println(phoneB.call());

		
		// char array
		char[] charArray = {'a', 'b', 'c'};
		char[] charArray2 = new char[3];
		charArray2[0] = 'a';
		charArray2[1] = 'b';
		charArray2[2] = 'c';
		
		// String methods
		String str = new String("string");
		System.out.println(str.charAt(3)); // prints 'i'
		System.out.println(str.compareTo("string") == 0); // prints true
		System.out.println(str.substring(0, 2)); // prints 'st', first index is inclusive, second index is exclusive

		
		StringBuffer strBuff = new StringBuffer("A");
		strBuff.append("B");
		strBuff.append("C");
	
		
		System.out.println(strBuff.toString()); // prints 'ABC'		
	}

}
