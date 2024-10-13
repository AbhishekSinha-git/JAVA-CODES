package assignment_5_part_2;

public class NormalEmployee extends Employee
{
	@Override
	public void salaryCalculation() 
	{
		double bw = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) * 0.45;
		setBasicWage(bw);
		double hra = (bw * 0.40);
		setHra(hra);
		double ca = (1600 / getTotalWorkingDays()) * getPaidDays();
		setConveyanceAllowances(ca);
		double ma = (1250 / getTotalWorkingDays()) * getPaidDays();
		setMedicalAllowances(ma);
		double otherAllo = ((getGrosswage() / getTotalWorkingDays()) * getPaidDays()) - (bw + hra + ca + ma);
		setTotalEarning(bw + hra + ca + ma + otherAllo);
		System.out.println("Total Earnings: " + getTotalEarning() );
    }
}
