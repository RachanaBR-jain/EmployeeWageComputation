class EmployeeWage
{
	public static void main(String[] args) {
		EmployeeCheck.computeEmpWage("DMart",20,20,100);
		EmployeeCheck.computeEmpWage("VishalMart",30,25,140);

	}
}
abstract  class EmployeeWage1 {
    abstract void computeEmpWage(String company,int empRatePerHour ,int  
numOfWorkingDaysS,int maxHoursInMonth); 	
}

class EmployeeCheck extends EmployeeWage
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;  
	//static method must be called only by class name , be cant craete object of static method
	public static int computeEmpWage(String company,int empRatePerHour ,int  numOfWorkingDaysS,int maxHoursInMonth )
	{	
		int empHrs=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=maxHoursInMonth && totalWorkingDays < numOfWorkingDaysS )
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck) {
				case IS_FULL_TIME:	
							System.out.println("employee is Present on day"+totalWorkingDays);
							empHrs=8;
							break;
				case IS_PART_TIME:
							System.out.println("employee is Part-time Employee on day"+totalWorkingDays);
							empHrs=4;
							break;
				default:
						System.out.println("employee is Absent on day"+totalWorkingDays);
						empHrs=0;	
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day: "+totalWorkingDays+" , Emp Hrs: "+totalEmpHrs);
		}
		totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("___________________");
		System.out.println("Total Employee Wage for Company:"+company+"is"+totalEmpWage);
		return totalEmpWage;
	}
}







