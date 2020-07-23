package com.epam.DesignPatterns;

public class BuilderPattern {
	CakeType c1=new CoolCake();
	CakeType c2=new NormalCake();
	public BuilderPattern selectCake() {
		BuilderPattern bp=new BuilderPattern();
		return bp;
		
	}
	public void showItems() {
			System.out.println("TYPE OF CAKE :"+c1.cakeType());
			System.out.println("IS EGG ADDED ? : "+c1.egg());
			System.out.println("IS IT SUGRAFREE ?: "+c1.sugarFree());
			System.out.println("TYPE OF CAKE :"+c2.cakeType());
			System.out.println("IS EGG ADDED ? : "+c2.egg());
			System.out.println("IS IT SUGRAFREE ?: "+c2.sugarFree());
	}
}
