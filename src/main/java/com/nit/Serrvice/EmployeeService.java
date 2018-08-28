package com.nit.Serrvice;

import java.util.ArrayList;
import java.util.List;

import com.nit.Beans.Employee;



public class EmployeeService {

	 List<Employee> list = new ArrayList<>();

	public List<Employee> getAllEmployees() {
		Employee e1 = new Employee(101, "Sai", "SE");
		Employee e2 = new Employee(102, "kiran", "SSE");
		list.add(e1);
		list.add(e2);
		return list;
	}

	public List<Employee> addEmployee(Employee emp) {
		emp = new Employee(103, "Raju", "DB");
		list.add(emp);
		return list;

	}

	public Employee updateEmployee(int empno, Employee emp) {
		if (empno == 101 || empno == 102) {
			emp.setEmpno(empno);
			emp.setEmpname("Hari");
			emp.setEmpdesig("TL");
		}
		return emp;
	}

	public void deleteEmployee(int empno) {
		// if(empno==101 || empno ==102 ){
		list.remove(empno);

	}

}
