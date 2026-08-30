class Address {
	String city;
	String state;

	Address(String city, String state) {
	this.city = city;
	this.state = state;

	}
}

class Student {

	String name;
	Address loco; 
	
	Student(String name, Address loco) {
	this.name = name;
	this.loco = loco;
	
	}
	
	void desk_0() {
	
	System.out.println("Name: " + name);
	System.out.println("City: " + loco.city);
	System.out.println("State: " + loco.state);
	
	}

}

public class Accessing_Aggregated_Object {
	public static void main(String [] args) {

	Address a1 = new Address("Pune", "Maharashtra");

	Student s1 = new Student("Vedant",a1);

	s1.desk_0();

	}

}

// Output // 

Name: Vedant
City: Pune
State: Maharashtra