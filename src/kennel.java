/*	Design and implement a class called Dog that contains instance data that represents
 *  the dog’s name and age. Define the Dog constructor to accept and initialize instance
 *  data. Include getter and setter methods for the name and age. Include a method to
 *  compute and return the age of the dog in “person years” (seven times the dogs age).
 *  Include a toString method that returns a one-line description of the dog. Create a
 *  driver class called Kennel, whose main method instantiates and updates several Dog
 *  objects.
 ***/

public class kennel
{
	public static void main(String[] args)
	{
		Dog rover = new Dog("Rover", 3);
		Dog benny = new Dog("Benny", 2);
		Dog leroy = new Dog("Leroy", 3);
		Dog coco = new Dog("Coco", 8);
		
		System.out.println(rover.getName() + " is " + rover.personYears() + " in person years.");
		System.out.println(benny.getName() + " is " + benny.personYears() + " in person years.");
		System.out.println(leroy.getName() + " is " + leroy.personYears() + " in person years.");
		System.out.println(coco.getName() + " is " + coco.personYears() + " in person years.");
	}
}
