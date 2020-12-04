package com.objectmaster.loadoutclasses;

import com.objectmaster.human.Human;

public class Ninja extends Human {
	
	public String loadout = "Ninja";
	public void stats() {
		System.out.println("Loadout: " + this.loadout + " |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "%");
	}
	
	public Ninja() {
		this.stealth = 10;
	}
	
	public void steal(Human person) {
		this.attack(person, this.stealth);
		this.gainHealth(this, this.stealth);
		System.out.println(this.name + " stole " + this.stealth + "% of health from " + person.name + "!");
	}
	
	public void runAway() {
		this.attack(this, this.stealth);
		System.out.println(this.name + " ran away and lost " + this.stealth + "% of health!");
	}
}
