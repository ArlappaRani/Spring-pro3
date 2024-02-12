package com.spring.employee.SpringProject3;

public class Employee {
  String emp_name;
  int emp_Id;
  float emp_Salary;
  int emp_Age;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(String emp_name, int emp_Id, float emp_Salary, int emp_Age) {
	super();
	this.emp_name = emp_name;
	this.emp_Id = emp_Id;
	this.emp_Salary = emp_Salary;
	this.emp_Age = emp_Age;
	System.out.println("Using constructor");
}
public String getEmp_name() {
	return emp_name;
}
public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}
public int getEmp_Id() {
	return emp_Id;
}
public void setEmp_Id(int emp_Id) {
	this.emp_Id = emp_Id;
}
public float getEmp_Salary() {
	return emp_Salary;
}
public void setEmp_Salary(float emp_Salary) {
	this.emp_Salary = emp_Salary;
}
public int getEmp_Age() {
	return emp_Age;
}
public void setEmp_Age(int emp_Age) {
	this.emp_Age = emp_Age;
	System.out.println("Using setter methods");
}
@Override
public String toString() {
	return "Employee [emp_name=" + emp_name + ", emp_Id=" + emp_Id + ", emp_Salary=" + emp_Salary + ", emp_Age="
			+ emp_Age + "]";
}
  
  
  }
