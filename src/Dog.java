/*	Design and implement a class called Dog that contains instance data that represents
 *  the dog’s name and age. Define the Dog constructor to accept and initialize instance
 *  data. Include getter and setter methods for the name and age. Include a method to
 *  compute and return the age of the dog in “person years” (seven times the dogs age).
 *  Include a toString method that returns a one-line description of the dog. Create a
 *  driver class called Kennel, whose main method instantiates and updates several Dog
 *  objects.
 ***/

public class Dog
{
	private String name;
	private int age;

	public Dog(String name, int age)
	{
		this.setName(name);
		this.setAge(age);
	}

	public String getName()
	{
		return name;
	}

	private void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	private void setAge(int age)
	{
		this.age = age;
	}

	public int personYears()
	{
		return age * 7;
	}

	public String toString()
	{
		return "Boo!";
	}
}
