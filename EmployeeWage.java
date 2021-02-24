//Welcome to EmployeeWageProgram
abstract class EmployeeWage1 {
    abstract void attendance(); 	
}

class EmployeeCheck extends EmployeeWage
{
	public static final int IS_FULL_TIME=1;
	public void attendance() {
		
	double empCheck=Math.floor(Math.random()*10)%2;
	if(empCheck== IS_FULL_TIME )
		System.out.println("Employee is Present");
	else
		System.out.println("Employee is Absent");	
     }
	
}

class EmployeeWage
{
	public static void main(String[] args) {
		EmployeeCheck employee=new EmployeeCheck();
		employee.attendance();
	}
}






