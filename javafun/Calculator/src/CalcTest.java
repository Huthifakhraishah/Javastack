
public class CalcTest {

	public static void main(String[] args) {
		Calc r= new Calc();
		r.setNumber1(5);
		r.setOpration('*');
		r.result(5);
		r.setOpration('*');
		r.result(2);
		r.setOpration('-');
		System.out.println(r.result(2));
		

	}

}
