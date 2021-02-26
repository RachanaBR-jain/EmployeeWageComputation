abstract  class EmployeeWage1 {
    abstract void computeEmpWage(); 	
}

class EmployeeCheck extends EmployeeWage1
{ 
	public static final int IS_FULL_TIME=1;
//<<<<<<< UC9-storeTheCompanyWage
	public static final int IS_PART_TIME=2; 
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	
	
	
   public EmployeeCheck(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		super();
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
//=======
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public void attendance() {
	int empHrs=0;
	int empWage=0;
//<<<<<<< UC5-WageForMonth
	int totalEmpWage=0;
	
	for(int day=1;day<=NUM_OF_WORKING_DAYS;day++)
	{
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch(empCheck) {
			case IS_FULL_TIME:	
						System.out.println("employee is Present on day"+day);
						empHrs=8;
						break;
			case IS_PART_TIME:
						System.out.println("employee is Part-time Employee on day"+day);
						empHrs=4;
						break;
			default:
					System.out.println("employee is Absent on day"+day);
					empHrs=0;	
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		totalEmpWage+=empWage;
		System.out.println("Emp Wage:"+empWage);
//<<<<<<< UC4-usingSwitch
	int empCheck=(int)Math.floor(Math.random()*10)%3;
	switch(empCheck) {
		case IS_FULL_TIME:	
					System.out.println("employee is Present");
					empHrs=8;
					break;
		case IS_PART_TIME:
					System.out.println("employee is Part-time Employee");
					empHrs=4;
					break;
		default:
				System.out.println("employee is Absent");
				empHrs=0;	

	double empCheck=Math.floor(Math.random()*10)%2;
	if(empCheck== IS_FULL_TIME )
	{
		System.out.println("Employee is Present");
		empHrs=8;	
	}
	else if (empCheck== IS_PART_TIME )
	{
//<<<<<<< UC3-addedPartTime
		System.out.println("Employee is Part-Time Worker");	
	    empHrs=4;

		System.out.println("Employee is Absent");	
	        empHrs=0;
//>>>>>>> master
	}
	else
	{
		System.out.println("employee is Absent");
		empHrs=0;	


//>>>>>>> master
	}



//implemetation of abstract method 
	public  void computeEmpWage()
	{	
		int empHrs=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays )
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
		totalEmpWage=totalEmpHrs * empRatePerHour;
		System.out.println("___________________");
		System.out.println("Total Employee Wage for Company: "+company+" is "+totalEmpWage);
	}
}
class EmployeeWage
{
	public static void main(String[] args) {
		EmployeeCheck dmart= new EmployeeCheck("DMart",20,20,100);
		EmployeeCheck vishal_mart= new EmployeeCheck("VishalMart",30,25,140);
		dmart.computeEmpWage();
		System.out.println("***************************************");
		vishal_mart.computeEmpWage();

	}
}







