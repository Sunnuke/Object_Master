package com.objectmaster.human;

public class Human {
//	Attributes
	public String name;
	private int strength = 3;
	private int stealth = 3;
	private int intelligence = 3;
	private int health = 100;
	
//	Methods
	public void nameHuman(String name) {
		this.name = name;
	}
	public void stats() {
		System.out.println("Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "%");
	}
	
	private void lossingHealth(Human person, int num) {
		person.health -= num;
		System.out.println(person.name + " was attacked by " + this.name + " and lost " + num + "% of Health!");
	}
	public void attack(Human person) {
		person.lossingHealth(person, this.strength);
	}
}
