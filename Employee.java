class Employee
{
	public static void main(String args[])
	{
		int basic_salary=25000,months=12;
		double pf,tax,gross_salary,ta,da,hra,total_salary,annual_salary;
		ta=15.0/100*basic_salary;
		da=12.0/100*basic_salary;
		hra=19.0/100*basic_salary;
		total_salary=basic_salary+ta+hra+da;
		if(total_salary>40000)
		{
			pf=11.0/100*basic_salary;
			tax=5.0/100*basic_salary;
		}
		else
		{
			pf=7.0/100*basic_salary;
			tax=2.5/100*basic_salary;
		}
		gross_salary=total_salary-pf-tax;
		System.out.println("gross salary " + gross_salary);
		annual_salary=gross_salary*months;
		System.out.println("Annual Package  " + annual_salary);
	}
}