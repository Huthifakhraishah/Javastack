
public class BankaccountTest {

	public static void main(String[] args) {
		Bankaccount m=new Bankaccount();
		m.setCheckingBalance(1000);
		m.withCheckingBalance(200);
		System.out.println(m.totalAmount());
		Bankaccount y=new Bankaccount();
		y.setSavingBalance(1800);
		y.withSavingBalance(300);
		System.out.println(m.totalAmount());

	}

}
