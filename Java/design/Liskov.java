/*
 * Courtesy https://www.youtube.com/watch?v=i0qmhk41QVM&list=PLRnuLZZ5D0Kydj14q181Oxwsp7_8PvquY&index=4
 * It Helps remembering the Don example from above video
 */

package design;

interface liskovIPayment {
	void makePayment();
}

interface IWriteToDB {
	void write();
}

abstract class LiskovMember implements liskovIPayment {
	abstract public void makePayment();
	abstract public void write();
}

class AnnualMember extends LiskovMember {
	public void makePayment()
	{
		System.out.println("Calling make Payment from AnnualMember");
	}
	public void write()
	{
		System.out.println("Calling write from AnnualMember");
	}	
}

class LifeMember extends LiskovMember {
	public void makePayment()
	{
		System.out.println("Calling make Payment from LifeMember");
	}
	public void write()
	{
		System.out.println("Calling write from LifeMember");
	}	
}

class Enquiry implements IWriteToDB {
	public void write()
	{
		System.out.println("Calling write from Enquiry");
	}
}

public class Liskov {
	public static void main(String[] args) {
		System.out.println("Nothing much to do now");
	}
}
