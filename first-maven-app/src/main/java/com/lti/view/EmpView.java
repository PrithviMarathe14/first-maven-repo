package com.lti.view;

import com.lti.model.Employee;

public class EmpView {
 public static void main(String[] args){
	 Employee emp=new Employee();
	 emp.setEmpId(103);
	 emp.setEmpName("Ramu");
	 System.out.println("id"+emp.getEmpId());
	 System.out.println("name"+emp.getEmpName());
	 
			 
 }
}
