package assignment2_inheritance;

class InsurancePlan {
	private String planID;
	private String planName;
	private int coverageAmount;

	public InsurancePlan(String planID, String planName, int coverageAmount) {
		this.planID = planID;
		this.planName = planName;
		this.coverageAmount = coverageAmount;
	}

	public InsurancePlan() {
		this("HI45695", "Health", 2000000);
		System.out.println("PlanID: " + planID);
		System.out.println("planName: " + planName);
		System.out.println("CoverageAmount: " + coverageAmount);
	}

}

class HealthInsurance extends InsurancePlan {
	int deductibleAmount = 20000;

	public HealthInsurance() {
		System.out.println("DeductibleAmount " + deductibleAmount);
	}
}

public class Asg2pgm20 {
	public static void main(String[] args) {
		HealthInsurance hin = new HealthInsurance();
	}
}
