package com.objectmaster.loadoutclasses;

import com.objectmaster.human.Human;

public class Ninja extends Human {
//	Attributes
	public String loadout = "Ninja";
	public Ninja() {
		this.stealth = 10;
	}
	
//	Methods
	public void stats() {
		System.out.println("Loadout: " + this.loadout + " |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "HP");
	}
	
	public void steal(Human person) {
		this.attack(this, person, this.stealth);
		this.gainHealth(this, this.stealth);
		System.out.println(this.name + " stole " + this.stealth + "HP of health from " + person.name + "!");
	}
	
	public void runAway() {
		this.attack(this, this, this.stealth);
		System.out.println(this.name + " ran away and lost " + this.stealth + "HP of health!");
	}
}
