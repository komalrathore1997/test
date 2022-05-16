package com.prectise;

public interface actor {
    void act();
    void speck();
    default void comedy() {
    	System.out.println("i can do comedy");
    }
}

class Hero implements actor{
	public void act() {
		System.out.println("I can speck");
	}
	public void speck() {
		System.out.println("I can speck");
	}
	
}

class Villain implements actor{
	public void act() {
		System.out.println("I can speck");
	}
	public void speck() {
		System.out.println("I can speck");
	}
	public void rude() {
		System.out.println("I am rude");
	}
	
}
