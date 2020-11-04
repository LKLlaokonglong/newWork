
public class Income {

	public static double income;

	public Income(double income) {
		this.income = income;
	}

	public  static double getTax() {
		return (income*0.1); // 税率10%
	}

}
