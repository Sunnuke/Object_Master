package com.objectmaster.loadoutclasses;

import com.objectmaster.human.Human;

public class Wizard extends Human {
//	Attributes
	public String loadout = "Wizard";
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	
//	Methods
	public void stats() {
		System.out.println("Loadout: " + this.loadout + " |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "HP");
	}
	
	public void heal(Human person) {
		this.gainHealth(person, this.intelligence);
		System.out.println(this.name + " healed " + this.intelligence + "HP of " + person.name + "'s health!");
	}
	
	public void fireball(Human person) {
		this.fattack(this, person, this.intelligence*3);
		System.out.println(this.name + " used Fire Ball on " + person.name + " and burned " + this.intelligence*3 + "HP of their health!");
	}
}
