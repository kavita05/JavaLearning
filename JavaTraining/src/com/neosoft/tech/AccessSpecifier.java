package com.neosoft.tech;

public class AccessSpecifier {
	/*Access Specifiers : Public, Private, protected,default
	 * Public : Accessible within project within multiple packages
	 * Private : Accessible within class
	 * Protected : 
	 * Default : we can't access it outside package*/
	
	//Default Member
	int default_number = 10;
	
	//Default member
	void defaultShow() {
		System.out.println("Default Member");
	}
	
	//public member 
	public int public_member = 20;
	
	//Public Method
	public void publicShow() {
		System.out.println("Public Method");
	}
	
	protected int protected_number = 30;
	
	//Protected Method
	protected void protectedShow() {
		System.out.println("Protected Method");
	}
	
	//private member
	private int privete_member = 40;
	
	//Private Method
	private void privateShow() {
		System.out.println("Private method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessTest object = new AccessTest();
		//you can access all 
	}
}
