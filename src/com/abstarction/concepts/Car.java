package src.com.abstarction.concepts;

public interface Car {
	// We can achieve 100% abstraction using Interface
	// Always define only abstract methods
	// No need to write abstract before methods as well
	// Can't create object of Interface
	// Only final and static variables we can define 
	// Here we don't need to write final as well it would be by default final and static
	// Can not create static prototype method b'coz we can't override static methods
	// From JDK 1.8 we can have static methods with method body
	//
	
	
	int wheels = 4;
	
	public void start();
	public void stop();
	public void refuel();
	
	// We can not override the static method.. and calling can be done by static way i.e. by class name
	public static void services() {
		System.out.println("Static method");
	}
	
	// We can't override default method as well .. It can be accessed by creating child class object
	default void internship() {
		System.out.println(" Internship method");
	}
}
