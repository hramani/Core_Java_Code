import java.util.Scanner;
/*
 * Create a class Employee.java with attributes empNo, empName, address, State,
zipCode, phone, designation (manager, lead, analyst) , experienceinYears,
emailAddress, basic, hra, bonus (% of basic). Choose appropriate data types and
create a constructer, getters &amp; setters for the attributes. Also create a method to
return the total salary (basic + hra + (bonus/100)*basic)
 */
public class Employee_7 {
	
	
	public static void main(String args[])
	{
		Employee empObject = new Employee();
		empObject.setBasic(5000);
		empObject.setBonus(500);
		empObject.setHra(10);
		double salary = empObject.totalSalary();
		System.out.println("Total salary is:"+salary);
		
	}

}

class Employee
{
	int empNo,zipCode,phone,experienceinYears;
	double hra,bonus,basic;
	String empName,address,state,designation,emailAddress;
	double salary=0;
	public double totalSalary()
	{
		salary = (basic + hra + (bonus/100)*basic);
		return salary;
	}
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	
	
}