package com.objectmaster.human;

public class Human {
//	Attributes
	public String name;
	public int health = 100;
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int count;
	
//	Methods
	public void nameHuman(String name) {
		this.name = name;
	}
	public void stats() {
		System.out.println("Loadout: No class |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "%");
	}
	
	public int gainHealth(Human person, int num) {
		return person.health += num;
	}
	private void lossHealth(Human person, int num) {
		person.health -= num;
		System.out.println(person.name + " was attacked by " + this.name + " and lost " + num + "% of Health!");
	}
	
	public void attack(Human person) {
		person.lossHealth(person, this.strength);
	}
	public void attack(Human person, int num) {
		person.lossHealth(person, num);
	}
}
