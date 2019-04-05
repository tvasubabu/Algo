package design;

// Incompatible Interface 1
interface myEnumerator {
	void moveNext();
	void hasNext();
}

// Incompatible interface 2
interface myIterator {
	void moveNextElement();
	void hasNextElement();
	void Remove();
}

// Adaptee Class
class Adaptee implements myEnumerator {
	public void moveNext()
	{
		System.out.println("Calling moveNext from myEnumerator");
	}
	public void hasNext()
	{
		System.out.println("Calling hasNext from myEnumerator");
	}	
}

// Adapter Class
class myAdapter implements myIterator { 
	myEnumerator m1;

	myAdapter() 
	{
		this.m1 = new Adaptee();
	}
	
	public void moveNextElement()
	{
		System.out.println("Calling moveNextElement from myAdaptor");
		m1.moveNext();
	}
	public void hasNextElement()
	{
		System.out.println("Calling hasNextElement from myAdater");
		m1.hasNext();
	}	
	public void Remove()
	{
		System.out.println("Calling Remove from myAdater");
	}
}

public class Adapter {
	public static void main(String[] args) {
		myAdapter obj1 = new myAdapter();
		obj1.hasNextElement();
		obj1.moveNextElement();		
	}	
}
