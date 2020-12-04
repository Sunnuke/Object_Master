package com.objectmaster.human;

import com.objectmaster.loadoutclasses.*;

public class HumanTest extends Human {

	public static void main(String[] args) {
		Human person1 = new Human();
		person1.name = "First Inhuman";
		person1.stats();
		Human person2 = new Human();
		person2.name = "Test Dummy";
		person2.health = 2000;
		person2.stats();
		Samurai person3 = new Samurai();
		person3.name = "Sam";
		person3.stats();
		Ninja person4 = new Ninja();
		person4.name = "Jinja";
		person4.stats();
		Wizard person5 = new Wizard();
		person5.name = "Zard";
		person5.stats();
		
		person1.attack(person1, person2);
		person1.attack(person1, person2);
		person5.fireball(person2);
		person5.heal(person2);
		person3.deathBlow(person1);
		person3.meditate();
		person3.howMany();
		person4.steal(person2);
		
		person1.stats();
		person2.stats();
		person3.stats();
		person4.stats();
		person5.stats();
	}

}
