package design;
/*
 * SOLID Principles 
 * Courtesy https://www.youtube.com/watch?v=hCsqBIyT1pI&list=PLRnuLZZ5D0Kydj14q181Oxwsp7_8PvquY&index=2
 * 
 * 1. S - Single responsibility principle , Once class one responsibility
 * Sachin Tendulkar plays cricket, example from the above video :)
 * 2. O - Open for Extension Closed for modification
 * Better to have Interfaces, even if some new functionality comes in future the same
 * interface can be implemented by a new Class handling the new functionality without
 * effecting earlier written code
 * 3. L - Liskov's substitution principal
 * Explained in a separate example Liscov.java
 * 4. I - Interface Segregation Principle, Any client should not be forced to implement 
 * any Interface which is irrelevant to it
 * 5. D - Dependency inversion Principal , The responsibilty of creating dependent object
 *  should be outsourced to that of consuming class
 *  here Booking class should not be bothered about creating respective objects  
 */
class Booking
{
	iPayment ipay;
	Member m1;
	
	Booking(Member m1, iPayment ipay)
	{
		this.m1 = m1;
		this.ipay = ipay;
	}
	
	void savePaymentDetails ()
	{
		ipay.savePaymentDetails();
	}
}

class Member 
{
	int id;
	String name;
	
	Member(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

interface iPayment {
	void savePaymentDetails();
}

interface iCardPayment {
	void saveCardDetails();
}

class cashPayment implements iPayment {
	public void savePaymentDetails()
	{
		System.out.println("Calling savePaymentDetails for cashPayment");
	}
}

class cardPayment implements iPayment, iCardPayment {
	public void savePaymentDetails()
	{
		System.out.println("Calling savePaymentDetails for cardPayment");
	}
	public void saveCardDetails()
	{
		System.out.println("Calling saveCardDetails for cardPayment");
	}
}

public class Solid {
	public static void main(String[] args)
	{
		// 5th Principal, object creation is handled here , rather than in Booking class
		Booking b1 = new Booking(new Member(1, "Alpha"), new cashPayment());
		Booking b2 = new Booking(new Member(2, "Beta"), new cardPayment());
		b1.savePaymentDetails();
		b2.savePaymentDetails();
	}

}
