abstract class EmployeeWage1 {
    abstract void attendance(); 	
}

class EmployeeCheck extends EmployeeWage
{
	public static final int IS_FULL_TIME=1;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public void attendance() {
	int empHrs=0;
	int empWage=0;
	double empCheck=Math.floor(Math.random()*10)%2;
	if(empCheck== IS_FULL_TIME )
	{
		System.out.println("Employee is Present");
		empHrs=8;	
	}
	else
	{
		System.out.println("Employee is Absent");	
	        empHrs=0;
	}
	empWage=empHrs*EMP_RATE_PER_HOUR;
	System.out.println("Emp Wage:"+empWage);
    }
}

class EmployeeWage
{
	public static void main(String[] args) {
		EmployeeCheck employee=new EmployeeCheck();
		employee.attendance();
	}
}




