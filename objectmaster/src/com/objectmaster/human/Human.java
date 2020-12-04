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
		System.out.println("Loadout: No class |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "HP");
	}
	
	public int gainHealth(Human person, int num) {
		return person.health += num;
	}
	private void lossHealth(Human person, Human person2, int num) {
		person2.health -= num;
		System.out.println(person2.name + " was attacked by " + person.name + " and lost " + num + "HP of Health!");
	}
	private void flossHealth(Human person, Human person2, int num) {
		person2.health -= num;
	}
	public void sideEffect(int num) {
		this.health -= num;
	}
	
	public void attack(Human person, Human person2) {
		person2.lossHealth(person, person2, this.strength);
	}
	public void attack(Human person, Human person2, int num) {
		person2.lossHealth(person, person2, num);
	}
	public void fattack(Human person, Human person2, int num) {
		person2.flossHealth(person, person2, num);
	}
}
