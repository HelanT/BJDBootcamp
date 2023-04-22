
public class Calculation {

	int fno = 100;
	int sno = 200;
	int result = fno + sno;
	int result1 = fno - sno;

	void add() {
		System.out.println("Addition of Two numbers" + result);

	}

	void sub() {
		System.out.println("Subtraction of Two numbers" + result1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculation c = new Calculation();
		c.add();
		c.sub();

	}

}
