package by.amushinsky.action;

import by.amushinsky.service.DataBase;
import by.amushinsky.service.Employee;

import com.opensymphony.xwork2.ActionSupport;

public class EditAction extends ActionSupport{
	
	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String execute(){
		Employee editedEmployee = DataBase.access.getEmployee(employee.getId());
		editedEmployee.setFname(employee.getFname());
		editedEmployee.setLname(employee.getLname());
		editedEmployee.setPname(employee.getPname());
		editedEmployee.setSalary(employee.getSalary());
		DataBase.access.updateEmployee(editedEmployee);
		return SUCCESS;
	}

	public void validate()
	{
		if(employee.getLname().length() == 0)
			addFieldError("employee.lname", "�� ������� �������!");
		if(employee.getFname().length() == 0)
			addFieldError("employee.fname", "�� ������� ���!");
		if(employee.getPname().length() == 0)
			addFieldError("employee.pname", "�� ������� ��������!");
		if(employee.getSalary() == 0)
			addFieldError("employee.salary", "�������� �� ����� ��������� ����!");
		if(employee.getSalary() < 0)
			addFieldError("employee.salary", "������� �� ����� ���� �������������!");
	}
	
}
