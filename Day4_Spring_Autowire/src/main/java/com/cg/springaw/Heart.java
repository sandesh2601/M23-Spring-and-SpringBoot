package com.cg.springaw;

public class Heart {
	
	private String nameofAnimal;
	private int noofHeart;
	
	
	public void pump()
	{
		System.out.println("HEART IS PUMPING");
	}


	public String getNameofAnimal() {
		return nameofAnimal;
	}


	public void setNameofAnimal(String nameofAnimal) {
		this.nameofAnimal = nameofAnimal;
	}


	public int getNoofHeart() {
		return noofHeart;
	}


	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}

}