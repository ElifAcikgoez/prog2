package uebung07;

public class SchokoladeMain
{

	public static void main(String[] args) throws NichtGenugSchokoladeException
	{
		Schokolade a = new Schokolade(1);
		
		try {
		a.berechneStueckProPeron(15);
		
		}
		catch ( ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			
		}

	}

}
