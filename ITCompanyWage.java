public interface ITCompanyWage {
	public void addCompanyWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);
	
}

