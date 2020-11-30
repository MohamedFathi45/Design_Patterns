
public class StatePattern {
	public static void main(String[] args) {
		GumballMachine machine = new GumballMachine(6);
		machine.insertQuarter();
		machine.turnCrank();
		machine.turnCrank();
		machine.ejectQuarter();
	}
}
