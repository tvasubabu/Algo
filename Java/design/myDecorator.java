/*
 * date: 05-Apr-2019
 * @author - T Vasu Babu
 * 
 * Example of Decorator design pattern
 * 
 * References: Head First Design Patterns
 */

package design;

abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription()
	{
		return description;		
	}
	abstract public int cost();	
}

class Tea extends Beverage {
	Tea()
	{
		description = "Tea";
	}
	public int cost()
	{
		return 10;
	}
}

class Coffee extends Beverage {
	Coffee()
	{
		description = "Coffee";
	}
	public int cost()
	{
		return 20;
	}
}

abstract class CondimentDecorator extends Beverage {
	abstract public int cost();	
}

class Chocolate extends CondimentDecorator {
	Beverage b1;
	
	Chocolate(Beverage b1)
	{
		this.b1 = b1;
	}
	
	public String getDescription()
	{
		return ("Chocolate" + " + " + b1.getDescription());
	}
	
	public int cost()
	{
		return (5 + b1.cost());
	}
}

class Sugar extends CondimentDecorator {
	Beverage b1;
	
	Sugar(Beverage b1)
	{
		this.b1 = b1;
	}
	
	public String getDescription()
	{
		return ("Sugar" + " + " + b1.getDescription());
	}
	
	public int cost()
	{
		return (2 + b1.cost());
	}		
}

public class myDecorator {
	public static void main(String[] args) {
		Beverage b1 = new Tea();
		
		System.out.println(b1.getDescription() + " " + b1.cost());
		
		b1 = new Chocolate(b1);
		
		System.out.println(b1.getDescription() + " " + b1.cost());
		
		b1 = new Sugar(b1);
		
		System.out.println(b1.getDescription() + " " + b1.cost());
	}	
}
