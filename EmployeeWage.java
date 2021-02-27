import java.util.ArrayList;
import java.util.List;

class EmployeeWage implements ITCompanyWage
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2; 
	
	private int numOfCompany=0;
	private List<CompanyEmpWage> companyEmpWageList;
	
//created default constructor
	public EmployeeWage() { 
		companyEmpWageList=new ArrayList<>();
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


	







