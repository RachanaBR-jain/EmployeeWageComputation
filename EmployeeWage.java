import java.util.ArrayList;
import java.util.List;

class EmployeeWage implements ITCompanyWage
{
	public static final int IS_FULL_TIME=1;
//<<<<<<< UC9-storeTheCompanyWage
	public static final int IS_PART_TIME=2; 
	
	private int numOfCompany=0;
	private List<CompanyEmpWage> companyEmpWageList;
	
//<<<<<<< UC10-EmpWageOfMulipleCompany
//created default constructor
	public EmployeeWage() { 
//<<<<<<< U12-usingListToManageMultipleCompant
		companyEmpWageList=new ArrayList<>();

	companyEmpWageArray=new CompanyEmpWage[5]; //array of 5 (0,1,2,3,4)

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
//>>>>>>> master
//>>>>>>> master
	}
@Override
	public void addCompanyWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth){
	    CompanyEmpWage companyEmpWage=new  CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,maxHoursPerMonth);
	    companyEmpWageList.add(companyEmpWage);
		numOfCompany++; //1,2,3,4
	} 
@Override
	public void computeEmpWage() {
	for(int i=0;i<companyEmpWageList.size();i++)
	{
	    CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage)); //this will call parameterised computeEmpWage and return co
		System.out.println(companyEmpWage);
		System.out.print(" "); 
		 System.out.println("___________________");	 
	}
	}
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		
		while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays )
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
	 System.out.println("___________________");	 
	 return totalEmpHrs * companyEmpWage.empRatePerHour;
	 
   }
   public static void main(String[] args) {
   System.out.println("Welcome to Employee Wage Computation Program with Interface using List ");
   ITCompanyWage empwage=new EmployeeWage();
   empwage.addCompanyWage("Dmart",20,10,50);
   empwage.addCompanyWage("Vishal_mart",30,20,40);
   empwage.addCompanyWage("Relaience",30,20,60);
   empwage.computeEmpWage();
		
  }

}


	







