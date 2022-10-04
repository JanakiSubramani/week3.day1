package override;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("new overridden deposit amount interest rate is 1%");

	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
		
	}
}
