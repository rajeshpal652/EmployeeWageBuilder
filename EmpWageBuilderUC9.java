package com.bl.empwagebuilder;
/*
 * @Author: Rajesh Pal
 * Saving the wage for each company.
 */

public class EmpWageBuilderUC9 {
	private final int partTime = 0;
	private final int fullTime = 1;
	private final String company;

	private final int empPerHrRate;
	private final int numOfWorkingDay;
	private final int maxHrsInMonth;
	private int totalEmpWage;

	/*
	 * constructor to set values for all final variables
	 */
	public EmpWageBuilderUC9(String company, int empPerHrRate, int numOfWorkingDay, int maxHrsInMonth) {
		this.company = company;
		this.empPerHrRate = empPerHrRate;
		this.numOfWorkingDay = numOfWorkingDay;
		this.maxHrsInMonth = maxHrsInMonth;
	}
	
	public void computeEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		/*
		 * checking part time and full time by using switch case calculating total wage
		 */
		while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < numOfWorkingDay) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case partTime:
				empHrs = 4;
				break;
			case fullTime:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp hrs :   " + empHrs);
		}
		totalEmpWage = totalEmpHrs * empPerHrRate;
	}

	@Override
	public String toString() {
		return "company= " + company + " |" + " totalEmpWage= " + totalEmpWage;
	}
	
	/*
	 * passing parameters to constructor & calling computeWage method to display output
	 */
	public static void main(String[] args) {
		System.out.println("------Welcome to employee wage computation program-----------");
		System.out.println("===============================================================");
		System.out.println();
		EmpWageBuilderUC9 tCS = new EmpWageBuilderUC9("TCS", 20, 10, 100);
		EmpWageBuilderUC9 vMart = new EmpWageBuilderUC9("VMart", 25, 15, 200);
		tCS.computeEmpWage();
		System.out.println("---------------------------------------");
		System.out.println(tCS);
		System.out.println("---------------------------------------");
		vMart.computeEmpWage();
		System.out.println("---------------------------------------");
		System.out.println(vMart);
		System.out.println("---------------------------------------");
	}
}
