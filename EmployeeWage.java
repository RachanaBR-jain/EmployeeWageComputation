abstract class EmployeeWage1 {
    abstract void attendance(); 	
}

class EmployeeCheck extends EmployeeWage
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	
	public void attendance() {
	int empHrs=0;
	int empWage=0;
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




