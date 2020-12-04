package com.objectmaster.human;

public class Human {
//	Attributes
	public String name;
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
//	Methods
	public Human(String name) {
		this.name = name;
	}
	private void lossingHealth(Human person, int num) {
		this.name = name;
	}
	
	public void attack(Human person) {
		person.lossingHealth(person, this.strength);
	}
}
