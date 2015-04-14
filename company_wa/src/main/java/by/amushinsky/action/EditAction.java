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
			addFieldError("employee.lname", "Не указана фамилия!");
		if(employee.getFname().length() == 0)
			addFieldError("employee.fname", "Не указано имя!");
		if(employee.getPname().length() == 0)
			addFieldError("employee.pname", "Не указано отчество!");
		if(employee.getSalary() == 0)
			addFieldError("employee.salary", "Зарплата не может ровняться нулю!");
		if(employee.getSalary() < 0)
			addFieldError("employee.salary", "Зарплат не может быть отрицательной!");
	}
	
}
