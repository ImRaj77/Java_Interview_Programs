package src.com.abstarction.concepts;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFCBank hb = new HDFCBank();
		hb.credit();hb.debit();
		hb.loan();
		hb.funds();
		
		System.out.println("**********");
		
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
		
	}
}
