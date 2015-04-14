package by.amushinsky.action;

import java.util.List;

import by.amushinsky.service.DataBase;
import by.amushinsky.service.Department;
import by.amushinsky.service.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class DelFormAction extends ActionSupport {
	
	private int empId;
	private Employee employee;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String execute()
	{
		employee = DataBase.access.getEmployee(empId);
		return SUCCESS;
	}
}
