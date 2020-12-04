package com.objectmaster.loadoutclasses;

import com.objectmaster.human.Human;

public class Samurai extends Human {
//	Attributes
	public String loadout = "Samurai";
	public Samurai() {
		this.health = 200;
		this.count += 1;
	}
	
//	Methods
	public void stats() {
		System.out.println("Loadout: " + this.loadout + " |Name: " + this.name + " |Strength: " + this.strength + " |Stealth: " + this.stealth + " |Intelligence: " + this.intelligence + " |Health :" + this.health + "%");
	}
	
	public void deathBlow(Human person) {
		int h = this.health /= 2;
		person.attack(person, person.health);
		System.out.println(this.name + " hit " + person.name + " with a Death Blow and killed them! " + this.name + " lost " + h + "% of health in prefoming that attack!");
	}
	public void meditate() {
		int h = this.gainHealth(this, this.health/2);
		System.out.println(this.name + " meditated and regenerated " + h + "% of health!");
	}
	public void howMany() {
		System.out.println("There are " + this.count + " Samurai in this program!");
	}
}
