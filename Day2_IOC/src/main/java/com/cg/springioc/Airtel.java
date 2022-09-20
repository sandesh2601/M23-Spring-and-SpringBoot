package com.cg.springioc;

public class Airtel implements Sim {
	
	//constructor 
	Airtel()
	{
		System.out.println("Airtel Constructor called");
	}

	public void calling() {
		System.out.println("CALLING USING AIRTEL");
		
	}

	public void data() {
		System.out.println("MOBILE DATA USING AIRTEL");
		
	}

	
}
