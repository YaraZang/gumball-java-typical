

public class Main {

	public static void main(String[] args) {
		superGumball gumballMachine1 = new GumballMachine(5);
		test(gumballMachine1);
		superGumball gumballMachine2 = new GumballMachine2(5);
		test(gumballMachine2);
		superGumball gumballMachine3 = new GumballMachine3(5);
		test(gumballMachine3);
	}
	
	public static void test(superGumball m) {
		System.out.println("********************");
		System.out.println(m);

		m.insertQuarter( 25 );
		m.turnCrank();

		System.out.println(m);

		m.insertQuarter( 25 );
		m.turnCrank();
		m.insertQuarter( 25 );
		m.turnCrank();

		System.out.println(m);
		
		m.insertQuarter( 10 );
		m.turnCrank();
		m.insertQuarter( 10 );
		m.turnCrank();
		m.insertQuarter( 10 );
		m.turnCrank();
		m.insertQuarter( 5 );
		m.turnCrank();
		System.out.println(m);
	}
	
}
