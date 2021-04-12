package Phone;


// Parent class
public class Phone {
	public static int PHONE_COUNT = 1;
	// private keyword makes this instance variable inaccessible outside this class
	// use getters/setters
	private int number;
	private String ownerName;
	
	// default constructor
	// do not need to add this
	// java will use this constructor by default if not using any other constructor
	public Phone() {
		
	}
	
	// different constructor
	public Phone(int number, String ownerName) {
		// 'this' keyword refers to this class 
		this.number = number;
		this.ownerName = ownerName;
	}
	
	public String call() {
		PHONE_COUNT++;
		return "Ring! Ring!";
	}
	
	public String hangup() {
		return "I am hanging up on you.";
	}

	// getters and setters methods
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		if (number != other.number)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}

	@Override
	// overriding the Object class toString()
	public String toString() {
		return "Phone [number=" + number + ", ownerName=" + ownerName + "]";
	}
	
	// overloading
	public String toString(String recipent) {
		return "Phone [number=" + number + ", ownerName=" + ownerName + "] calling " + recipent;

	}
	
}
