package by.amushinsky.action;

import by.amushinsky.service.DataBase;
import by.amushinsky.service.Department;
import by.amushinsky.service.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport{
	
	private int empId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String execute()
	{	
		DataBase.access.deleteEmployee(empId);
		return SUCCESS;
	}
}
