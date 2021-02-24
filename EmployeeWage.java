

class EmployeeWage
{
	public static void main(String[] args) {
		EmployeeCheck employee=new EmployeeCheck();
		employee.attendance();
	}
}
abstract  class EmployeeWage1 {
    abstract void attendance(); 	
}

class EmployeeCheck extends EmployeeWage
{
	public static final int IS_FULL_TIME=1;
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


	}
		System.out.println("___________________");
		System.out.println("Total Employee Wage="+totalEmpWage);
	}
}







