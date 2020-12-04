package com.objectmaster.human;

public class HumanTest extends Human {

	public static void main(String[] args) {
		Human person1 = new Human();
		person1.name = "First Inhuman";
		person1.stats();
		Human person2 = new Human();
		person2.name = "Test Dummy";
		person2.stats();
		
		person1.attack(person2);
		person1.attack(person2);
		person1.stats();
		person2.stats();
	}

}
