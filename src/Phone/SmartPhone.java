package Phone;

// child class of the Phone class
public class SmartPhone extends Phone {
	private String screenSize;
	private String modelName;
	private String brandName;
	private boolean is5G;
	
	public SmartPhone(int number, String ownerName) {
		// 'super' calls the parent class constructor
		super(number, ownerName);
	}
	
	public SmartPhone(int number, String ownerName, String screenSize, 
			String modelName, String brandName, boolean is5G) {
		super(number, ownerName);
		this.brandName = brandName;
		this.screenSize = screenSize;
		this.modelName = modelName;
		this.is5G = is5G;
		
	}
	
	// overriding 
	public String call() {
		return "Ring! from a Smartphone!";
	}

	public String getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public boolean isIs5G() {
		return is5G;
	}

	public void setIs5G(boolean is5g) {
		is5G = is5g;
	}
	

}
