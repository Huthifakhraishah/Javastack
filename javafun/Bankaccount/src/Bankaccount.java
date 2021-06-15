import java.util.Random;
public class Bankaccount {
	private String accountnum;
	private double checkingBalance;
	private double savingBalance;
	public static int accounts=0;
	public static int totalamount=0;
	private String randomDigit() {
		Random m=new Random();
		for(int i=0 ; i < 10 ; i++) {
			accountnum+=m.nextInt(10);
		}
		return accountnum;
	}
	public Bankaccount() {
		randomDigit();
		accounts++;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance += checkingBalance;
		totalamount+=checkingBalance;
		
	}
	public void withCheckingBalance(double checkingBalance) {
		if(this.checkingBalance -totalamount >= 0) {
			totalamount-=checkingBalance;	
		}
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance += savingBalance;
		totalamount+=savingBalance;
	}
	public void withSavingBalance(double savingBalance) {
		if(this.savingBalance -totalamount >= 0) {
			totalamount-=savingBalance;
		}
	}
	public int totalAmount() {
		return totalamount;
	}

	
}
