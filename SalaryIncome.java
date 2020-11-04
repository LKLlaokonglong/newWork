
public class SalaryIncome extends Income {

	public SalaryIncome(double income) {
		super(income);
	}

	public static double getTax() {
		if (income <= 5000) {
			return 0;
		}
		else{
			return ((income - 5000) * 0.2);
		}
	}
}
