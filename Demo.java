class Animal
{
	void eat()
	{
		System.out.println("Eating....");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking....");
	}
}
class BabyDog extends Dog
{
	void sleep()
	{
		System.out.println("Sleeping....");
	}
}
class Cat extends Animal
{
	void print()
	{
		System.out.println("I am cat");
	}
}
public class Demo
{
	public static void main(String args[])
	{
		BabyDog bd=new BabyDog();
		bd.sleep();
		bd.bark();
		bd.eat();
		Cat c=new Cat();
		c.print();
	}
}	